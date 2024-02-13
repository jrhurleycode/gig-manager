import axios from 'axios'

const http = axios.create({
  baseURL: 'http://localhost:9000'
})

export default {
  listAllGigs() {
    return http.get('/gig')
  },

  getGigById(id) {
    return http.get(`/gig/${id}`)
  },
  createGig(gig) {
    return http.post('/gig', {
      band_name: gig.band_name,
      gig_name: gig.gig_name,
      venue_name: gig.venue_name,
      gig_date: gig.gig_date,
      doors_open_time: gig.doors_open_time,
      soundcheck_time: gig.soundcheck_time
    })
  },
  deleteGig(id) {
    return http.delete(`/gig/${id}`)
  }
}
