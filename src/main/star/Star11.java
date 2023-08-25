package main.star;

public class Star11 {

    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            //공백
            for(int j = 0; j<=i; j++){
                System.out.print(" ");
            }

            //별
            for(int k = 0; k<5-i; k++){
                System.out.print("*");
            }

            //별2
            for (int m = 0; m<4-i; m++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}

/*
역 피라미드
 */