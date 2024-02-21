public class array {
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable

        // String[] cars = {"Camero","Corvette","Tesla","Jeep"};
        // cars[0]="Mustang";

        // System.out.println(cars[3]);
        String[]cars = new String[3];
        cars[0]="Jeep";
        cars[1]="BMW";
        cars[2]="Tesla";

        // System.out.println(cars[0]);
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }


    }
}
