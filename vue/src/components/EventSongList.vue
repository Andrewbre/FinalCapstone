<template>
    <div>
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
                songName: "mmmbop",
                artistName: "hansen"},
                {
                songName: "wonderwall",
                artistName: "oasis"},
                {
                songName: "san luis",
                artistName: "gregory alan isakov"},
                {
                songName: "created",
                artistName: "Portugal the Man"},
                
            ]
        }
    },
    methods: {

    },
    }
</script>

<style>

</style>