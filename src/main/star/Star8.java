package main.star;

public class Star8 {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){

            //2, 스페이스바
            for(int j = 0; j<i; j++ ){
                System.out.print(" ");
            }

            //별찍기
            for(int k = 0; k<5-i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }




        /*
           *****
            ****
             ***
              **
               *
         */

    }
}
