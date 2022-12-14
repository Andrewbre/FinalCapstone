<template>
    <div class = "playlist">
        <h1> Playlist </h1>
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
            eventId: 0,
        }
    },
    created(){
        SongService.getEventPlaylist(this.eventId).then((response) => {
            this.eventPlaylist = response.data;
        })
    }
    
}
</script>

<style>

</style>