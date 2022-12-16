<template>
  <div>
    <video src="../images/MMMBops.mp4" autoplay loop playsinline muted></video>
    <div class="main">
      <div id="info-event">
    
        <form @submit.prevent="saveEvent">
          <span>Create Event</span><br />
          <input
            class="input is-small"
            v-model="event.event_name"
            type="text"
            placeholder="Enter new event name"
          /><br />
          <span>Event Description</span> <br/>
          <textarea
            rows="3"
            class="textarea has-fixed-size"
            v-model="event.information"
            placeholder="Let your party people know why this event will be ALL THAT AND BAG OF CHIPS!"
          /><br />
          <span>Street Address</span>
          <input
            class="input is-small"
            v-model="event.street_address"
            type="text"
            placeholder=""
          /><br />
          <span>City</span>
          <input
            class="input is-small"
            v-model="event.city"
            type="text"
            placeholder=""
          /><br />
          <span>State</span>
          <input
            class="input is-small"
            v-model="event.state"
            type="text"
            placeholder=""
          /><br />
         

          <button type="submit">Create Event</button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
// import SongService from "../services/SongService.js";
import eventService from "../services/EventService.js";

export default {
  name: "host-event-page",
  data() {
    return {
      eventId: this.$route.params.eventId,
      songList: [],
      event: {
        event_name: '',
        information: '',
        street_address: '',
        city: '',
        state: '',
      },
    };
  },
  components: {},
  methods: {
    // submitted() {
    //   SongService.submitASong(this.eventId, this.songId).then((response) => {
    //     this.checked = response.data;
    //   });
    // },
    saveEvent() {
        eventService
          .createEvent(this.event)
          .then(this.$router.push({
                path: '/eventList',
                query: { registration: 'success' },
              }))
          ;
      
    }
  },

  created() {
    // SongService.getAllSongByEventId(this.eventId).then((response) => {
    //   this.songList = response.data;
    // });
    
  },
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
  border-radius: 25px;
  border: 2px solid #73AD21;
  padding: 20px;
}

a {
  color: white;
}
</style>
