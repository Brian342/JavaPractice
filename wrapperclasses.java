public class wrapperclasses {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        /* wrappper class = provides a way to use primitive data types as reference data types 
                            reference data types contain useful methods 
                             can be used with collections (ex.Arraylist) 
                             
                             Primitive               wrapper
                             --------                 ---------
                             boolean                   Boolean
                             char                      Character
                             Int                        integer
                             double                     Double
                             
                             autoboxing = the automatic conversion that the java compiler makes between the primitive 
                              types and their corresponding object wrapper classes
                              unboxing = the reverse of autoboxing. automatic convertion of wrapper class to primitive */
                              Boolean a =true;
                              Character b = '@';
                              Integer c = 123;
                              Double d = 3.14;
                              String e = "bro";

                              if(b=='@'){
                                System.out.println("This is true");
                              }
                              
    } 
}
