import axios from 'axios';
export default {
  getAllSongs() {
    return axios.get(`/ethan/playlist`);
  }
}
