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
    <div> {{ joke[0].question }} <br/>
          <span id="punchline">{{ joke[0].punchline }}</span></div>
  </div>
</template>
<script>
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
        let stringReturn = JSON.stringify(response.data);
        //stringReturn = stringReturn.replaceAll('\'','\'\'');
        //stringReturn = stringReturn.replaceAll('"','');
        //console.log(stringReturn);
        console.log(JSON.parse(stringReturn));
        this.joke = JSON.parse(stringReturn);
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
.allSongs{
  display:grid;
  grid-template-columns: 1fr 1fr 1fr;
  grid-template-areas: 'details availableSongs playlist';
  justify-content: space-around;
}
event-details {
  grid-area: 'details';
}
event-song-list {
  grid-area: 'availableSongs';
  background-color: magenta;
}
#punchline {
  color: white;
}
#punchline:hover {
  color: black;
}
event-playlist {
  grid-area: 'playlist';
  margin-right: 10px;
}
#main {
  margin-top: 20px;
}
</style>