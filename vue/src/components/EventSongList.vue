<template>
    <div class = "listSongs">
    <h2> Submit a song from this list for a chance to groove to it later! </h2>
        <ul v-for="(value, key) in songList" v-bind:key="key">
            <li> <input type="checkbox" @click="checked = true" >{{ value.songName }} by {{ value.featuredArtist }} </li>
        </ul>
        <input type="submit" @click="submitted()"> 
        
    </div>    
</template>

<script>
 import SongService from '../services/SongService.js'

export default {
    name: "event-song-list",
    data(){
        return {
            songList: [],
            checked: false,   
            eventId: 0,
            songId: 0,             
        }
    },
    methods: {
            submitted(){
                SongService.submitASong(this.eventId, this.songId).then((response) => {
                    this.checked = response.data;
                })
            }
    }, 
    
    created(){
        SongService.getAllSongByEventId(2).then((response)=> {
    
            this.songList = response.data;
        })
        
    },

    }
    
</script>

<style>
    .listSongs {
        
  background-color: rgb(204, 8, 204);
  width: 350px;
  overflow-y:scroll;
  height: 500px;
  color: white;
}
</style>