import axios from 'axios';

export default {
    getAllSongByEventId(eventId){
        return axios.get(`/events/availableSongs/${eventId}`)
    },

    getEventPlaylist(eventId){
        return axios.get(`/events/playlist/${eventId}`)
    },

    getSongListByDjId(djId){
        return axios.get(`/events/playlist/dj/${djId}`)
    },

    addSongsToPlaylist(eventSong){
        return axios.post(`/events/playlist/`, eventSong)//how do we do posts
    },

    voteOnASong(songId, eventId){
        return axios.put(`/events/${eventId}/${songId}`)
    }

}