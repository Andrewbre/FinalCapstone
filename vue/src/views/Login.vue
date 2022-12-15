<<<<<<< HEAD

  <template>
=======
<template>
>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
  <div>
    <form class="form-signin" @submit.prevent="login">
      <h1 class="h3 mb-3 font-weight-normal">Please Sign In</h1>
      <div class="alert alert-danger" role="alert" v-if="invalidCredentials">
        Invalid username and password!
      </div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >
        Thank you for registering, please sign in.
      </div>
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
      <router-link :to="{ name: 'register' }"></router-link>
      <button type="submit">Sign in</button>
    </form>
  </div>
</template>
<<<<<<< HEAD
=======

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
<script>
import authService from "../services/AuthService";
export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: "",
      },
      invalidCredentials: false,
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then((response) => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch((error) => {
          const response = error.response;
          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    },
  },
};
</script>
<style scoped>
<<<<<<< HEAD
@import url("https://fonts.googleapis.com/css?family=Abel%7CAbril+Fatface%7CAlegreya%7CArima+Madurai%7CDancing+Script%7CDosis%7CMerriweather%7COleo+Script%7COverlock%7CPT+Serif%7CPacifico%7CPlayball%7CPlayfair+Display%7CShare%7CUnica+One%7CVibur");
=======
@import url("https://fonts.googleapis.com/css?family=Abel|Abril+Fatface|Alegreya|Arima+Madurai|Dancing+Script|Dosis|Merriweather|Oleo+Script|Overlock|PT+Serif|Pacifico|Playball|Playfair+Display|Share|Unica+One|Vibur");
>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
/* End Fonts */
/* Start Global rules */
* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
}
/* End Global rules */
/* Start body rules */
.bg {
<<<<<<< HEAD
  background-image: linear-gradient(-225deg, #E3FDF5 0%, #FFE6FA 100%);
  background-image: linear-gradient(to top, #A8EDEA 0%, #FED6E3 100%);
  background-attachment: fixed;
  background-repeat: no-repeat;
=======
  background-image: linear-gradient(-225deg, #e3fdf5 0%, #ffe6fa 100%);
  background-image: linear-gradient(to top, #a8edea 0%, #fed6e3 100%);
  background-attachment: fixed;
  background-repeat: no-repeat;

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
  font-family: "Vibur", cursive;
  /*   the main font */
  font-family: "Abel", sans-serif;
  opacity: 0.95;
<<<<<<< HEAD
  /* background-image: linear-gradient(to top, #D9AFD9 0%, #97D9E1 100%); */
}
/* |||||||||||||||||||||||||||||||||||||||||||||*/
/* //////////////////////////////////////////// */
=======
  /* background-image: linear-gradient(to top, #d9afd9 0%, #97d9e1 100%); */
}

/* |||||||||||||||||||||||||||||||||||||||||||||*/
/* //////////////////////////////////////////// */

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
/* End body rules */
/* Start form  attributes */
field {
  width: 450px;
  min-height: 500px;
  height: auto;
  border-radius: 5px;
  margin: 2% auto;
  box-shadow: 0 9px 50px hsla(20, 67%, 75%, 0.31);
  padding: 2%;
<<<<<<< HEAD
  background-image: linear-gradient(-225deg, #E3FDF5 50%, #FFE6FA 50%);
=======
  background-image: linear-gradient(-225deg, #e3fdf5 50%, #ffe6fa 50%);
>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
}
/* form Container */
form .con {
  display: -webkit-flex;
  display: flex;
<<<<<<< HEAD
  -webkit-justify-content: space-around;
  justify-content: space-around;
  -webkit-flex-wrap: wrap;
  flex-wrap: wrap;
=======

  -webkit-justify-content: space-around;
  justify-content: space-around;

  -webkit-flex-wrap: wrap;
  flex-wrap: wrap;

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
  margin: 0 auto;
}
/* the header form form */
header {
  margin: 2% auto 10% auto;
  text-align: center;
}
/* Login title form form */
header h2 {
  font-size: 250%;
  font-family: "Playfair Display", serif;
<<<<<<< HEAD
  color: #3E403F;
=======
  color: #3e403f;
>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
}
/*  A welcome message or an explanation of the login form */
header p {
  letter-spacing: 0.05em;
}
<<<<<<< HEAD
/* //////////////////////////////////////////// */
/* //////////////////////////////////////////// */
=======

/* //////////////////////////////////////////// */
/* //////////////////////////////////////////// */

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
.input-item {
  background: #fff;
  color: #333;
  padding: 14.5px 0px 15px 9px;
  border-radius: 5px 0px 0px 5px;
}
<<<<<<< HEAD
=======

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
/* Show/hide password Font Icon */
#eye {
  background: #fff;
  color: #333;
<<<<<<< HEAD
=======

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
  margin: 5.9px 0 0 0;
  margin-left: -20px;
  padding: 15px 9px 19px 0px;
  border-radius: 0px 5px 5px 0px;
<<<<<<< HEAD
=======

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
  float: right;
  position: relative;
  right: 1%;
  top: -0.2%;
  z-index: 5;
<<<<<<< HEAD
=======

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
  cursor: pointer;
}
/* inputs form  */
input[class="form-input"] {
  width: 240px;
  height: 50px;
<<<<<<< HEAD
  margin-top: 2%;
  padding: 15px;
  font-size: 16px;
  font-family: "Abel", sans-serif;
  color: #5E6472;
  outline: none;
  border: none;
=======

  margin-top: 2%;
  padding: 15px;

  font-size: 16px;
  font-family: "Abel", sans-serif;
  color: #5e6472;

  outline: none;
  border: none;

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
  border-radius: 0px 5px 5px 0px;
  transition: 0.2s linear;
}
input[id="txt-input"] {
  width: 250px;
}
/* focus  */
input:focus {
  transform: translateX(-2px);
  border-radius: 5px;
}
/* //////////////////////////////////////////// */
/* //////////////////////////////////////////// */
<<<<<<< HEAD
=======

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
input[type="text"] {
  min-width: 250px;
}
/* buttons  */
button {
  display: inline-block;
  color: #252537;
<<<<<<< HEAD
  width: 280px;
  height: 50px;
  padding: 0 20px;
  background: #fff;
  border-radius: 5px;
  outline: none;
  border: none;
  cursor: pointer;
  text-align: center;
  transition: all 0.2s linear;
=======

  width: 280px;
  height: 50px;

  padding: 0 20px;
  background: #fff;
  border-radius: 5px;

  outline: none;
  border: none;

  cursor: pointer;
  text-align: center;
  transition: all 0.2s linear;

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
  margin: 7% auto;
  letter-spacing: 0.05em;
}
/* Submits */
.submits {
  width: 48%;
  display: inline-block;
  float: left;
  margin-left: 2%;
}
/*       Forgot Password button FAF3DD  */
.frgt-pass {
  background: transparent;
}
<<<<<<< HEAD
/*     Sign Up button  */
.sign-up {
  background: #B8F2E6;
}
=======

/*     Sign Up button  */
.sign-up {
  background: #b8f2e6;
}

>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
/* buttons hover */
button:hover {
  transform: translatey(3px);
  box-shadow: none;
}
/* buttons hover Animation */
button:hover {
  animation: ani9 0.4s ease-in-out infinite alternate;
}
@keyframes ani9 {
  0% {
    transform: translateY(3px);
  }
  100% {
    transform: translateY(5px);
  }
}
/* video {
  z-index: -1;
  object-fit: cover;
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
}
html, body {
  height: 100%;
}
*/
</style>