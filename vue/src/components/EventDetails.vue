<template>
  <div id="event-display">
    <h1>{{ this.$store.state.activeEvent.eventName }}  Playlist</h1>
    
    <!-- <ul>
      <li>Event Id: {{eventLoaded.eventId}}</li>
      <li>Information: {{eventLoaded.eventInformation}}</li>
      <li v-for="(value, key) in songList" v-bind:key="key">
        <ul>
          <li>Song: {{ value.songName }}</li>
          <li>Artist: {{ value.artist }}</li>
          <li>Featured Artist: {{ value.featuredArtist }}</li>
            {{loadEvent}}
          <li><br /></li>
        </ul>
      </li>
    </ul> -->
  </div>
</template>

<script>
import EventService from "../services/EventService.js";

export default {
  name: "event-details",
  props: {
      eventId: Number
  },
  components: {
  },
  data() {
    return {
      eventLoaded: {
        eventId: 0,
        djId: 0,
        djName: "",
        eventName: "",
        eventInformation: "",
        hostId: 0,
        eventStatus: true,
      },
    };
  },
  created() {
    EventService
      .getEvent(this.eventId)
      .then(response => {
        console.log(response.data);
        this.$store.commit("SET_ACTIVE_EVENT", response.data);
      })
      .catch(error => {
        if (error.response.status == 404) {
          this.$router.push({name: 'NotFound'});
        }
      });
  },
  methods: {
    
  }
};
</script>

<style scoped>
.event-display{
  background-color: white;
}
h1 {
  color: rgb(255, 255, 255);
  font-size: 2rem;
  font-weight: bold;
}

h2 {
  color: rgb(248, 246, 246);
  font-size: 1.2rem;
  background-color: rgb(205, 64, 224);
}

.h3 {
  color: rgb(0, 0, 0);
  background-color: yellow;
}

li {
  color: yellow;
}

.event-display{
  margin-right: 10px;
}
</style>
