package main.subject;

import main.Lv1.EmptyNumberPlus;

import java.util.Calendar;

class YKM {

    protected String name;

    protected String email;

    protected String birthDay;

    /*
    public 멤버 : public 은 '공개'를 나타내며, 모든 클래스에서 접근이 가능합니다 (패키지와 상관없음)
    private 멤버 : private은 '비공개'를 나타내며, 같은 클래스안에 있는 멤버들만 접근이 가능합니다.
    protected 멤버 : 같은 패키지안의 모든 클래스와, 다른 패키지의 자식 클래스에서 접근이 가능합니다.
    default(생략) 멤버 : 접근지정자가 없으면 default 멤버로, 같은 패키지안의 클래스에서만 접근이 가능합니다.

     */

    //기본 생성자
    public YKM(){
        this.name = "Unknown";
        this.email = "Unknown";
        this.birthDay = "Unknown";
    }

    public YKM(String name, String email, String birthDay) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
    }

    public void printInfo(){
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("생년월일 : " + birthDay);
    }
}


class Print extends  YKM{

    //부모 클래스의 생성자가 기본 생성자(파라미터가 없는 생성자)인 경우에는 super()를 생략할 수 있다.

    public Print(String name, String email, String birthDay) {
        super(name, email, birthDay);
    }

    public void printNameAndDomain() {

        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println("개발자 이름은 :" + name);
        System.out.println("개발자는 " +  domain + "메일을 사용합니다");
    }

    public void PrintAge(){

        //생년월일을 연도, 월, 일로 분리

        String[] birthParts = birthDay.split("-");
        int birthYear = Integer.parseInt(birthParts[0]);
        int birthMonth = Integer.parseInt(birthParts[1]);
        int birthDay = Integer.parseInt(birthParts[2]);


        //현재 날짜 가져오기
        Calendar today = Calendar.getInstance();
        int currentYear = today.get(Calendar.YEAR);
        int currentMonth = today.get(Calendar.MONTH) + 1;//0부터 시작하므로
        int currentDay = today.get(Calendar.DAY_OF_MONTH);

        //나이 계산
        int age = currentYear - birthYear;
        if(currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)){
            age--;
        }

        System.out.println("개발의 나이는 만 " + age + "세 입니다");

    }
}


