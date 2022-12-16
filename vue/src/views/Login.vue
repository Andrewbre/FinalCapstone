
<template>
 <!-- <div id="login" class="box" >
    <video src="../images/balloonslogo.mp4" autoplay loop playsinline muted></video>

    <div class="field">
      <p class="control has-icons-left has-icons-right"> -->
       
 <div class="bg">
<div class="overlay">

<form>
   
   <div class="con">
   
   <header class="head-form">
      <h2>Log In</h2>
      <p>login here using your username and password</p>
   </header>
   <!--     End  header Content  -->
   <br>
   <div class="field-set">
     
      <!--   user name -->
         <span class="input-item">
           <i class="fa fa-user-circle"></i>
         </span>
        <!--   user name Input-->
 <input
          type="text"
          id="username"
          class="input"
          placeholder="Username"
          v-model="user.username"
          required
          autofocus
        />     
      <br>
     
           <!--   Password -->
     
      <span class="input-item">
        <i class="fa fa-key"></i>
       </span>
      <!--   Password Input-->
<input type="password"
        id="password"
        class="input"
        placeholder="Password"
        v-model="user.password"
        required >    
     <span>
        <i class="fa fa-eye" aria-hidden="true"  type="button" id="eye"></i>
     </span>
     
     
      <br>
<!--        buttons -->
<!--      button LogIn -->
      <button class="log-in" @click="login">Login</button>
   </div>
  
<!--   other buttons -->
   <div class="other">
<!--      Forgot Password button-->
      <button class="btn submits frgt-pass">Forgot Password</button>

   </div>
     

  </div>
</form>
</div>
</div>





   <!-- <form class="form-signin" @submit.prevent="login">
      <h1 class="h3 mb-3 font-weight-normal">Please Sign In</h1>
      <div
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid username and password!</div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      <label for="username" class="sr-only">Username</label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <label for="password" class="sr-only">Password</label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <div class = "mmmbop">
      <button class = "button" type="submit">Sign in</button>
      <router-link :to="{ name: 'register' }">Need an account? </router-link>
      </div>
    </form>
  </div>
</template>
<script>
import authService from "../services/AuthService";
export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/hostEventPage");
          }
        })
        .catch(error => {
          const response = error.response;
          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  }
};
</script>

<style scoped>
.form-signin{  
  font-family: fantasy;
  color:  rgb(190, 85, 15);
  height: 351px;
  background-color: rgba(236, 227, 227, 0.4);
}
a {
  color:  black;
}
.mmmbop{
  margin-top: 2px;
  display: grid;
  grid-template-columns: 1;
  grid-template-rows: 1  1 ;
}
</style>