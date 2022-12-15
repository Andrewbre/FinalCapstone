<template>
  <div id="app">
    <!-- <div id="nav" class="navbar is-primary"> -->
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link :to="{ name: 'login' }" v-if="$store.state.token == ''">LogIn</router-link>
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
      
    
    <router-view />
     </div>
  <!-- </div> -->
</template>

<style>
#nav {
 color: white;
 font-weight: bold;
 font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}
a {
  color: white;
}
</style>
