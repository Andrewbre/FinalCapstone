const axiosJoke = require('axios');

export default{
getRandomJoke(){
    return axiosJoke.get(`https://backend-omega-seven.vercel.app/api/getjoke`)
}
}