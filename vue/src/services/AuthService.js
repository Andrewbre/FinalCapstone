import axios from 'axios';
//May need to create separate User Service
export default {

  login(user) {
    return axios.post('/login', user)
  },

  register(user) {
    return axios.post('/register', user)
  },

  // findEveryHost()//How do we do lists{
    
  // }

  //findEveryDj

  findDjByUserId(djId) {
    return axios.get(`/dj/${djId}`)
  },

  findHostByUserId(hostId) {
    return axios.get(`/host/${hostId}`)
  },

  //getUserBySingleId

  findByUsername(userName) {
    return axios.get(`/user/${userName}`)
  },

  //do we need the create new methods since users can currently register and login

}
