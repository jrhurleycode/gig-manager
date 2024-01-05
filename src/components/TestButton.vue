<script>
// const API_ROOT = 'localhost:9000'
export default {
  data: () => ({
    tableData: null
  }),
  methods: {
    async getGigs () {
      // data = await fetch(`${API_ROOT}/gigs`)
      this.tableData = 'data has been got'
      console.log('asdfasdf')
    }
  }
}

</script>

<template>
<div class="container">
  <button type="button" @click="getGigs">Get Gigs</button>
  <div class="dataOutput">{{ tableData }}</div>
</div>
</template>

<style scoped>

.container {
  text-align: center;
  width: 100%;
}

.dataOutput{
  font-size: 2em
}

button {
  font-size: 2em;
  padding: .5em;
  line-height: .5em;
}

</style>