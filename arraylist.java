import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){
        /* Arraylist = a resizable array.
                        Elements can be added and removed after compilation phase
                        Store reference data type */ 

        ArrayList<String> food = new ArrayList<String>();
        //ArrayList<Integer> uing of wrapper class
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0,"sushi"); // replaces elements in the arraylist
        food.remove(2);//removes elements in the specified index
        food.clear();//removes elements inside an array

        for(int i = 0; i<food.size();i++){
            System.out.println(food.get(i));
        }

    }
}
