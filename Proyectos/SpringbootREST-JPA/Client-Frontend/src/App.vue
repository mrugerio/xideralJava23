<script setup lang="ts">
import { RouterView } from "vue-router";
import { onBeforeMount } from "vue";
import { useI18n } from "vue-i18n";

const { locale } = useI18n();

const savedLocale: string | null = localStorage.getItem("lang");

if (savedLocale) locale.value = savedLocale;

onBeforeMount((): void => {
  const e: string[] = [
    "Hello , it's good to see you! ʕ·͡ᴥ·ʔ",
    "Sup ʕっ•ᴥ•ʔっ",
    "Hi there, you look awesome today! ♥‿♥",
    "You look awesome today! ( ͡° ͜ʖ ͡°)",
    "Hellllooooooo! ☉ ‿ ⚆",
    "Hey , how's life? (^-^)",
    "Can you keep a secret? You're my favorite human being! ༼ つ ◕_◕ ༽つ",
    "Nothing to see here ┌( ͝° ͜ʖ͡°)=ε/̵͇̿̿/’̿’̿ ̿",
    "Congratulations! You've discovered the console \t._.)/(._.",
    "I knew you'd find this Easter egg eventually ( •͡˘ _•͡˘)ノð",
    "Have i told you lately that i love you? ʕ♥ᴥ♥ʔ",
    "Nothing that you see is real ◕_◕",
    "You are a wizard Harry",
    "I like cherries, do you like cherries? ⊂(◉‿◉)つ",
    "-Hello there\n-General Kenobi\n\n      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣄⡀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠋⣹⡷\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠋⣠⣾⠟⠁\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠋⣠⣾⠟⠁⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠋⣠⣾⠟⠁⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠋⣠⣾⠟⠁⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠋⣠⣾⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡿⠋⣠⣾⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡇⠈⣠⣾⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⡇⢸⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⡴⢋⣴⣦⡈⠻⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⢀⣴⣿⣿⣿⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⢀⣴⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⢨⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠉⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"
  ];

  console.log(e[Math.floor(Math.random() * e.length)]);
});
</script>

<template>

  <RouterView />
  
</template>

<style scoped></style>
