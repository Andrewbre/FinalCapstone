var jokeAxios = require('axios');

var config = {
  method: 'get',
  url: 'https://backend-omega-seven.vercel.app/api/getjoke',
  headers: { }
};

jokeAxios(config)
.then(function (response) {
  console.log(JSON.stringify(response.data));
})
.catch(function (error) {
  console.log(error);
});

// import axios from 'axios';

// const http = axios.create({
//   baseURL: "http://localhost:3000"
// });

// export default {

//   getBoards() {
//     return http.get('/boards');
//   },

//   getCards(boardID) {
//     return http.get(`/boards/${boardID}`)
//   },

//   getCard(boardID, cardID) {
//     return http.get(`/boards/${boardID}`).then((response) => {
//       const cards = response.data.cards;
//       return cards.find(card => card.id == cardID);
//     })
//   }

// }
