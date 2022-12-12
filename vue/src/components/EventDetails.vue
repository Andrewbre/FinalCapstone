<template>
  <div id="event-display">
    <h1>{{ this.$store.state.activeEvent.eventName }} {{eventLoaded.eventName}} Playlist</h1>
    <h2 v-bind:class="{ h3: eventLoaded.djId == 1 }">DJ: {{ eventLoaded.djId }}</h2>
    <ul>
      <li>Event Id: {{eventLoaded.eventId}}</li>
      <li>Information: {{eventLoaded.eventInformation}}</li>
      <!-- <li v-for="(value, key) in songList" v-bind:key="key">
        <ul>
          <li>Song: {{ value.songName }}</li>
          <li>Artist: {{ value.artist }}</li>
          <li>Featured Artist: {{ value.featuredArtist }}</li>
            {{loadEvent}}
          <li><br /></li>
        </ul>
      </li> -->
    </ul>
  </div>
</template>

<script>
import EventService from "../services/EventService.js";

export default {
  name: "event-details",
  props: {
      eventId: Number
  },
  data() {
    return {
      eventLoaded: {
        eventId: 2,
        djId: 2,
        eventName: "Karly's Parttty",
        eventInformation: "event information input party",
        hostId: 1,
        eventStatus: true,
      },
    };
  },
  created() {
    EventService
      .getEvent(this.eventLoaded)
      .then(response => {
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
h1 {
  color: rgb(247, 243, 243);
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
</style>
