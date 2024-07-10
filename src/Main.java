
public class Main {
    public static void main(String[] args) {
        Second myObj = new Second(10, "Angel");
        int res = myObj.num;
        String res2 = myObj.model;
        System.out.println(Second.secondMethod(res));
        System.out.println(res);
        System.out.println(res2);
    }
}