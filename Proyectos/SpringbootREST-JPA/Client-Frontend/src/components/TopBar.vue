<script setup lang="ts"></script>

<template>
  <section id="topbar" class="d-flex align-items-center topbar">
    <div class="container d-flex justify-content-center justify-content-md-between">
      <div class="contact-info d-flex align-items-center">
        <i class="bi bi-linkedin"></i> <a href="https://www.linkedin.com/in/victorlavalle/" target="_blank" rel="noopener" class="linkedin">/in/Victorlavalle</a>
      </div>
      <div class="d-none d-md-block">
        <i class="bi bi-github github-icon"></i> <a href="https://github.com/VictorLavalle" target="_blank" rel="noopener" class="linkedin">/VictorLavalle</a>
      </div>
    </div>
  </section>
</template>

<style scoped lang="scss">
.topbar {
  background: #fff;
  border-bottom: 1px solid #eee;
  font-size: 15px;
  height: 40px;
  padding: 0;

  a {
      line-height: 0;
      color: $colorDefault;
      transition: 0.3s;
    }

    a:hover {
      color: $colorTertiary;
    }

  .contact-info {
    i {
      color: $colorDefault;
      line-height: 0;
      margin-right: 5px;
    }

    .github-icon {
      margin-left: 15px;
    }
  }
}
</style>
