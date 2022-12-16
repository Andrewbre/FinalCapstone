<template>
  <div id="main">
    <div class ="allSongs">
      <video
        src="../images/lava.mp4"
        autoplay
        loop
        playsinline
        muted
      ></video>
      <event-details />
      <event-playlist />
      <event-song-list />
    </div>
    <div>
    </div>
  </div>
</template>
<script>
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
  data() {
    return {
      joke: [
      ],
      songsAdded: [

      ]
    };
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

.allSongs{
  display:grid;
  display: flex;
  grid-template-columns: 1fr 1fr 1fr;
  grid-template-areas: 'details availableSongs playlist';
  justify-content: space-evenly;
}
event-details {
  grid-area: 'details';
}
event-song-list {
  grid-area: 'availableSongs';
  background-color: magenta;
}

event-playlist {
  grid-area: 'playlist';
  margin-right: 10px;
}
#main {
  margin-top: 20px;
}
</style>