const fruits = ["사과", "바나나", "오렌지"]

console.log(fruits[1])
const person = {
    name: "홍길동",
    age : 25,
    city : "서울"
}
person.name

const dogs = ["비숑", "포메라니안", "푸들", "시바견", "말티즈"]

dogs[2] = "허스키";

console.log(dogs)

dogs.pop();//배열 멘끝  삭제

dogs.splice(2, 1); // 2인덱스에서 1개 삭제

console.log(dogs)

let numbers = [1,2,3,4,5,]

let filterdNumbers = numbers.filter(num => num === 3);
console.log(filterdNumbers)

numbers.push(6);  //끝자리 추가

console.log(numbers)