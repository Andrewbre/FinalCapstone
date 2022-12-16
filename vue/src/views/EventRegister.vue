<template>
  <div class="eventRegistration">
    <h1>Event Registration</h1>

    <event-registration-form> </event-registration-form>

    <video
      src="video/pexels-rodnae-productions-7017803.mp4"
      autoplay
      loop
      playsinline
      muted
    ></video>
  </div>
</template>

<script>
//import authService from "../services/AuthService";
import EventRegistrationForm from "../components/EventRegistrationForm.vue";
export default {
  name: "event-register",
  components: {
    EventRegistrationForm,
  },
};
</script>

<style>
video {
  z-index: -1;

  object-fit: fill;
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
}
/* .eventRegistration {
            display: grid;
            grid-template-columns: 1fr 3fr 1fr;
            grid-template-areas: ". form .";
            
    
        }
        event-registration-form {
            grid: form;
            justify-content: center;

        } */

/* *, *:after, *:before{ */
/* @include box-sizing(border-box); */

body {
  background: #FF4081/ 1.25;
  text-align: center;
  font-family: "Roboto", sans-serif;
}

.body {
  background: #fff;
  position: absolute;
  top: 200px;
  left: -20px;
  @include border-radius(100px 100px 100px 100px / 126px 126px 96px 96px);
  width: 250px;
  height: 282px;
  @include box-shadow(0 5px 10px rgba(0, 0, 0, 0.3));
}

form {
  display: none;
  max-width: 400px;
  padding: 20px 40px;
  background: #fff;
  height: 300px;
  margin: auto;
  display: block;
  @include box-shadow(0 10px 15px rgba(0, 0, 0, 0.15));
  @include transition(0.3s);
  position: relative;
  @include translateY(-100px);
  z-index: 1;
  border: 1px solid #eee;
}

h1 {
  font-size: 60px;
}

.btn {
  background: rgb(48, 10, 10);
  padding: 5px;
  width: 150px;
  height: 35px;
  border: 1px solid #ff4081;
  margin-top: 25px;
  cursor: pointer;
  @include transition(0.3s);
  @include box-shadow(0 50px #FF408 inset);
}
.form-group {
  position: relative;
  font-size: 15px;
  color: #666;
}

.form-label {
  position: absolute;
  z-index: 1;
  left: 0;
  top: 5px;
  @include transition(0.3s);
}

.form-control {
  width: 100%;
  position: relative;
  z-index: 3;
  height: 35px;
  background: none;
  border: none;
  padding: 5px 0;
  @include transition(0.3s);
  border-bottom: 1px solid #777;
  color: #555;
}
</style>
