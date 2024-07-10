public class SwapTwoNumbers {
    final int a, b;

    public SwapTwoNumbers (int a, int b) {
        this.a = b;
        this.b = a;
    }

    public String resultString () {
        return "{a: " + a + ", b: " + b + "}";
    }
}
