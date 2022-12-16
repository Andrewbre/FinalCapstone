<template>
  <div id="event-display">
    <!-- <h1>{{ this.$store.state.activeEvent.eventName }} {{eventLoaded.eventName}} Playlist</h1> -->
    <ul>
      <li id="eventName">{{ eventDetails.eventName }}</li>
      <li>{{ eventDetails.eventInformation }}</li>
    </ul>
    <img src="..\images\sinbad.gif" />
    
    <div>
     {{ joke[0].question }} 
  ***hover below***<br/>
      <span id="punchline">{{ joke[0].punchline }}</span>
    </div>
  </div>
</template>

<script>
// import EventService from "../services/EventService.js";
import JokeService from "../services/JokeService.js";

export default {
  name: "event-details",
  props: {
    eventId: Number,
  },
  components: {},
  data() {
    return {
      eventDetails: {},
      joke: []
    };
  },
  created() {
    this.eventDetails = this.$store.state.activeEvent;

    JokeService.getRandomJoke().then((response) => {
      let stringReturn = JSON.stringify(response.data);
      //stringReturn = stringReturn.replaceAll('\'','\'\'');
      //stringReturn = stringReturn.replaceAll('"','');
      //console.log(stringReturn);
      console.log(JSON.parse(stringReturn));
      this.joke = JSON.parse(stringReturn);
    });
  },

  methods: {},
};
</script>

<style scoped>
img {
  height: 300px;
}
#event-display {
  background-color: rgb(14, 185, 157, 0.7);
  margin-right: 20px;
  margin-left: 20px;
  padding: 10px;
  border-radius: 25px;
  border: 2px solid #73AD21;
  padding: 20px;
}
#eventName {
  font-size: 20px;
  color: white;
}
.event-display {
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
}

.h3 {
  color: rgb(0, 0, 0);
  background-color: yellow;
}

li {
  color: rgb(0, 0, 0);
}

.event-display {
  margin-right: 10px;
}

#punchline {
  color: rgb(14, 185, 157, 0);
  font-size: 17px;
}
#punchline:hover {
  color: black;
  font-size: 17px;
}
</style>