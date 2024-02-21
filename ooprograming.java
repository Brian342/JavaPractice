public class ooprograming {
    //object = an instance of a class that may contain attributes and methods.
    //example : (phone,desk,computer,coffee,cup)
    //attributes = characteristics that an object has
    //methods = are the different actions that the object can perform.

    public static void main(String[] args){

        //instance of the class
        Car mycar1 = new Car();
        Car mycar2 = new Car();

        System.out.println(mycar2.model);
        System.out.println(mycar2.make);
        System.out.println();
        System.out.println(mycar1.model);
        System.out.println(mycar1.make);

        mycar1.drive();
        mycar2.brake();
    }
}

