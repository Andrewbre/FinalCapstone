import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:9000"
});

export default {

  getEvent(id) {
    return http.get(`/events/${id}`);
  }

}