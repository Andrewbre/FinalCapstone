<template>
  <div id="app">
    <!-- <div id="nav" class="navbar is-primary"> -->
      <router-link v-bind:to="{ name: 'home' }">Hizzle</router-link>&nbsp;|&nbsp;
      <router-link :to="{ name: 'login' }" v-if="$store.state.token == ''">Logizzle?</router-link>
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
      
    
    <router-view />
     </div>
  <!-- </div> -->
</template>

<style>
#nav {
  
  font-family: monospace;
  width: 0%;
  align-content: center;
	float: center;
  font-size: 20px;
}
/* #nav {
  z-index: 3
} */
a {
  color:lavenderblush;
}

</style>

