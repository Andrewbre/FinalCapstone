<template>
  <div id="main">
    <div class="is-flex is-justify-content-flex-start is-flex-direction-row">
      <video
<<<<<<< HEAD
        src="video/pexels-anna-nekrashevich-8516372.mp4"
=======
        src="videos/pexels-rostislav-uzunov-8252781.mp4"
>>>>>>> 08a39fdf034494fdea468e2d00c175c1f52560f9
        autoplay
        loop
        playsinline
        muted
<<<<<<< HEAD
      ></video>
=======
      ></video> 
>>>>>>> 08a39fdf034494fdea468e2d00c175c1f52560f9
      <event-details />
      <event-playlist />
    </div>

    <div class="is-flex is-justify-content-flex-end is-flex-direction-row">
      <event-song-list class="is-justify-content-right"> </event-song-list>
    </div>
  </div>
</template>

<script>
//import authService from "../services/AuthService";
import EventSongList from "../components/EventSongList.vue";
import EventDetails from "../components/EventDetails.vue";
import EventPlaylist from "../components/EventPlaylist.vue";
export default {
  name: "guest-event-page",
  components: {
    EventSongList,
    EventDetails,
    EventPlaylist,
  },
};
</script>
 
,
    EventPlaylist<style scoped>
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