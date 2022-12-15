<template>
  <div id="main">
    <div class="is-flex is-justify-content-flex-start is-flex-direction-row">
      <video
        src="public/videos/pexels-rostislav-uzunov-8252781.mp4"
        autoplay
        loop
        playsinline
        muted
      ></video>
      <event-details />
      <event-playlist />
    </div>

    <div class="is-flex is-justify-content-flex-end is-flex-direction-row">
      <event-song-list class="is-justify-content-right"> </event-song-list>
    </div>
    <div> {{ joke.question }} <br/>
          {{ this.joke }}</div>
  </div>
</template>

<script>
//import authService from "../services/AuthService";
import EventSongList from "../components/EventSongList.vue";
import EventDetails from "../components/EventDetails.vue";
import EventPlaylist from "../components/EventPlaylist.vue";
import JokeService from "../services/JokeService.js";

export default {
  name: "guest-event-page",
  components: {
    EventSongList,
    EventDetails,
    EventPlaylist,
  },
  data() {
    return {
      joke: [

      ]
      
    };
  },
  created(){
      JokeService.getRandomJoke().then((response) => {
        this.joke = response.data;
  
    })
  },
  methods: {
    
  },
};
</script>
 
<style scoped>
video {
  z-index: -1;

  object-fit: cover;
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
}
body {
  background-image: url("https://www.nicepng.com/png/full/896-8960344_solo-cup-solo-jazz-cup-design.png");
}

html,
body {
  height: 100%;
}

event-song-list {
  background-color: magenta;
}
</style>