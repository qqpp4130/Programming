public class Types {
    private static boolean myBool = true;
    public static void main(String[] args) {
        // There is multi-type of variable we can use: String, int, float, char, boolean
        // type variable = value;
        System.out.println(__int__());    // include the function with () to point to the funciton
        // System.out.println(__int__); wont work
        System.out.println(__str__());

    }

    // If the method is defined with type, the return value must match with it.
    public static int[] __int__() {
        int NUM = 128;
        final int NUMBER = 256;

        NUM += NUM; // can use c++ syntax
        NUM++;  // NUM=128+128+1=257
        // Applying new value on final value will raised error "cannot assign a value to a final variable"
        // NUMBER = 100;

        return new int[] {NUM,NUMBER}; // use return to give out __Int__() value.
    }

    public static String __str__() {
        String str;
        String hello = "Hello";
        String world = "World";
        str = hello + world + "!";  // String can preform append to the string.

        return str;
    }

    public static char __char__() {
        char chr = '?'; // char type only accecpt single quote. Also with special 
        String str = __str__();
        for (int i = 0; i < str.length(); i++){
            if (myBool){    /* only static global variable can share in class, private means only effective
                in class methods */
                myBool = false;
                chr = str.charAt(i);
                continue;
            }
        }

        return chr;
    }
}