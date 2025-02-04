function hello(){
    console.log('안녕');
}
//함수정의

// hello(); //함수 호출

function hello(x) {
    // console.log(x);
    // console.log('안녕2');

    return x;
}

// hello(2);
let hello1 = hello(3);
console.log(hello1)
