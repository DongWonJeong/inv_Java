package week02.array;

public class Arr03 {
    public static void main(String[] args) {
        //얕은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = a;

        b[0] = 3;
        System.out.println(a[0]);
    }
}
