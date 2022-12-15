<template>
  <div>
<<<<<<< HEAD
   <!-- <video src="../images/MMMBops.mp4" autoplay loop playsinline muted></video>  -->
    <div class="main">
      <div id="info-event">
        <event-details :eventId="$route.params.eventId"></event-details>
        <!-- <form>
          <span>Change Event Name</span><br />
=======
    <video src="../images/MMMBops.mp4" autoplay loop playsinline muted></video>
    <div class="main">
      <div id="info-event">
        <!-- <div class="listSongs">
          <h2 id="playlistHeader">Add Genres To Event</h2>
          <ul v-for="(value, key) in songList" v-bind:key="key">
            <li>
              <input type="checkbox" @click="checked = true" />{{
                value.songName
              }}
              by {{ value.featuredArtist }}
            </li>
          </ul>
          <input type="submit" @click="submitted()" />
        </div> -->
        <form @submit.prevent="saveEvent">
          <span>Create Event</span><br />
>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
          <input
            class="input is-small"
            v-model="eventToCreate.eventName"
            type="text"
            placeholder="Enter new event name"
          /><br />
          <span>Event Description</span><br />
          <textarea
            rows="3"
            class="textarea has-fixed-size"
<<<<<<< HEAD
            v-model="eventInformation"
            placeholder="Let your party people know why your this event will be ALL THAT AND BAG OF CHIPS!"
=======
            v-model="eventToCreate.eventInformation"
            placeholder="Let your party people know why this event will be ALL THAT AND BAG OF CHIPS!"
>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
          /><br />
          <span>Street Address</span>
          <input
            class="input is-small"
            v-model="eventToCreate.eventName"
            type="text"
            placeholder="Where the party at?"
          /><br />
          <span>Theme:</span><br />
<<<<<<< HEAD
          <select v-model="themes">
            <option>Ska</option>
            <option>Halloween</option>
            <option>Spice World</option>
            <option>Hip-Hop</option>
            <option>Grunge</option>
          </select>
=======
      
>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3

          <button type="submit" class="register">
            Create Event
          </button>
<<<<<<< HEAD
        </form> -->
        <event-song-list></event-song-list>
=======
        </form>
>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
      </div>
    </div>
    <event-details :eventId="$route.params.eventId"></event-details>
  </div>
</template>

<script>
import EventDetails from "../components/EventDetails.vue";
<<<<<<< HEAD
import EventSongList from "../components/EventSongList.vue";

export default {
  name: "host-event-page",
  components: {
    EventDetails,
    EventSongList,
  },
=======
// import SongService from "../services/SongService.js";
import EventService from "../services/EventService.js";

export default {
  name: "host-event-page",
  data() {
    return {
      eventId: this.$route.params.eventId,
      songList: [],
      eventToCreate:{
        eventName: "",
        eventInformation: "",
      }
    };
  },
  components: {
    EventDetails,
  },
  methods: {
    // submitted() {
    //   SongService.submitASong(this.eventId, this.songId).then((response) => {
    //     this.checked = response.data;
    //   });
    // },
      saveEvent(){
        EventService.createEvent(this.eventToCreate).then((response) => {
        console.log(response.data);
        this.$store.commit("CREATE_EVENT", response.data);
        this.$router.push({name:'guest-event-page', params: {eventId: response.data.eventId}})
      });
      }
  },

  created() {
    // SongService.getAllSongByEventId(this.eventId).then((response) => {
    //   this.songList = response.data;
    // });
  },
>>>>>>> cbef18d5127e70480ee46dd30306d169d4f5f1c3
};
</script>


<style scoped>
video {
  z-index: -1;

  object-fit: cover;
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
}

.main {
  display: grid;
  height: 100%;
  grid-template-columns: 1.2fr 1fr;
  grid-template-areas: "main-info .";
  margin: 10px;
}

#info-event {
  grid-area: main-info;
  margin: 20px;
  margin-top: 50px;
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-template-areas: ". form";
}

event-details {
  background-color: rgba(107, 3, 107, 0.698);
  color: white;
}

/* #playlistHeader {
  padding: 20px;
  margin-bottom: 20px;
}

.listSongs {
  grid-area: songList;
  height: 350px;
  background-color: rgb(241, 12, 241, 0.69);
  color: white;
  margin-top: 10px;
  margin-right: 15px;
} */

form {
  height: 100%;
  font-size: 2rem;
  grid-area: form;
  background-color: rgb(241, 12, 241, 0.69);
  color: white;
  margin-top: 10px;
}


a {
  color: white;
}
</style>
