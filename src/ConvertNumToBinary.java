import java.util.Arrays;

public class ConvertNumToBinary {
    int num;
    public ConvertNumToBinary (int num) {
        this.num = num;
    }

    public void convert() {
        int i = 0;
        int[] binaryArr = new int[10];
        while (num > 0) {
            binaryArr[i] = num % 2;
            num = num / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.println(binaryArr[j]);
    }
}
