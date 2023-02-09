<script setup lang="ts">
import TopBar from "@/components/TopBar.vue";
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
import { onMounted, reactive, computed, ref } from "vue";
import type { ComputedRef, Ref } from "vue";
import type { AcademyFormData } from "@/types/types";
import instance from "@/axios/index";
import { Toast } from "bootstrap";
import { useI18n } from "vue-i18n";
import intlTelInput from "intl-tel-input";

const { t } = useI18n();

const toastDiv: Ref<HTMLDivElement | null> = ref(null);
const toastBody: Ref<HTMLDivElement | null> = ref(null);

const acceptedPrivacy: Ref<boolean> = ref(false);
const academyData: AcademyFormData = reactive(emptyAcademyFormData());

function emptyAcademyFormData(): AcademyFormData {
  return {
    email: "",
    name: "",
    phone: "",
    githubUrl: "",
    career: "",
    role: 0,
    roleOther: "",
    skills: "",
    englishLevel: -1,
    otherLanguages: "",
    stateCity: ""
  };
}

/********************************
 * Library to use International Phone Numbers
 ********************************/
let phoneInputField: HTMLInputElement | null;
let countryData: any;
let validPhoneNumber: boolean = false;

function setupPhoneNumberLibrary(): void {
  phoneInputField = document.querySelector("#phone");

  const phoneInput = intlTelInput(phoneInputField, {
    initialCountry: "mx",
    separateDialCode: true,
    preferredCountries: ["mx", "us"],
    utilsScript:
      "https://cdnjs.cloudflare.com/ajax/libs/intl-tel-input/17.0.8/js/utils.js"
  });

  countryData = phoneInput.getSelectedCountryData();

  let isValidNumber = function (): boolean {
    return phoneInput.isValidNumber();
  };

  var handleChange = function () {
    if (isValidNumber()) {
      if (!phoneInputField) return;
      phoneInputField.style.borderColor = "#16df7e";
      validPhoneNumber = true;
    } else {
      if (!phoneInputField) return;
      phoneInputField.style.borderColor = "red";
      validPhoneNumber = false;
    }
  };

  // listen to "keyup", but also "change" to update when the user selects a country
  if (!phoneInputField) return;
  phoneInputField.addEventListener("change", handleChange);
  phoneInputField.addEventListener("keyup", handleChange);
}

/* Field validations */
const validEmail: ComputedRef<boolean> = computed((): boolean => {
  if (!academyData.email.includes("@")) return false;
  if (!academyData.email.match(/@.+\..+$/)) return false;

  return true;
});

const validName: ComputedRef<boolean> = computed((): boolean =>
  academyData.name.length ? true : false
);

const validPhone: ComputedRef<boolean> = computed((): boolean => {
  if (!academyData.phone.length) return true;
  if (!academyData.phone.match(/^[0-9]{10}$/)) return false;
  return true;
});

const validGitHubUrl: ComputedRef<boolean> = computed((): boolean => {
  if (!academyData.githubUrl.length) return true;
  if (!academyData.githubUrl.match(/github\.com\//)) return false;
  return true;
});

const validRole: ComputedRef<boolean> = computed((): boolean => {
  if (academyData.role == 0) return false;
  if (
    academyData.role == t("joinUsForm.options.roles.4") &&
    !academyData.roleOther.length
  )
    return false;
  return true;
});

const validEnglishLevel: ComputedRef<boolean> = computed((): boolean =>
  academyData.englishLevel != -1 ? true : false
);

const validAcademyFormData: ComputedRef<boolean> = computed((): boolean => {
  if (
    validName.value &&
    validEmail.value &&
    validPhone.value &&
    validGitHubUrl.value &&
    validEnglishLevel.value &&
    acceptedPrivacy.value
  )
    return true;
  return false;
});

/********************************
 * Send the form to the backend
 ********************************/
async function sendAcademyData(): Promise<void> {
  if (!toastDiv.value || !toastBody.value) return;

  const toast: Toast = new Toast(toastDiv.value);

  try {
    await instance.post("/academyApplications", academyData);

    toastDiv.value.classList.remove("text-bg-danger");
    toastDiv.value.classList.add("text-bg-success");

    toastBody.value.innerText = `Thanks you!. Information sent successfully`;

    Object.assign(academyData, emptyAcademyFormData());
  } catch {
    toastDiv.value.classList.remove("text-bg-success");
    toastDiv.value.classList.add("text-bg-danger");

    toastBody.value.innerText =
      "Something went wrong 😞. Please, try again later.";
  }

  toast.show();
}

/********************************
 * Setup the animations and the phone number library
 ********************************/
onMounted((): void => {
  setupPhoneNumberLibrary();
});
</script>

<template>
  <main>
    <!-- Toast -->
    <div class="toast-container position-fixed bottom-0 end-0 p-3">
      <div
        ref="toastDiv"
        class="toast"
        role="alert"
        aria-live="assertive"
        aria-atomic="true">
        <div class="toast-header">
          <button
            type="button"
            class="btn-close"
            data-bs-dismiss="toast"
            aria-label="Close"></button>
        </div>
        <div ref="toastBody" class="toast-body">
          Hello, world! This is a toast message.
        </div>
      </div>
    </div>

    <TopBar />
    <Header />

    <div class="form container">
      <h1 class="text-center m-5">{{ t("joinUsForm.title") }}</h1>

      <p>
        {{ t("joinUsForm.description") }}
      </p>

      <!-- Full name -->
      <label
        class="form-label required-input"
        :class="{ 'text-danger': !validName }"
        >{{ t("joinUsForm.questions.name") }}</label
      >
      <input
        type="email"
        class="form-control space-below"
        :class="{ 'border-danger': !validName }"
        v-model="academyData.name" />

      <!-- Email -->
      <label
        class="form-label required-input"
        :class="{ 'text-danger': !validEmail }"
        >{{ t("joinUsForm.questions.email") }}</label
      >
      <input
        type="email"
        class="form-control space-below"
        :class="{ 'border-danger': !validEmail }"
        v-model="academyData.email" />

      <!-- Phone -->
      <label
        class="form-label required-input"
        :class="{ 'text-danger': !validPhone }"
        id="phone-input-label"
        >{{ t("joinUsForm.questions.phone") }}</label
      >

      <input
        type="tel"
        name="phone"
        id="phone"
        class="form-control space-below"
        :class="{ 'border-danger': !validPhone }"
        v-model="academyData.phone"
        style="padding: 0.3rem 5.1rem 0.4rem 6rem"
        required />

      <br />
      <!-- State and city -->
      <label class="form-label" id="stateCity-input">{{
        t("joinUsForm.questions.stateCity")
      }}</label>
      <input
        type="string"
        class="form-control space-below"
        v-model="academyData.stateCity" />

      <!-- GitHub url -->
      <label class="form-label" :class="{ 'text-danger': !validGitHubUrl }">{{
        t("joinUsForm.questions.githubUrl")
      }}</label>
      <input
        type="string"
        class="form-control space-below"
        :class="{ 'border-danger': !validGitHubUrl }"
        v-model="academyData.githubUrl" />

      <!-- Career -->
      <label class="form-label">{{ t("joinUsForm.questions.career") }}</label>
      <input
        type="string"
        class="form-control space-below"
        v-model="academyData.career" />

      <!-- Role -->
      <label
        class="form-label required-input"
        :class="{ 'text-danger': !validRole }"
        >{{ t("joinUsForm.questions.role") }}</label
      >
      <select
        v-model="academyData.role"
        class="form-select space-below"
        :class="{ 'border-danger': !validRole }">
        <option :value="0" />
        <option :value="t('joinUsForm.options.roles.1')">
          {{ t("joinUsForm.options.roles.1") }}
        </option>
        <option :value="t('joinUsForm.options.roles.2')">
          {{ t("joinUsForm.options.roles.2") }}
        </option>
        <option :value="t('joinUsForm.options.roles.3')">
          {{ t("joinUsForm.options.roles.3") }}
        </option>
        <option :value="t('joinUsForm.options.roles.4')">
          {{ t("joinUsForm.options.roles.4") }}
        </option>
      </select>
      <Transition name="slide-fade">
        <div v-if="academyData.role == t('joinUsForm.options.roles.4')">
          <label
            class="form-label required-input"
            :class="{ 'text-danger': !validRole }"
            >{{ t("joinUsForm.questions.roleOther") }}</label
          >
          <input
            type="string"
            class="form-control space-below"
            :class="{ 'border-danger': !validRole }"
            v-model="academyData.roleOther" />
        </div>
      </Transition>

      <!-- Skills -->
      <label class="form-label">{{ t("joinUsForm.questions.skills") }}</label>
      <textarea
        type="text"
        class="form-control space-below"
        rows="5"
        v-model="academyData.skills" />

      <!-- English level -->
      <label
        class="form-label required-input"
        :class="{ 'text-danger': !validEnglishLevel }"
        >{{ t("joinUsForm.questions.englishLevel") }}</label
      >
      <select
        v-model="academyData.englishLevel"
        class="form-select space-below"
        :class="{ 'border-danger': !validEnglishLevel }">
        <option :value="-1" />
        <option :value="0">{{ t("joinUsForm.options.englishLevel.0") }}</option>
        <option :value="1">{{ t("joinUsForm.options.englishLevel.1") }}</option>
        <option :value="2">{{ t("joinUsForm.options.englishLevel.2") }}</option>
        <option :value="3">{{ t("joinUsForm.options.englishLevel.3") }}</option>
        <option :value="4">{{ t("joinUsForm.options.englishLevel.4") }}</option>
        <option :value="5">{{ t("joinUsForm.options.englishLevel.5") }}</option>
      </select>

      <!-- Languages -->
      <label class="form-label">{{
        t("joinUsForm.questions.otherLangs")
      }}</label>
      <textarea
        type="text"
        class="form-control space-below"
        rows="5"
        v-model="academyData.otherLanguages" />

      <div class="form-check">
        <input
          v-model="acceptedPrivacy"
          type="checkbox"
          class="form-check-input" />
        <label
          v-html="t('joinUsForm.privacyPoints.privacyPolicy')"
          class="form-check-label space-below" />
      </div>
    </div>

    <div class="row g-0 justify-content-center mb-5 mt-3">
      <div class="col-auto">
        <button
          @click="sendAcademyData"
          :disabled="!validAcademyFormData"
          :class="{ disabled: !validAcademyFormData }">
          {{ t("joinUsForm.buttonSubmit.text") }}<i class="bi bi-envelope" />
        </button>
      </div>
    </div>

    <Footer />
  </main>
</template>

<style scoped lang="scss">
$animationFast: 250ms;

.space-below {
  margin-bottom: $spacer;
}

.disabled {
  filter: opacity(0.5) !important;
}

.col-auto {
  button {
    background: $colorPrimary;
    border: 0;
    border-radius: 8px;
    padding: 10px 24px;
    color: #fff;
    transition: all 0.3s ease-in-out;
    border-radius: 4px;
    margin-top: 1.2rem;
  }

  button:hover {
    background: #293a58;
    transform: translateY(-2px);
    box-shadow: 0 3px 6px rgba(0, 0, 0, 0.16), 0 3px 6px rgba(0, 0, 0, 0.23);
    transition: all 0.3s ease-in-out;
  }

  button i {
    margin-left: 10px;
    font-size: 18px;
  }
}

.slide-fade-enter-active {
  transition: all $animationFast ease-out;
}

.slide-fade-leave-active {
  transition: all $animationFast cubic-bezier(1, 0.5, 0.8, 1);
}

.slide-fade-enter-from,
.slide-fade-leave-to {
  transform: translateX(20px);
  opacity: 0;
}

.required-input::before {
  content: "*";
  color: $danger;
  margin-right: 0.25rem;
}

#stateCity-input {
  margin-top: 0.8rem;
}

#phone-input-label {
  margin-right: 50rem;

  @media screen and (max-width: 768px) {
    margin-right: 0;
  }
  
}
</style>
