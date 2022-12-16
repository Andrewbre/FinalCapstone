<template>
  <div id="event-display">
    <video
      src="..\images\tiedye.mp4"
      autoplay
      loop
      playsinline
      muted
    ></video>
    <h1>Check out the upcoming events! JuMp ArOuNd</h1>
    <div class="container">
    <div class="blank"></div>
    <div class="eventz">
      <ul v-for="(value, key) in allEvents" v-bind:key="key">
        <li>
          <router-link
            :to="{
              name: 'guest-event-page',
              params: { eventId: value.eventId },
            }"
            >{{ value.eventName }}</router-link
          >
        </li>
      </ul>
    </div>
    </div>
  </div>
</template>

<script>
import EventService from "../services/EventService";

export default {
  name: "all-events",
  data() {
    return {
      allEvents: [],
      eventName: "",
    };
  },
  created() {
    EventService.getAllEvents().then((response) => {
      this.allEvents = response.data;
    });
  },
  methods: {
    goToEventPage() {
      EventService.getEventByEventName(this.eventName).then((response) => {
        console.log(response.data);
        this.$router.push({
          name: "guest-event-page",
          params: { eventId: response.data.eventId },
        });
      });
    },
  },
};
</script>

<style scoped>
.container {
  display: grid;
  grid-template-columns: 1fr 3fr 1fr;
  grid-template-areas: "blank list blank";
}
.eventz {
  grid-area: "list";
  background-color: rgb(170, 167, 167, 0.7);
  border-color: gold;
  border-width: 10px;
  font-family: Impact, Haettenschweiler, "Arial Narrow Bold", sans-serif;
}

.blank {
  grid-area: "blank";
}

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
  color: rgb(37, 37, 7);
  font-size: 25px;
}

a {
  color: orange;
}
</style>
