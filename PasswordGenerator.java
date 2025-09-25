public class PasswordGenerator {
    
    // Create methods to generate:
    // 1. A random lowercase letter
    public static char getRandomLower(){
        char randomLower = (char) (int) (97 + Math.floor(Math.random() * 26)); // generate random number and multiple by 26 due to alphabet characters
        return randomLower;
    }

    // 2. A random uppercase letter  
    public static char getRandomUpper(){
        char randomUpper = (char) (int) (65 + Math.floor(Math.random() * 26)); // generate random number and multiple by 26 due to alphabet characters, same logic but with different ASCII values
        return randomUpper;
    }

    // 3. A random digit character
    public static char getRandomDigit(){
        char randomDigit = (char) (int) (48 + Math.floor(Math.random() * 9)); // generate random number and multiple by 9 due to number, same logic but with different ASCII values
        return randomDigit;
    }

    // 4. A random special character from: !@#$%^&*
    public static char getRandomSpecial(){
        String specials = "!@#$%^&*";
        int random_selector = (int) Math.floor(Math.random() * 8);  
        char randomSpecial = specials.charAt(random_selector);
        return randomSpecial;
    }

    // 5. A method that generates a password of specified length containing a mix of all character types
    public static String generatePassword(int i1){
        String password = "";
        for (int i = 0;  i< i1; i++) {
            String specials = "!@#$%^&*";
            int random_selector = (int) Math.floor(Math.random() * 8);  
            char randomSpecial = specials.charAt(random_selector);
            char randomDigit = (char) (int) (48 + Math.floor(Math.random() * 9)); // generate random number and multiple by 9 due to number, same logic but with different ASCII values
            char randomUpper = (char) (int) (65 + Math.floor(Math.random() * 26)); // generate random number and multiple by 26 due to alphabet characters, same logic but with different ASCII values
            char randomLower = (char) (int) (97 + Math.floor(Math.random() * 26)); // generate random number and multiple by 26 due to alphabet characters
            int randomnum = (int) Math.ceil(Math.random() * 4);
            if (randomnum == 1)
                password += randomSpecial;
            if (randomnum == 2)
                password += randomDigit;
            if (randomnum == 3)
                password += randomUpper;
            if (randomnum == 4)
                password += randomLower;
        }
        return password;
    }
    
    public static void main(String[] args) {
        System.out.println("Random lowercase: " + getRandomLower());
        System.out.println("Random uppercase: " + getRandomUpper());
        System.out.println("Random digit: " + getRandomDigit());
        System.out.println("Random special: " + getRandomSpecial());
        System.out.println("8-character password: " + generatePassword(8));
    }
}