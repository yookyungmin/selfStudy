//함수 선언식과 함수표현식으로 차이는 호이스팅
/*
호이스팅 = 함수 정의문을 끌어올린다
어느 위치에서든 이미 함수를 작성을 하면 해당 함수 정의문은 해당 코드파일 최상단에 위치, 어느 위치에서든 함수를 호춣면 실행
 */


hello();
//함수 호출문
function hello(){
    console.log("hello");
}
//함수 정의문


const hello2 = function(){
    console.log('hello2')
}
hello2();
///함수표현식 호이스팅 적용안됨

hello3()
const hello3 = function(){
    console.log('hello3')
}