<template>
  <div>
<<<<<<< HEAD
   <!-- <video src="../images/MMMBops.mp4" autoplay loop playsinline muted></video>  -->
=======
    <!-- <video src="../images/MMMBops.mp4" autoplay loop playsinline muted></video> -->

   

>>>>>>> 08a39fdf034494fdea468e2d00c175c1f52560f9
    <div class="main">
      <div id="info-event">
        
        <form>
          <span>Change Event Name</span><br />
          <input
            class="input is-small"
            v-model="eventName"
            type="text"
            placeholder="Enter new event name"
          />
          {{joke}}
          <br />
          <span>Event Description</span><br />
          <textarea
            rows="3"
            class="textarea has-fixed-size"
            v-model="eventToUpdate.eventInformation"
            placeholder="Let your party people know why this event will be ALL THAT AND BAG OF CHIPS!"
          /><br />
          <span>Street Address</span>
          <input
            class="input is-small"
            v-model="eventName"
            type="text"
            placeholder="Where the party at?"
          /><br />
          <span>Theme:</span>
          <select v-model="themes">
            <option>Ska</option>
            <option>Halloween</option>
            <option>Spice World</option>
            <option>Hip-Hop</option>
            <option>Grunge</option>
          </select><br>

          <button type="submit" class="register" @click="SaveEvent">
            Update Event
          </button>
        </form>
        <event-song-list></event-song-list>
      </div>
    </div>
  </div>
</template>

<script>
import EventSongList from "../components/EventSongList.vue";
import JokeService from "../services/JokeService.js"
export default {
  name: "host-event-page",
  components: {
    EventSongList,
  },
  joke: "",
  eventToUpdate: {
    eventInformation: "",
    eventStatus: Boolean
    
  },
  methods: {
    updateEvent(){

    },
    getJoke(){
      JokeService.get().then((response) => {
           this.joke=response.data;
       })
    }
  }
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
  grid-template-columns: 1.2fr 1fr;
  grid-template-areas: "main-info .";
  margin: 10px;
}
#info-event {
  grid-area: main-info;
  margin: 20px;
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-template-areas:
    ". info"
    ". songList"
    ". form";
}

event-details {
  grid-area: info;
  background-color: rgba(107, 3, 107, 0.698);
  color: white;
}

event-song-list {
  grid-area: songList;
}

form {
  grid-area: form;
  background-color: rgb(241, 12, 241, 0.69);
  color: white;
  margin-top: 10px;
}

a {
  color: white;
}
</style>
