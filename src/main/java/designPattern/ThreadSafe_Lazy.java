package main.java.designPattern;

//멀티 스레드 환경에서 안전한 싱글톤 만드는방법

/*
즉, 싱글톤 패턴은 '하나'의 인스턴스만 생성하여 사용하는 디자인 패턴이다.

인스턴스가 필요할 때, 똑같은 인스턴스를 만들지 않고 기존의 인스턴스를 활용하는 것!

생성자가 여러번 호출되도, 실제로 생성되는 객체는 하나이며 최초로 생성된 이후에 호출된 생성자는 이미 생성한 객체를 반환시키도록 만드는 것이다

(java에서는 생성자를 private으로 선언해 다른 곳에서 생성하지 못하도록 만들고, getInstance() 메소드를 통해 받아서 사용하도록 구현한다)


#왜 쓰나요?
먼저, 객체를 생성할 때마다 메모리 영역을 할당받아야 한다. 하지만 한번의 new를 통해 객체를 생성한다면 메모리 낭비를 방지할 수 있다.

또한 싱글톤으로 구현한 인스턴스는 '전역'이므로, 다른 클래스의 인스턴스들이 데이터를 공유하는 것이 가능한 장점이 있다.


 */
public class ThreadSafe_Lazy {

    private static ThreadSafe_Lazy instance;

    private ThreadSafe_Lazy(){};

    public static synchronized ThreadSafe_Lazy getInstance(){
        if(instance == null){
            instance = new ThreadSafe_Lazy();
        }
        return instance;
    }
}

/*
private static 으로 인스턴스 변수 만듬

private 으로 생성자를 만들어 외부에서의 새성을 막음
synchronized 동기화를 활용해 스레드를 안전하게 만듬
 synchronized는 성능저하를 발생시키므로 권장하지 않는방법이라고 한다
 */
