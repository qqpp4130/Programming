public class Types {
    public static void main(String[] args) {
        // There is multi-type of variable we can use: String, int, float, char, boolean
        // type variable = value;
        String hello = "Hello";// There is multi-type of variable we can use: String, int, float, char, boolean
        // type variable = value;
        String world = "World";
        String sum = hello + world; // String can preform add only.

        System.out.println(sum);    // use System.out.println() to print
    }

    // If the method is defined with type, the return value must match with it.
    public static int[] __Int__() {
        int NUM = 128;
        final int NUMBER = 256;

        NUM += NUM; // similar to c++, the 
        // Applying new value on final value will raised error "cannot assign a value to a final variable"
        // NUMBER = 100;

        return new int[] {NUM,NUMBER}; // use return to give out __Int__() value.
    }

    public static String __str__() {
        String str;
        String hello = "Hello";
        String world = "World";
        str = hello + world + "!";  // String can preform append to the string.


    }
}