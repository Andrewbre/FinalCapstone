<template>
  <div id="event-display">
    <h1>{{ eventName }} All</h1>
    <h2 v-bind:class="{ h3: djId == 1 }">DJ: {{ djId }}</h2>
    <ul>
      <li v-for="(value, key) in songList" v-bind:key="key">
        <ul>
          <li>Song: {{ value.songName }}</li>
          <li>Artist: {{ value.artist }}</li>
          <li>Featured Artist: {{ value.featuredArtist }}</li>
         
          <li><br /></li>
        </ul>
      </li>
    </ul>
  </div>
</template>

<script>
import EventService from "../services/EventService";

export default {
  name: "event-details",
  data() {
    return {
      eventLoaded: {
        eventId: 0,
        djId: 0,
        eventListOfHosts: [],
        eventListOfGenres: [],
        eventName: "",
        eventInformation: "",
      },
    };
  },
  created() {
    EventService.getEvent(this.eventId).then((response) => {
      this.eventLoaded = response.data;
    });
  },
  methods: {},
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
