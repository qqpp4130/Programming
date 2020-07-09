public class Types {
    // type variable = value;
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;
    // Different type of data can be transform from low to high; needs forcing to go to lower value.
    // Low ------------------------------------- High
    // (byte,short,char) —> int —> long—> float —> double         // Different type of data can be transform from low to high; needs forcing to go to lower value.
        // Low ------------------------------------- High
        // byte,short,char—> int —> long—> float —> double 
    public static void types() {
        // byte  
        System.out.println("Basic Type: byte Binary size: " + Byte.SIZE);  
        System.out.println("Package: java.lang.Byte");  
        System.out.println("Default value of byte: " + by);
        System.out.println("Minimum: Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("Maximum: Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  

        // short
        System.out.println("Basic Type: short Binary size: " + Short.SIZE);  
        System.out.println("Package: java.lang.Short");  
        System.out.println("Default value of short: " + sh);
        System.out.println("Minimum: Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("Maximum: Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int
        System.out.println("Basic Type: int Binary size: " + Integer.SIZE);  
        System.out.println("Package: java.lang.Integer");
        System.out.println("Default value of int: " + i);
        System.out.println("Minimum: Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("Maximum: Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long
        System.out.println("Basic Type: long Binary size: " + Long.SIZE);  
        System.out.println("Package: java.lang.Long");
        System.out.println("Default value of long: " + l);
        System.out.println("Minimum: Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("Maximum: Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float
        System.out.println("Basic Type: float Binary size: " + Float.SIZE);  
        System.out.println("Package: java.lang.Float");
        System.out.println("Default value of float: " + f);
        System.out.println("Minimum: Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("Maximum: Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double
        System.out.println("Basic Type: double Binary size: " + Double.SIZE);  
        System.out.println("Package: java.lang.Double");
        System.out.println("Default value of double: " + d);
        System.out.println("Minimum: Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("Maximum: Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char
        System.out.println("Basic Type: char Binary size: " + Character.SIZE);  
        System.out.println("Package: java.lang.Character");
        System.out.println("Default value of char: " + ch);
        // Numerical value of min max value
        System.out.println("Minimum: Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        System.out.println("Maximum: Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);
        System.out.println();  

        // String
        System.out.println("Default value of String: " + str);
        System.out.println();  
        
        // boolean
        System.out.println("Default value of boolean: " + bool);
        // System.out.println();
    }

    public static void convert() {
        char c1='a';    //定义一个char类型
        int i1 = c1;    //char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';  //定义一个char类型
        int i2 = c2+1;  //char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
    }
    public static void main(String args) {
        switch(args) {
            case "print":
              types();
              break;
            case "convert":
              convert();
              break;
            default:
              System.out.println("Use argument \"print\", \"convert\" to run certain code block.\n");
              types();
              convert();
          }
    }
}