<template>
  <div>
    <video src="../images/testvid.mp4" autoplay loop playsinline muted></video>
    <div id="info-event"><event-details></event-details></div>
  </div>
</template>

<script>

import EventDetails from "../components/EventDetails.vue";

export default {
  name: "host-event-page",
  components: {
    EventDetails,
  },
};
</script>


<style>
/* body {
  background-image: url("../images/grand teton.webp");
} */
video {
  z-index: -1;

  object-fit: cover;
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
}

#info-event {
  background-color: rgba(107, 3, 107, 0.698);
  width: 300px;

}
</style>
