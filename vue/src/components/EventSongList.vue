<template>
  <div class="listSongs">
    <div class="top">
      <h2>Click song for a chance to groove to it later!</h2>
      <ul v-for="(value, key) in songList" v-bind:key="key">
        <li @click="addSong(value)"> 
          <!-- <input type="checkbox" @click="checked = true" /> -->
          {{ value.songName }}
          by
          {{ value.featuredArtist }}
        </li>
        <hr/>
      </ul>
    </div>
    <!-- <div class="bottom">
      <div class="submitButton">
        <input type="submit" @click="submitted()" />
      </div>
    </div> -->
  </div>
</template>

<script>
import SongService from "../services/SongService.js";
export default {
  name: "event-song-list",
  data() {
    return {
      songList: [],
      checked: false,
      eventId: this.$route.params.eventId,
      songId: 0,
      eventSong: {
        event_id: this.$route.params.eventId,
        song_id: ""
      }
    };
  },
  methods: {
    // submitted() {
    //   SongService.submitASong(this.eventId, this.songId).then((response) => {
    //     this.checked = response.data;
    //   });
    // },
    addSong(songToAdd){
      console.log(songToAdd);

       SongService
          .addSongsToPlaylist(songToAdd)
          .then(this.$router.push({
                path: '#',
                query: { registration: 'success' },
              }))
          ;
          
    }
  },

  created() {
    SongService.getAllSongByEventId(this.eventId).then((response) => {
      this.songList = response.data;
    });

    //    SpotifyService.getAllSongs().then((response) => {
    //        this.songList=response.data;
    //    })
  },
};
</script>

<style>

li:hover{
  color:rgb(131, 2, 120)
}
li{
  padding: 0px;
}
h2 {
  color: white;
  font-size: 20px;
  padding-bottom: 5px;
}
.listSongs {
  background-color: rgb(86, 219, 24, 0.7);
  width: 350px;
  height: 500px;
  color: rgb(0, 0, 0);
  overflow-y: scroll;
  border-radius: 25px;
  border: 2px solid #ad21ad;
  padding: 2px;
  
}

</style>