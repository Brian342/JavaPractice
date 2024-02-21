import java.util.*;
public class pointOfSale {
    public static void main(String[] args) {

    Scanner cin = new Scanner(System.in);
    System.out.print("Enter the number of items: ");
    int listsize = cin.nextInt();

    String[]shop = new String[listsize];
    Double[]price = new Double[listsize];

    for(int i=0; i<listsize; ++i){
        System.out.print("Enter item "+ (i + 1) +"->" );
        shop[i] = cin.nextLine();
        cin.nextLine();

        System.out.print("Enter item price "+ (i+1) +"->");
        price[i] = cin.nextDouble();
        

    }
    Arrays.sort(price);
    
    // print out the sorted list
    System.out.println("\nSorted shopping list:");
        for (int i = 0; i < listsize; i++) {
            int index = Arrays.binarySearch(price, price[i]);
            System.out.println(shop[index] + " $" + price[i]);
}
}
}




