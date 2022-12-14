<template>
  <div id="event-display">
    <!-- <h1>{{ this.$store.state.activeEvent.eventName }} {{eventLoaded.eventName}} Playlist</h1> -->
    <ul>
      <li>Event Name: {{ eventDetails.eventName }}</li>
      <li>Information: {{ eventDetails.eventInformation }}</li>      
    </ul> 
  
  </div>
</template>

<script>
// import EventService from "../services/EventService.js";

export default {
  name: "event-details",
  props: {
      eventId: Number
  },
  components: {
  },
   data() {
     return {
          eventDetails: {},
      }
    
   },  
  created() {   
    this.eventDetails = this.$store.state.activeEvent;         

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
  color: rgb(0, 0, 0);
}

.event-display{
  margin-right: 10px;
}
</style>