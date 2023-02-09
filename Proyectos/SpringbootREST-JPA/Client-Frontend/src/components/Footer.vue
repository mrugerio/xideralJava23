<script setup lang="ts">
import { useI18n } from "vue-i18n";

const { t } = useI18n();
</script>

<template>
  <footer id="footer" class="footer">
    <div class="container footer-bottom clearfix">
      <div class="copyright">
        &copy; {{ t("footerSection.credits") }} <strong><span>Víctor Lavalle</span></strong
        >. {{ t("footerSection.copyRightSectionTitle") }}
      </div>
    </div>
  </footer>
</template>

<style scoped lang="scss">
.footer {
  background: #ffffff;
  font-size: 14px;

  .footer-bottom {
    z-index: 2;
    position: relative;
    border-top: 1px solid #5152532a;
    color: $colorPrimary;
    width: 100%;

    .copyright {
      text-align: center;
      margin: 1rem 0;
    }
  }
}
</style>
