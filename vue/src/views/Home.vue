<template>
  <div id="home">
    <video
      src="\videos\balloonslogo.mp4"
      autoplay
      loop
      playsinline
      muted
    ></video>
    <!-- <video
      src="../images/balloonslogo.mp4"
      autoplay
      loop
      playsinline
      muted
    ></video> -->
    <div class="container">
      <form class="search-bar">
        <input
          type="text"
          placeholder="Search Event Name"
          name=""
          v-model="eventName"
        />
        <button v-on:click.prevent="goToEventPage">
          <img src="search.png" />
        </button>
      </form>
    </div>
  </div>
</template>

<script>
import EventService from "../services/EventService";

export default {
  name: "home",
  data() {
    return {
      eventName: "",
    };
  },
  methods: {
    goToEventPage() {
      EventService.getEventByEventName(this.eventName).then((response) => {
        console.log(response.data);
        this.$store.commit("SET_ACTIVE_EVENT", response.data);
        this.$router.push({name:'guest-event-page', params: {eventId: response.data.eventId}})
      });
    },
  },
};
</script>


<style scoped>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}
.container {
  width: 100%;
  min-height: auto;
  padding: 5%;
  display: flex;
  align-items: center;
  justify-content: center;
  overflow: hidden;
}
input:hover {
  box-shadow: 0px 1px 3px rgb(192, 185, 185);
}

/* #home {
  width: 100%;
  min-height: 100vh;
  background-image:
     url(https://imageio.forbes.com/specials-images/imageserve/5daf1dc2a210800006f02649/Screensavers-VR-has-a-neon-mode-via-FLOAT-LAND/960x0.jpg?height=387&width=711&fit=bounds); 
  background-position: center;
  background-size: cover;
  background-attachment: fixed;
  
} */

.search-bar {
  width: 100%;
  max-width: 700px;
  background: rgba(255, 255, 255, 0.5);
  display: flex;
  align-items: center;
  border-radius: 60px;
  padding: 10px 20px;
}
.search-bar input {
  /* background:  */
  opacity: 73%;
  flex: 1;
  border: 0;
  outline: none;
  padding: 24px 20px;
  font-size: 20px;

  color: #cc3aa8;

  backdrop-filter: blur(10px) saturated(140%);
}
::placeholder {
  color: #ffffff;
}

.search-bar button img {
  width: 25px;
}

.search-bar button {
  border: 0;
  border-radius: 50%;
  width: 60px;
  height: 60px;
  background: #58629b;
  cursor: pointer;
}

video {
  z-index: -1;

  object-fit: cover;
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
}

html,
body {
  height: 100%;
}

h1 {
  font-size: 70px;
  font-weight: 500;
  color: hotpink;
  text-shadow: -1px 0 rgb(255, 255, 255), 0 1px rgb(255, 255, 255),
    1px 0 rgb(245, 245, 245), 0 -1px rgb(255, 255, 255);
  text-align: center;
  /* color: #553c9a;
  border-right: 4px solid #000;
  
  background-image: linear-gradient(300deg, #E21143, #FFB03A);
  background-clip: text;
  color: transparent; */
}
/* font-size: 72px;
  background: -webkit-linear-gradient(to right, #553c9a 45%, #ee4b2b);
  /* webkit-background-clip: text;
  webkit-text-fill-color: transparent; */
</style>
