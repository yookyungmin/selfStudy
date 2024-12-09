package main.Any;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssist {

    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Song", 22));
        customers.add(new Customer("Kim", 31));
        customers.add(new Customer("Park", 32));
        customers.add(new Customer("Yoo", 25));
        customers.add(new Customer("Choi", 27));

        //스트림 사용
        List<String> customersNames = customers.stream()
                .filter(customer -> customer.getAge()>30)
                .sorted()
                .map(Customer::getName)
                .collect(Collectors.toList());

        for(String str :customersNames){
            System.out.println(str);
        }

        System.out.println();

        List<Customer> list = new ArrayList<>(); //새로운 리스트

        for(Customer customer : customers){
            if(customer.getAge ()>30){
                list.add(customer);
            }
        } //age > 30 추출

        Collections.sort(list); // 오름차순 정렬

        List<String> result = new ArrayList<>();

        //result list에 list의  customer 이름값
        for(Customer customer : list){
            result.add(customer.getName()); //list는 제네릭이 String이라서
        }

        for(String name : result){
            System.out.println(name);
        }



    }
}
