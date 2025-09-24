public class MathHelper {
    // 1. Create a method called 'calculateSum' that takes two integers 
    //    and returns their sum
    public static int calculateSum (int i1, int i2) {
        int sum = 0; //declares initial sum as 0
        sum += i1; //adds the first integer
        sum += i2; // adds the second integer
        return sum; //returns sum
    }
    
    // 2. Create a method called 'findMin' that takes two integers 
    //    and returns the smaller one

    public static int findMin (int i1, int i2) {
        int result; //declares the result variable
        if (i1 < i2) { // if first integer is less than second integer
            result = i1; // result is first integer
        }
        else { // else then
            result = i2; // result is the second integer
        }
    return result; // returns the result
    }
    
    // 3. Create a void method called 'printResult' that takes an integer 
    //    and prints "The result is: [number]"

        public static void printResult (int number) { // method to print results (void)
        System.out.println("The result is: " + number); // just formats the final answer
    }
    
    public static void main(String[] args) {
        // Test your methods here
        int sum = calculateSum(15, 25);
        int min = findMin(10, 20);
        printResult(sum);
        printResult(min);
    }
}