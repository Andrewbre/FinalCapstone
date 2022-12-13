<template>
    <div class = "listSongs">
    <h1> Submit a song from this list for a chance to groove to it later! </h1>
        <ul v-for="(value, key) in songList" v-bind:key="key">
            <li><input type="checkbox">{{ value.songName }} by {{ value.featuredArtist }} </li>
        </ul>
        <button type="submit" form="form1" value="Submit" @click="submitASong">Submit</button>
    </div>    
</template>

<script>
 import SongService from '../services/SongService.js'

export default {
    name: "event-song-list",
    data(){
        return {
            songList: []                
            
        }
    
    },
    beforeMount(){
        window.addEventListener("beforeunload", event => {
            if(!this.isEditing) return
            event.preventDefault()
            event.returnValue=""
        })
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
  height: 100px;
  color: white;
}
</style>