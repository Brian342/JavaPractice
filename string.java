public class string {
  public static void main(String[] args) {
    // String = a reference data type that can store one or more characters 
    //          reference data types have access to useful methods.
    String name = "Brian";
    // boolean result = name.equals("Brian");  used to compare two variables if they are alike
    // int result = name.length();   check the length of the string
    // char result =name.charAt(0);
    // int result = name.indexOf("B"); returns the location of a character
    // boolean result = name.isEmpty();
    // String result = name.toUpperCase(); change string to uppercase
    // String result = name.toLowerCase(); change string to lowercase
    // String result = name.trim(); removes all the space/ whitespace on the string variable 
    String result = name.replace("Brian", "paul");

    System.out.println(result);
  }
}
  