<template>
    <div id="event-display">
    <h1>Event: {{eventName}}</h1>
    <dj>DJ: {{djName}}</dj>
    <songList>Songs: {{songList}}</songList>
    </div>
</template>

<script>

export default ({
    name: 'event-details',
    data() {
        return {
            eventName: 'Mousketeers',
            djName: 'Jazzy Fresh',
            songList: 'a lot of songs'
        }

    },
})
</script>

<style scoped>

</style>
