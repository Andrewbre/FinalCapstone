import axios from 'axios';

export default {

    getGenresByEventId(eventId){
        return axios.get(`/events/event_genre/${eventId}`)
    },

    getGenresByDjId(djId){
        return axios.get(`/events/dj_genre/${djId}`)
    },

    getGenreByGenreId(genreId){
        return axios.get(`/events/genre/${genreId}`)
    }
}