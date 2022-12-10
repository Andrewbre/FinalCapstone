<template>
  <div id="app">
    <div id="nav" class="navbar is-primary">
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link :to="{ name: 'login' }" v-if="$store.state.token == ''">Login?</router-link>
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
      
    </div>
    <router-view />
     
  </div>
</template>

<style>
/* #nav {
  z-index: 3
} */


</style>

