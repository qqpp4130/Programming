public class Types {
    // type variable = value;
    public static void main(String[] args) {  
        // byte  
        System.out.println("Basic Type: byte Binary size: " + Byte.SIZE);  
        System.out.println("Package: java.lang.Byte");  
        System.out.println("Minimum: Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("Maximum: Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("Basic Type: short Binary size: " + Short.SIZE);  
        System.out.println("Package: java.lang.Short");  
        System.out.println("Minimum: Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("Maximum: Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("Basic Type: int Binary size: " + Integer.SIZE);  
        System.out.println("Package: java.lang.Integer");  
        System.out.println("Minimum: Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("Maximum: Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("Basic Type: long Binary size: " + Long.SIZE);  
        System.out.println("Package: java.lang.Long");  
        System.out.println("Minimum: Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("Maximum: Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("Basic Type: float Binary size: " + Float.SIZE);  
        System.out.println("Package: java.lang.Float");  
        System.out.println("Minimum: Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("Maximum: Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("Basic Type: double Binary size: " + Double.SIZE);  
        System.out.println("Package: java.lang.Double");  
        System.out.println("Minimum: Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("Maximum: Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("Basic Type: char Binary size: " + Character.SIZE);  
        System.out.println("Package: java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("Minimum: Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("Maximum: Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
    }
}