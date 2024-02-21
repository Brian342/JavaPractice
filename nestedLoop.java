import java.util.Scanner;

public class nestedLoop {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // nested loops = a loop inside of a loop

        Scanner scanner = new Scanner(System.in);
        int rows;  // outer loop
        int columns;  // inner loop
        String symbol = "";

        System.out.println("Enter numbers of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter numbers of columns: ");
        columns = scanner.nextInt();

        
        System.out.println("Enter a Symbol of your choosing ");
        symbol = scanner.next();

         for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }

         }


    }
}
