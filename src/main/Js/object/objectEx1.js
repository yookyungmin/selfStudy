/*
this 키워드
일반함수 호출, 객체의 메서드 호출

프로토타입
모든 우리가 흔히 쓰는 이미 자바스크립트에서 만들어져 있는 메서드들을 담은 큰바구니

 프로토타입 체인
 부모 객체의 메소드나 속성에 접근할수 있다.
 */

const person = {
    name: 'blade',
    age: 32,
    greet: function(){
     console.log(this.name)
    }
}

person.name
person.age
person.greet()

function showThis(){
    console.log(this);
}
showThis()
person.greet()

function Person(name){
    this.name = name;
}

const p = new Person("Bob");
console.log(p.name);


function Animal(name){
    this.name = name;
}

Animal.prototype.speak = function(){
    console.log(this.name);
}
const dog = new Animal("Dog");
dog.speak();