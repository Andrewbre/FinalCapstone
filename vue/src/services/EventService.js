import axios from 'axios';


export default {

  getEvent(eventId) {
    return axios.get(`/events/${eventId}`); //does this need to be specific
  },

  getAllEvents() {
    return axios.get(`/events`);
  },

  getEventsByDjId(djId) {
    return axios.get(`/events/dj/${djId}`);
  },

  getEventsByHostId(hostId) {
    return axios.get(`/events/host/${hostId}`);
  },
 
  createEvent(event){
    return axios.post(`/events/create`, event);///how do we pull this information????
  },

  updateEventInformation(eventId){
    return axios.put(`/events/${eventId}`, {
      eventInformation: "",
      eventStatus: Boolean
    })
  },

  addGenreEvent(eventId, genreId){
    return axios.post(`/events/${eventId}/${genreId}`)
  }, //might have to refactor this

  getEventByEventName(eventName){
    return axios.get(`/events/name/${eventName}`)
  }
}