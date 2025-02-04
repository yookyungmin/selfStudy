fetch("https://korean-advice-open-api.vercel.app/api/advice", {
    method:'GET',

}).then(response =>{
    if(!response.ok){
        throw new Error("네트워크가 에러")
    }
    return response.json();
}).then(data => {
    console.log(data);
}).catch(error => console.error("fetch Error" + error))

fetch("https://korean-advice-open-api.vercel.app/api/advice",{method:'POST'
, headers:{
    'Content-Type': 'application/json'
    },
    body:JSON.stringify({
        name: 'black',
        age : 30
    })
}).then(response => response.json()).then(data => {
    console.log('success', data)
}).catch(order => {
    console.error("Eroor", Error)
})