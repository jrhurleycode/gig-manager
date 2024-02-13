<script>
import gigService from '../service/gigService'

export default {
  data() {
    return {
      gigId: '',
      gigs: [],
      newGig: {
        band_name: '',
        gig_name: '',
        venue_name: '',
        gig_date: '',
        doors_open_time: '',
        soundcheck_time: ''
      }
    }
  },
  methods: {
    loadAllGigs() {
      this.gigs = []
      console.log('tests')
      gigService.listAllGigs().then((response) => {
        this.gigs = response.data
        console.log('test')
      })
    },
    loadGigById(id) {
      this.gigs = []
      gigService
        .getGigById(id)
        .then((response) => {
          this.gigs = [response.data]
          console.log(response.data)
        })
        .catch((error) => {
          if (error.response.status == 404) {
            console.log(error)
            alert('No gig with this id')
          }
        })
    },
    submitNewGig() {
      console.log(this.newGig)
      gigService.createGig(this.newGig).then((response) => {
        console.log(response.data)
        this.loadAllGigs()
      })
    },
    deleteGig(id) {
      gigService.deleteGig(id).then((response) => {
        console.log(response.data)
        alert(`Gig ${id} has been deleted.`)
        this.loadAllGigs()
      })
    }
  }
}
</script>

<template>
  <h1>Hello World!</h1>

  <button v-on:click="loadAllGigs">Get all gigs</button>
  <form action="" method="get" v-on:submit.prevent="loadGigById(gigId)">
    <input type="number" name="gigId" id="gigId_input" v-model.number="gigId" />
    <button type="submit">Get Gig by ID</button>
  </form>
  <form action="" method="post" class="createGig" v-on:submit.prevent="submitNewGig">
    <label for="band_name">Band Name</label>
    <input type="text" name="band_name" id="" v-model="newGig.band_name" />

    <label for="gig_name">Gig Name</label>
    <input type="text" name="gig_name" id="" v-model="newGig.gig_name" />

    <label for="venue_name">Venue Name</label>
    <input type="text" name="venue_name" id="" v-model="newGig.venue_name" />

    <label for="gig_date">Date of Show</label>
    <input type="date" name="gig_date" id="" v-model="newGig.gig_date" />

    <label for="doors_open_time">Doors Open</label>
    <input type="time" name="doors_open_time" id="" v-model="newGig.doors_open_time" />

    <label for="soundcheck_time">Soundcheck Time</label>
    <input type="time" name="soundcheck_time" id="" v-model="newGig.soundcheck_time" />

    <button type="submit">Create gig</button>
  </form>
  <ul>
    <li v-for="gig in gigs" v-bind:key="gig.gig_id">
      <p>Band: {{ gig.band_name }}</p>
      <p>Show name: {{ gig.gig_name }}</p>
      <p>Venue Name: {{ gig.venue_name }}</p>
      <p>Day of gig: {{ gig.gig_date }}</p>
      <p>Doors open: {{ gig.doors_open_time }}</p>
      <p>Sound check: {{ gig.soundcheck_time }}</p>
      <button v-on:click="deleteGig(gig.gig_id)">Delete Gig</button>
    </li>
  </ul>
</template>

<style>
.createGig {
  display: flex;
  flex-direction: column;
  width: 300px;
}
</style>
