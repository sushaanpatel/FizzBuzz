package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int out = 0;
        for (int i = 1; i < n; i++){
            boolean divBy3 = (i % a == 0);
            boolean divBy5 = (i % b == 0);
            if (divBy5 || divBy3){
                out = out + 1;
            }
        }
        return out;
    }
    public static int multiples() {
        int out = 0;
        for (int i = 1; i < 1000; i++){
            boolean divBy3 = (i % 3 == 0);
            boolean divBy5 = (i % 5 == 0);
            if (divBy5 || divBy3){
                out = out + 1;
            }
        }
        return out;
    }
}
