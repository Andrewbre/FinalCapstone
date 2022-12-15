import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

/*
 * The authorization header is set for axios when you login but what happens when you come back or
 * the page is refreshed. When that happens you need to check for the token in local storage and if it
 * exists you should set the header so that it will be attached to each request
 */
const currentToken = localStorage.getItem('token')
const currentUser = JSON.parse(localStorage.getItem('user'));

if (currentToken != null) {
  axios.defaults.headers.common['Authorization'] = `Bearer ${currentToken}`;
}

export default new Vuex.Store({
  state: {
    token: currentToken || '',
    user: currentUser || {},
    activeEvent:
    {
      eventId: Number,
      djId: Number,
      eventListOfHosts: [],
      eventListOfGenres: [],
      eventName: '',
      eventInformation: ''
    },
    eventToCreate:
    {
      event_name: "",
      information: "",
    },
    allEvents:
     [],
     allSongs:
     [],
  },

  mutations: {
    SET_AUTH_TOKEN(state, token) {
      state.token = token;
      localStorage.setItem('token', token);
      axios.defaults.headers.common['Authorization'] = `Bearer ${token}`
    },
    SET_USER(state, user) {
      state.user = user;
      localStorage.setItem('user', JSON.stringify(user));
    },
    SET_ACTIVE_EVENT(state, data) {
      state.activeEvent = data;
    },
    SET_EVENTS(state, data) {
      state.allEvents = data;
    },
    LOGOUT(state) {
      localStorage.removeItem('token');
      localStorage.removeItem('user');
      state.token = '';
      state.user = {};
      axios.defaults.headers.common = {};
    },
    CREATE_EVENT(state, data){
      state.eventToCreate = data;
    },
    GET_ALL_SONGS(state, data){
      state.allSongs = data;
    }
  }
})
