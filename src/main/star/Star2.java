package main.star;

public class Star2 {
    public static void main(String[] args) {

        for(int i =0; i<5; i++){

            //스페이스바
            for(int j = 0; j<5-i; j++){
                System.out.print(" ");
            }
            //별찍기
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

/*
     *
    **
   ***
  ****
 *****
 */
