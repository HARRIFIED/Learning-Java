
public class Main {
    public static void main(String[] args) {
        //Swap two numbers
        SwapTwoNumbers obj = new SwapTwoNumbers(2, 5);
        String result = obj.resultString();
        System.out.println(result);

        //Factorial of a number
        Factorial num = new Factorial(5);
        int factorial = num.getFactorial();
        System.out.println(factorial);

        //Convert decimal to binary
        ConvertNumToBinary dec = new ConvertNumToBinary(17);
        dec.convert();
    }
}