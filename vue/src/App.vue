<template>
  <div id="app">
    <div id="nav" class="navbar is-primary">
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link :to="{ name: 'login' }" v-if="$store.state.token == ''">Login?</router-link>
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
      <greeting  v-if="$store.state.token != ''">Hello </greeting>
    </div>
    <router-view />
     <event-details></event-details>
  </div>
</template>

<style>
/* #nav {
  z-index: 3
} */
#app {

  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  max-width: 100%;
  max-height: 100%;
  margin: 0px auto 0 auto;
  background-color: coral;
}

</style>

