<template>
    <div class = "playlist">
        <h2 id="playlistTitle"> Playlist </h2>
        <ul v-for="(value, key) in eventPlaylist" v-bind:key="key">
            <li> {{value.songName}} by {{ value.featuredArtist }}</li>
        </ul> 
    </div>       
</template>

<script>
 import SongService from '../services/SongService.js'
 
export default {
    name:"event-playlist",
    data(){
        return {
            eventPlaylist:[],
            eventId: this.$route.params.eventId,
        }
    },
    created(){
        SongService.getEventPlaylist(2).then((response) => {
            this.eventPlaylist = response.data;
        })
    }
    
}
</script>

<style>
#playlistTitle {
    font-size: 20px;
    color: white;

}
.playlist{
  
  background-color: rgb(216, 17, 216, .7);
  color: black;
  margin-right: 20px;
  overflow-y: scroll;
  height: 500px;
}
</style>