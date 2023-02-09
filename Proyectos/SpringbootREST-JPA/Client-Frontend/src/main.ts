import { createApp } from "vue";
import { createPinia } from "pinia";
import gsap from "gsap";
import { ScrollTrigger } from "gsap/ScrollTrigger";
import { createI18n } from "vue-i18n";

gsap.registerPlugin(ScrollTrigger);

import App from "./App.vue";
import router from "./router";

import translations from "@/i18n/i18n";

import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min.js";
import "bootstrap-icons/font/bootstrap-icons.css";
import "intl-tel-input/build/css/intlTelInput.css";


const i18n = createI18n({
    locale: "es",
    fallbackLocale: "es",
    legacy: false,
    messages: translations
});

const app = createApp(App);

app.use(createPinia());
app.use(router);
app.use(i18n);
app.mount("#app");
