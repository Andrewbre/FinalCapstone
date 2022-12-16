<template>
  <div id="app">
    <!-- <div id="nav" class="navbar is-primary"> -->
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link :to="{ name: 'login' }" v-if="$store.state.token == ''">Login</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
      <router-link :to="{ name: 'event-list' }" > View All Events</router-link>

      
    
      <router-view />
    </div>
  <!-- </div> -->
</template>

<style>
#nav {
 color: rgb(243, 232, 232);
 font-weight: bold;
 font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

a {
  color: white;
}



</style>
