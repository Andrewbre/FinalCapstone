<template>
<div class = "eventRegistration">
    <h1>Event Registration</h1>
    <event-registration-form> </event-registration-form>
</div>    
</template>

<script>
//import authService from "../services/AuthService";
import EventRegistrationForm from "../components/EventRegistrationForm.vue"
    export default {
        name: "event-register",
        components: {
            EventRegistrationForm,

        }

    }
</script>

<style>

</style>
