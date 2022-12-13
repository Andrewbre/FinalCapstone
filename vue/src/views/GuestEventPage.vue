<template>
<div class="main">
    <!-- <video src="video/pexels-anna-nekrashevich-8516372.mp4" autoplay loop playsinline muted>
    
    </video> -->
    <event-details/>
    <event-song-list/> 
    <event-playlist/> 

</div>
</template>

<script>
//import authService from "../services/AuthService";
import EventSongList from "../components/EventSongList.vue";
import EventDetails from "../components/EventDetails.vue";
import EventPlaylist from "../components/EventPlaylist.vue"
export default{
  name: "guest-event-page",
  components: {
    EventSongList,
    EventDetails,
    EventPlaylist,
  }
}
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
body{
        background-image:url("https://www.nicepng.com/png/full/896-8960344_solo-cup-solo-jazz-cup-design.png") ;

    }

html, body {
  height: 100%;
}

event-song-list {
  background-color: magenta
}
</style>
