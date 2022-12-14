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
<<<<<<< HEAD
 color: white;
 font-weight: bold;
 font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}
=======
  
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

>>>>>>> cb14902811c9e2d6e73bbd05ee0eecc526d0ef8a
</style>
