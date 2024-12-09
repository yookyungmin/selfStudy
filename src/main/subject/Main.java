package main.subject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Print developer = new Print("유경민", "ykmykm4608@naver.com", "1997-02-24");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("실행할 메소드 번호를 입력해주세요 (1: 이름과 이메일, 2: 나이 출력 )");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        developer.printNameAndDomain();
                        break;
                    case 2:
                        developer.PrintAge();
                        break;
                    default:
                        System.out.println("1, 2번중에 하나를 선택해주세요");
                }
            } catch (Exception e) {
                System.out.println("올바른 숫자를 입력해주세요");
            }
        }

//        try{
//            System.out.println("실행할 메소드 번호를 입력해주세요 (1: 이름과 이메일, 2: 나이 출력 " );
//
//            int choice = scanner.nextInt();
//
//            switch (choice){
//                case 1:
//                    developer.printNameAndDomain();
//                    break;
//                case 2:
//                    developer.PrintAge();
//                    break;
//                default:
//                    System.out.println("1, 2번중에 하나를 선택해주세요");
//            }
//        }catch (Exception e){
//            System.out.println("올바른 숫자를 입력해주세요");
//        }finally { //예외처리 상관없이 무조건 실행
//            scanner.close();
//        }
    }

}