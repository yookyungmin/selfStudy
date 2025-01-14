package main.java.designPattern;

/*
Initialization on demand holder idiom (holder에 의한 초기화)
클래스 안에 클래스(holder)를 두어 JVM의 클래스 로더 매커니즘과 클래스가 로드되는 시점을 이용한 방법


2번처럼 동기화를 사용하지 않는 방법을 안하는 이유는, 개발자가 직접 동기화 문제에 대한 코드를 작성하면서 회피하려고 하면 프로그램 구조가 그만큼 복잡해지고 비용 문제가 발생할 수 있음. 또한 코드 자체가 정확하지 못할 때도 많음

이 때문에, 3번과 같은 방식으로 JVM의 클래스 초기화 과정에서 보장되는 원자적 특성을 이용해 싱글톤의 초기화 문제에 대한 책임을 JVM에게 떠넘기는 걸 활용함

클래스 안에 선언한 클래스인 holder에서 선언된 인스턴스는 static이기 때문에 클래스 로딩시점에서 한번만 호출된다. 또한 final을 사용해서 다시 값이 할당되지 않도록 만드는 방식을 사용한 것

실제로 가장 많이 사용되는 일반적인 싱글톤 클래스 사용 방법이 3번이다.
 */
public class ThreadSafe_Lazy_v3 {

    private ThreadSafe_Lazy_v3(){
    }

    private static class LazyHolder{
        public static final ThreadSafe_Lazy_v3 Instance = new ThreadSafe_Lazy_v3();
    }

    public static ThreadSafe_Lazy_v3 getInstance(){
        return LazyHolder.Instance;
    }
}
