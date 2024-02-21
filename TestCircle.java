import java.util.Scanner;
public class TestCircle {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        System.out.println("Enter your radius->");
        double radius = cin.nextDouble();

        //create/parameterize object
        circle c2 = new circle(radius);
        System.out.println(c2.toString());
        System.out.println(c2);

        // //use the no argument constructor
        // circle c1 = new circle();

        // //call tosring with c1
        // System.out.println(c1.toString());//explicit call to tostring object name.to string()
        // System.out.println(c1);//implicit call to tostring ...when you pass an object name as an argurment is same way calling the object only

    }
}
