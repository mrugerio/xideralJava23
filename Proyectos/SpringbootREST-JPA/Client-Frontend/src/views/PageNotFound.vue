<script setup lang="ts">
import TopBar from "@/components/TopBar.vue";
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
</script>

<template>
  <main>
    <TopBar />

    <Header />

    <div id="http-error">
      <div class="http-error">
        <div class="http-error-msg">
          <h1>404</h1>
        </div>
        <h2>We are sorry, Page not found!</h2>
        <p>
          The page you are looking for might have been removed had its name
          changed or is temporarily unavailable.
        </p>
        <a href="/">Back To Homepage</a>
      </div>
    </div>

    <Footer />
  </main>
</template>

<style scoped lang="scss">
$color_1: #ececec;
$color_2: #000;
$color_3: #fff;

#http-error {
  position: relative;
  height: 90vh;
  .http-error {
    position: absolute;
    left: 50%;
    top: 50%;
    -webkit-transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    transform: translate(-50%, -50%);
  }
}
.http-error {
  max-width: 920px;
  width: 100%;
  line-height: 1.4;
  text-align: center;
  padding-left: 15px;
  padding-right: 15px;
  .http-error-msg {
    position: absolute;
    height: 100px;
    top: 0;
    left: 50%;
    -webkit-transform: translateX(-50%);
    -ms-transform: translateX(-50%);
    transform: translateX(-50%);
    z-index: -1;
    h1 {
      font-family: $fontFamily-1;
      color: $color_1;
      font-weight: 900;
      font-size: 276px;
      margin: 0;
      position: absolute;
      left: 50%;
      top: 50%;
      -webkit-transform: translate(-50%, -50%);
      -ms-transform: translate(-50%, -50%);
      transform: translate(-50%, -50%);
    }
  }
  h2 {
    font-family: $fontFamily-2;
    font-size: 46px;
    color: $color_2;
    font-weight: 900;
    text-transform: uppercase;
    margin: 0;
  }
  p {
    font-family: $fontFamily-3;
    font-size: 16px;
    color: $color_2;
    font-weight: 400;
    text-transform: uppercase;
    margin-top: 15px;
  }
  a {
    font-family: $fontFamily-3;
    font-size: 14px;
    text-decoration: none;
    text-transform: uppercase;
    background-color: $colorPrimary;
    display: inline-block;
    padding: 16px 38px;
    border: 2px solid transparent;
    border-radius: 40px;
    color: $color_3;
    font-weight: 500;
    -webkit-transition: 0.2s all;
    transition: 0.2s all;
    &:hover {
      background-color: $colorSecondary;
      border-color: $colorSecondary;
      color: $color_3;
    }
  }
}
</style>
