<template>
  <div class="listSongs">
    <div class="top">
      <h2>Submit a song from this list for a chance to groove to it later!</h2>
      <ul v-for="(value, key) in songList" v-bind:key="key">
        <li>
          <input type="checkbox" @click="checked = true" />{{
            value.songName
          }}
          by
          {{ value.featuredArtist }}
        </li>
      </ul>
    </div>
    <div class="bottom">
      <div class="submitButton">
        <input type="submit" @click="submitted()" />
      </div>
    </div>
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
    };
  },
  methods: {
    submitted() {
      SongService.submitASong(this.eventId, this.songId).then((response) => {
        this.checked = response.data;
      });
    },
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
h2 {
  color: white;
  font-size: 20px;
}
.listSongs {
  background-color: rgb(86, 219, 24, 0.7);
  width: 350px;
  height: 500px;
  color: rgb(0, 0, 0);
  display: grid;
  grid-template-rows: 2fr 0.15fr;
  grid-template-areas: "top" "bottom";
}
.top {
    grid-area: "top";
    overflow-y: scroll;
}

.bottom {
    grid-area: "bottom"
}
</style>