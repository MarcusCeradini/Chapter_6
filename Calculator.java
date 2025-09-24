public class Calculator {
    // TODO: Create multiple versions of a 'multiply' method that can handle:
    // 1. Two integers
    public static int multiply(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    // 2. Three integers
    public static int multiply(int num1, int num2, int num3){
        int result = num1 * num2 * num3;
        return result;
    }
    // 3. Two double values
    public static double multiply(double num1, double num2){
        double result = num1 * num2;
        return result;
    }
    // 4. An integer and a string (repeat the string that many times)
    public static String multiply(int num, String str){
        String result = "";
        for (int i = 0; i < num; i++){
            result = result.concat(str);
        }
        return result;
    }

    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}