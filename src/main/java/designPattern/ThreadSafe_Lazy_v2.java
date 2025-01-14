package main.java.designPattern;

// Lazy Initializtion + Double Checkd Locking
// 1번의 성능 저하를 완화시키는 방법
/*
1번과는 달리, 먼저 조건문으로 인스턴스의 존재 여부를 확인한 다음 두번째 조건문에서 synchronized를 통해 동기화를 시켜 인스턴스를 생성하는 방법

스레드를 안전하게 만들면서, 처음 생성 이후에는 synchronized를 실행하지 않기 때문에 성능저하 완화가 가능함

하지만 완전히 완벽한 방법은 아님
 */
public class ThreadSafe_Lazy_v2{
    private volatile  static ThreadSafe_Lazy_v2 instance;
    private ThreadSafe_Lazy_v2(){}

    public static ThreadSafe_Lazy_v2 getInstance(){
        if(instance == null){
            synchronized ((ThreadSafe_Lazy_v2.class)){
                if(instance == null){
                    instance = new ThreadSafe_Lazy_v2();
                }
            }
        }
        return instance;
    }
}

