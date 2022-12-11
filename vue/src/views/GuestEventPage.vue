<template>
<div>
    <video src="video/pexels-anna-nekrashevich-8516372.mp4" autoplay loop playsinline muted>
    
    </video>
    <event-song-list> </event-song-list>


</div>
</template>

<script>
//import authService from "../services/AuthService";
import EventSongList from "../components/EventSongList.vue";
export default{
  name: "guest-event-page",
  components: {
    EventSongList
  }
}
</script>
 
<style>
video {
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
</style>
