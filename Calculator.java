public class Calculator {
    // 1. Two integers
    public static int multiply (int i1, int i2) { // first method
        int result = i1 * i2; // just multiplies the 2
        return result; // returns result
    }
        // 2. Three integers  
    public static int multiply (int i1, int i2, int i3) { // second method with 3 inputs
        int result = i1 * i2 * i3; // multiplies all of them
        return result; // returns result
    }
    // 3. Two double values
    public static double multiply (double i1, double i2) { // third method with doubles
        double result = i1 * i2; // multiplies the doubles
        return result; // returns result
    }
    // 4. An integer and a string (repeat the string that many times)
    public static String multiply (int i1, String i2) { // A string for the 4th because it returns a string
        String result = ""; // defines result
        for (int i=0; i < i1; i++)  // for int less than 3, repeat that many times
            result += i2; // adds the message repeately to result
        return result; // returns result
    }

    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}