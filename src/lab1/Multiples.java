package lab1;

public class Multiples {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++){
            boolean divBy3 = (i % 3 == 0);
            boolean divBy5 = (i % 5 == 0);
            if (divBy5 || divBy3){
                System.out.println(i);
            }
        }
    }
}
