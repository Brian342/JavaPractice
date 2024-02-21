public class twoDarray {
    public static void main(String[] args) {
        // 2d array = an array of arrays
        String[][] cars = new String[3][3];
        /* String [][] cars = {
                                {"camero","corvette","silverado"},
                                {"mustang","Ranger","F-150"},
                                {"Ferrari","Lambo","Tesla"}
                            }; */
        cars[0][0] = "Camero";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverdo";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "f-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo"; 
        cars[2][2] = "Tesla";

        for(int i= 0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++)
            System.out.print(cars[i][j]+ " ");
        }
       
    }
}
