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
  }
}
