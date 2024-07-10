public class Factorial {
    int num;
    public Factorial (int num) {
        this.num = num;
    }
    public int getFactorial() {
        int fac = 1;
        for (int i = num; i > 0; i--) {
          fac *= i;
        }
        return fac;
    }
}
