<template>
    <div class = "registration" > 
        <form>
             <span>Event Name</span><br>
      <input class= "input is-small"  
        v-model="eventName"
        type="text"
        placeholder="Enter the event name" 
      /><br>
      <span>Event Information</span><br>
      <textarea rows="10" class="textarea has-fixed-size"
        v-model="eventInformation"
        placeholder="Enter the event information" 
      /><br>
      <span>hostName</span><br>
      <input 
        type="text" 
        v-model="hostName" 
        placeholder="Enter the host name"
      />
        <button type="submit" class="register" @click="SaveEvent">Create Event</button>
      </form>
    
    </div>
</template>

<script>
import EventService from "../services/EventService.js"

export default {  
        name: "event-registration-form",
        data() {
            return {
            eventForm: {    
                eventName: "",
                eventInformation: "",
                hostName: "",
                eventStatus: true, 
            },                 
        };
    },
    created(){
        EventService
        .createEvent(this.eventForm)
        .then(response => {
            this.$store.commit("CREATE_EVENT", response.data);
        })
        .catch(error => {
            if (error.response.status == 404){
                this.$router.push({name: 'NotFound'});
            }
        })
    },
        methods: {
            SaveEvent(){
                this.$store.commit("CREATE_EVENT");
                this.$router.push("/");
            } 
        }
        
    
}
</script>

<style scoped>
    input {
        width: 200px;
    }
    form {
        width: 300px;
    }

</style>
