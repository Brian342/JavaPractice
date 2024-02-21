public class methods {
    public static void main(String[] args) {
        /* Method = a block of code that is executed whenever it is called upon eg main method */
        // String name = "Brian";
        // int age = 21;
        // hello(name,age);   // passing an arguments
        int x = 3;
        int y = 4;

        int z =add(x,y); //local variable z

        System.out.println(z);
        System.out.println(add(x,y));

    }
    // static void hello(String title,int age){ // passing a parameter
    //     System.out.println("HELLO "+ title +" you are "+age);
    //}
    static int add(int x, int y) {
        @SuppressWarnings("unused")
        int z = x + y;

        //return z;
        return x + y;
    }
}
