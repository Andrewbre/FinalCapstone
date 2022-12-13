<template>
    <div class = "listSongs">
        <ul v-for="(value, key) in songList" v-bind:key="key">
            <li>{{ value.songName }} by {{ value.artistName }} </li>

        </ul>
    </div>    
</template>

<script>
// import SongService from '../services/SongService.js'

export default {
    name: "event-song-list",
    data(){
        return {
            songList: [
                {
                songName: "MMMBop",
                artistName: "Hansen"},
                {
                songName: "Wonderwall",
                artistName: "Oasis"},
                {
                songName: "San Luis",
                artistName: "Gregory Alan Isakov"},
                {
                songName: "Created",
                artistName: "Portugal the Man"},
                {
                songName: "Wannabe",
                artistName: "Spice Girls"},
                {
                songName: "What is Love",
                artistName: "Haddaway"},
                {
                songName: "Created",
                artistName: "Portugal the Man"},
                {
                songName: "Waterfalls",
                artistName: "TLC"},
                
            ]
        }
    },
    methods: {

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