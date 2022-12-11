import axios from 'axios';



export default {

  getEvent(id) {
    return axios.get(`/events/${id}`);
  }

}