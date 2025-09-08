package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(2));
    }

    public static int reduce(int n){
        int out = 0;
        while (n != 0){
            if (n % 2 == 0){
                n = n / 2;
            } else {
                n = n - 1;
            }
            out = out + 1;
        }
        return out;
    }
}
