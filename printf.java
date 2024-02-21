public class printf {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        /*printf() = an optional method to control, format, and display text to the console window
         *           two arguments = format String + (object/variable/alue)
         *           % [flags] [precision] [width] [conversion-character]
         */
        //System.out.printf("This is a format String %d",123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        //[conversion-character]
        // System.out.printf("%b",myBoolean);//for boolean value
        // System.out.println();
        // System.out.printf("%c",myChar);//for character
        // System.out.println();
        // System.out.printf("%s",myString);//for string
        // System.out.println();
        // System.out.printf("%d",myInt);//for integer
        // System.out.println();
        // System.out.printf("%f",myDouble);//for double

        //[width]
        // minimum number of characters to be written as output 
        //  System.out.printf("Hello %10s",myString);
        
        //[precision]
        //sets number of digits of precision when outputting floating-point values
        //System.out.printf("you have this much money %.2f",myDouble);

        //[flags]
        //adss an effect to output based on the flag added to format specifier
        //- :  left-justify
        //+ :  output a plus (+) or minus (-) sign for a numeric value
        //0 :  numeric values are zero-padded
        //, :  comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %,f",myDouble);
    }
}
