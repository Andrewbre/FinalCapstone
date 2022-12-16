<template>
  <div id="event-display">
    <img src="..\images\90skid.gif" />
    <h1>Check out the upcoming events! JuMp ArOuNd!</h1>
    <div class="container">
      <div class="blank"></div>
      <div class="eventz">
        <ul v-for="(value, key) in allEvents" v-bind:key="key">
          <li>
            <router-link v-on:click.prevent="goToEventPage"
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
img {
  z-index: -1;
  object-fit: cover;
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
}
.container {
  display: grid;
  grid-template-columns: 1fr 3fr 1fr;
  grid-template-areas: "blank list blank";
}
.eventz {
  grid-area: "list";
  background-color: rgb(170, 167, 167, 0.7);
  border-radius: 25px;
  border: 2px solid #73ad21;
  padding: 20px;
  font-family: monospace;
}

.blank {
  grid-area: "blank";
}

h1 {
  color: rgb(247, 243, 243);
  font-size: 2rem;
  font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;
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
