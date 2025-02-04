/*
프로미스(Promise) 약속

프로미스는 배달이 올지 말지 약속한것과  같습니다
음식도착 -> 성공
음식도착x -> 실패


async await
배달을 기다리는 동안 마치 잠시 기다렸다가 음식이 오면 먹는것처럼 동작
=> 주문이 완료 될떄까지 기다리다가 그사이에 다른일을 할수 있다.
 async 음식이 도착할 때까지 기다리는 구간
 await 음식이 도착한 후에 일들을 처리
 */

const orderFood = new Promise((resolve, reject) => {
    const isDelivered = true;
    if(isDelivered == true){
        resolve("음식이 배달됨")
    }else{
        reject('배달이 실패'
        )
    }
})

//
// async function orderAndEat(){
//     console.log('음식을 주문했어요')
//
//     co
// }


function orderFoods(food, callback){
    console.log(`${food} 주문을시작해요`)
    setTimeout(function (){
        console.log(`${food}가 배달 되었습비다.`);
        callback();
    }, 3000)
}

// orderFoods('피자', function (){
//     console.log('맛있게먹어요')
// })


const orderFood2 = new Promise((resolve, reject)=> {
    const isDlivered = true;

    if(isDlivered){
        resolve('음식이 배달되었습니다')
    } else{
        reject('배달이 실패했어요')
    }
})

orderFood2.then((message) => {
    console.log(message)
    console.log('맛있게 드셈');
}).catch((error)=>{
    console.log(error)
})


const orderFood3 = new Promise((resolve, reject)=> {
    const isDlivered = false;

    if(isDlivered == true){
        resolve('음식이 배달되었습니다')
    } else{
        reject('배달이 실패했어요')
    }
})

orderFood3.then((message) => {
    console.log(message)
    console.log('맛있게 드셈');
}).catch((error)=>{
    console.log(error)
})

function deliverFood(){
    return new Promise((resolve) => {
        setTimeout(()=>{
            resolve('음식이배달됨 수고')
        }, 4000)
    })
}

async function orderAndEat(){
    console.log('음식을 주문했어요요')
    const message = await deliverFood();
    console.log(message)
    console.log("이제 음식을 먹어요")
}
orderAndEat()


fetch(url, options)