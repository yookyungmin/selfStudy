package main.star;

public class Star10 {
    public static void main(String[] args) {


        for(int i = 0; i<5; i++){

            //공백찍기
            for(int j = 0; j<=5-i; j++){
                System.out.print(" ");
            }

            //별찍기
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }

            //별찍기2
            for(int k = 0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
피라미드 별찍기
 */