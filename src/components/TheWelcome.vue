<script>
import gigService from '../service/gigService'

export default {
  data() {
    return {
      gigs: [],
      gigId: ''
    }
  },
  methods: {
    loadAllGigs() {
      this.gigs = []
      gigService.listAllGigs().then((response) => {
        this.gigs = response.data
      })
    },
    loadGigById(id) {
      this.gigs = []
      gigService.getGigById(id).then((response) => {
        this.gigs = response.data
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
  <ul>
    <li v-for="gig in gigs" v-bind:key="gig.gig_id">
      <p>Band: {{ gig.band_name }}</p>
      <p>Show name: {{ gig.gig_name }}</p>
      <p>Venue Name: {{ gig.venue_name }}</p>
      <p>Day of gig: {{ gig.gig_date }}</p>
      <p>Doors open: {{ gig.doors_open_time }}</p>
      <p>Sound check: {{ gig.soundcheck_time }}</p>
    </li>
  </ul>
</template>
