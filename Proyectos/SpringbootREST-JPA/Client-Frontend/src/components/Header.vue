<script setup lang="ts">
import { onMounted, watch } from "vue";
import { useRoute } from "vue-router";
import { useI18n } from "vue-i18n";

const { t, locale } = useI18n();

const route = useRoute();

let navbarLinksWithSectionOffset: NavbarLinkWithSectionOffset[] = [];

type NavbarLinkWithSectionOffset = {
  navbarLink: HTMLDivElement;
  sectionDistanceFromTop: number;
};

function setupMobileNavbarToggle(): void {
  const mobileNavToggle: HTMLDivElement | null =
    document.querySelector(".mobile-nav-toggle");
  if (!mobileNavToggle) return;

  mobileNavToggle.addEventListener("click", (): void => {
    const navbarMobile: HTMLDivElement | null =
      document.querySelector("#navbar");
    if (!navbarMobile) return;

    navbarMobile.classList.toggle("navbar-mobile");
    mobileNavToggle.classList.toggle("bi-list");
    mobileNavToggle.classList.toggle("bi-x");
  });
}

function updateNavbarLinks(): void {
  let foundFirst: boolean = false;
  navbarLinksWithSectionOffset.forEach((navbarLinkWithSectionOffset): void => {
    if (
      window.scrollY > navbarLinkWithSectionOffset.sectionDistanceFromTop &&
      !foundFirst
    ) {
      navbarLinkWithSectionOffset.navbarLink.classList.add("active");
      foundFirst = true;
    } else {
      navbarLinkWithSectionOffset.navbarLink.classList.remove("active");
    }
  });
}

function getNavbarLinksWithSectionOffset(): void {
  const navbarLinks: NodeListOf<HTMLDivElement> =
    document.querySelectorAll(".nav-link.scrollto");

  navbarLinks.forEach((navbarLink): void => {
    const navbarLinkHref: string | null = navbarLink.getAttribute("href");
    if (!navbarLinkHref) return;

    const sectionInWebpage: HTMLDivElement | null = document.querySelector(
      navbarLinkHref.replace("\/", "")
    );
    if (!sectionInWebpage) return;

    navbarLinksWithSectionOffset.push({
      navbarLink: navbarLink,
      sectionDistanceFromTop: sectionInWebpage?.offsetTop - 100
    });
  });

  navbarLinksWithSectionOffset.sort((obj1, obj2): number => {
    if (obj1.sectionDistanceFromTop < obj2.sectionDistanceFromTop) return 1;
    return -1;
  });
}

function closeMobileNavbar(): void {
  const closeMobileNavbarButton: HTMLElement | null = document.querySelector(
    "i.bi.mobile-nav-toggle.bi-x"
  );
  if (!closeMobileNavbarButton) return;
  closeMobileNavbarButton.click();
}

watch(locale, (): void => {
  localStorage.setItem("lang", locale.value);
});

onMounted((): void => {
  getNavbarLinksWithSectionOffset();
  setupMobileNavbarToggle();

  if (route.path !== "/") return;

  window.addEventListener("load", updateNavbarLinks);
  document.addEventListener("scroll", updateNavbarLinks);
});
</script>

<template>
  <header id="header" class="d-flex align-items-center header">
    <div class="container d-flex align-items-center">
      <div class="logo me-auto">
        <router-link to="/">
          {{ t("headerTitle.title") }}
        </router-link>
      </div>

      <nav id="navbar" class="navbar">
        <ul>
          <li>
            <router-link
              class="nav-link scrollto"
              @click="closeMobileNavbar"
              :to="{ path: '/', hash: '#home' }"
              >{{ t("navbarLinks.link1") }}</router-link
            >
          </li>

          <li>
            <router-link
              class="nav-link scrollto"
              :class="{ active: route.path.startsWith('/academy-form') }"
              @click="closeMobileNavbar"
              to="/academy-form"
              >{{ t("navbarLinks.link2") }}</router-link
            >
          </li>
          <li>
            <select v-model="locale" id="lang">
              <option value="en" selected>English</option>
              <option value="es">Español</option>
            </select>
          </li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav>
    </div>
  </header>
</template>

<style scoped lang="scss">
/*--------------------------------------------------------------
# Header
--------------------------------------------------------------*/
.header {
  height: 70px;
  background: #fff;
  z-index: 997;
  box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.06);
  position: sticky;
  top: 0;
}

.header .logo {
  font-size: 24px;
  font-weight: 500;
  letter-spacing: 1px;
  margin: 0;
  padding: 0;
  line-height: 1;
  display: inline-block;
  font-family: "Poppins", sans-serif;

  a {
    color: $colorPrimary;
    text-decoration: none;

    &:hover {
      color: $colorTertiary;
    }
  }
}

.scrolled-offset {
  margin-top: 70px;
}

/*--------------------------------------------------------------
# Navigation Menu
--------------------------------------------------------------*/
/**
* Desktop Navigation
*/
.navbar ul {
  margin: 0;
  padding: 0;
  display: flex;
  list-style: none;
  align-items: center;
}

.navbar li {
  position: relative;
}

.navbar > ul > li {
  white-space: nowrap;
}

.navbar a,
.navbar a:focus {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 14px 20px;
  font-size: 16px;
  font-weight: 500;
  color: rgba(0, 30, 56, 0.781);
  white-space: nowrap;
  transition: 0.3s;
  position: relative;
}

.navbar .active,
.navbar a:hover {
  color: $colorTertiary;
}

.navbar > ul > li > a:before {
  content: "";
  position: absolute;
  width: 100%;
  height: 2px;
  bottom: 0;
  left: 0;
  background-color: $colorTertiary;
  visibility: hidden;
  transition: all 0.3s ease-in-out 0s;
  transform: scaleX(0);
  transition: all 0.3s ease-in-out 0s;
}

.navbar a:hover:before,
.navbar li:hover > a:before,
.navbar .active:before {
  visibility: visible;
  transform: scaleX(0.7);
}

.navbar select {
  border: none;
  background: transparent;
  color: rgba(0, 30, 56, 0.781);
  font-size: 16px;
  font-weight: 500;
  padding: 14px 20px;
  outline: none;
  cursor: pointer;
}

/**
* Mobile Navigation
*/
.mobile-nav-toggle {
  color: #1f3548;
  font-size: 28px;
  cursor: pointer;
  display: none;
  line-height: 0;
  transition: 0.5s;
}

.mobile-nav-toggle.bi-x {
  color: #fff;
}

@media (max-width: 991px) {
  .mobile-nav-toggle {
    display: block;
  }

  .navbar ul {
    display: none;
  }
}

.navbar-mobile {
  position: fixed;
  overflow: hidden;
  top: 0;
  right: 0;
  left: 0;
  bottom: 0;
  background: rgba(0, 0, 0, 0.9);
  transition: 0.3s;
  z-index: 998;
}

.navbar-mobile .mobile-nav-toggle {
  position: absolute;
  top: 15px;
  right: 15px;
}

.navbar-mobile ul {
  display: block;
  position: absolute;
  top: 55px;
  right: 15px;
  bottom: 15px;
  left: 15px;
  padding: 10px 0;
  background-color: #fff;
  overflow-y: auto;
  transition: 0.3s;
}

.navbar-mobile a,
.navbar-mobile a:focus {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 12px 20px;
  font-size: 16px;
  font-weight: 500;
  color: rgba(0, 0, 0, 0.7);
  white-space: nowrap;
  transition: 0.3s;
}

.navbar-mobile a:hover,
.navbar-mobile li:hover > a {
  color: #00182c;
  font-weight: 500;
}

.navbar-mobile a:hover:before,
.navbar-mobile li:hover > a:before,
.navbar-mobile .active:before {
  visibility: hidden;
}
</style>
