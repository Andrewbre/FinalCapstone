import axios from 'axios';

export default {

  eventDetails(event_id) {
    return axios.get('/event/:id', event_id)
  }
}