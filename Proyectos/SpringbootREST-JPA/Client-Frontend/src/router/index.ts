import { createRouter, createWebHistory } from "vue-router";
import HomeView from "@/views/HomeView.vue";
import PageNotFound from "@/views/PageNotFound.vue";
import AcademyFormView from "@/views/AcademyFormView.vue";


const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: "/",
            name: "home",
            component: HomeView
        },
        {
            path: "/academy-form",
            name: "academy-form",
            component: AcademyFormView
        },
        {
            path: "/:pathMatch(.*)*",
            name: "not-found",
            component: PageNotFound
        },
    ],
    scrollBehavior(to, _from, _savedPosition) {
        if (to.hash) return { el: to.hash, top: 30 };
        return { top: 0 };
    }
});

export default router;
