import java.util.Scanner;

public class logicalOperator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // logical operators = used to connect two or more expressions

        //      both conditions must be true
        //     || = (or) either condition must be true
        //     ! = (not) reverses boolean value of condition
                    
                    // && = (and)
       /*  int temp = 25;

        if (temp>30) {
            System.out.println("It is hot outside");
            
        }
        else if(temp>=20 && temp<=30){
            System.out.println("It is warm outside");
        }
        else{
            System.out.println("It is cold outside");
        } */

                        // Or ||
           /*  Scanner scanner = new Scanner(System.in);
            System.out.println("You are playing a game! press q or Q to quit");
            String responce = scanner.next();

            if (responce.equals("q") || responce.equals("Q")) {
                System.out.println("You quit the game");
            }
            else{
                System.out.println("You are still playing the game!*pew pew*");
            } */
                        // ! (not)
            Scanner scanner = new Scanner(System.in);
            System.out.println("You are playing a game! press q or Q to quit");
            String responce = scanner.next();

            if (!responce.equals("q") && !responce.equals("Q")) {
                System.out.println("You are still playing the game!*pew pew*");
            }
            else{
                System.out.println("You quit the game");
               
            }
    }
}
