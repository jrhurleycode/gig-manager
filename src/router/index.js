import { createRouter, createWebHistory } from 'vue-router'
import TestButton from '../views/TestButton.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: TestButton
    },
  ]
})

export default router
