<template>
  <div id="home">
    <!-- <video src="../images/balloonslogo.mp4" autoplay loop playsinline muted></video> -->
    <div class="container">
      <form action="" class="search-bar">
        <input type="text" placeholder="search" name="q" />
        <button type="submit"><img src="search.png" /></button>
      </form>
    </div>
  </div>
</template>

<script>
//import EventService from "../services/EventService";

export default {
  name: "home",
};
</script>


<style scoped>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}
.container {
  width: 100%;
  min-height: 100vh;
  padding: 5%;
  display: flex;
  align-items: center;
  justify-content: center;
  overflow:hidden;
}

/* #home {
  width: 100%;
  min-height: 100vh;
  background-image:
     url(https://imageio.forbes.com/specials-images/imageserve/5daf1dc2a210800006f02649/Screensavers-VR-has-a-neon-mode-via-FLOAT-LAND/960x0.jpg?height=387&width=711&fit=bounds); 
  background-position: center;
  background-size: cover;
  background-attachment: fixed;
  
} */

.search-bar {
  width: 100%;
  max-width: 700px;
  background: rgba(225, 255, 255, 0.5);
  display: flex;
  align-items: center;
  border-radius: 60px;
  padding: 10px 20px;
}
.search-bar input {
  background: transparent;
  flex: 1;
  border: 0;
  outline: none;
  padding: 24px 20px;
  font-size: 20px;
  color: #cac7ff;

  backdrop-filter: blur(10px) saturated(140%);
}
::placeholder {
  color: #cac7ff;
}

.search-bar button img {
  width: 25px;
}

.search-bar button {
  border: 0;
  border-radius: 50%;
  width: 60px;
  height: 60px;
  background: #58629b;
  cursor: pointer;
}

video {
  z-index: -1;  

  object-fit: cover;
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
}

html, body {
  height: 100%;
}
</style>
