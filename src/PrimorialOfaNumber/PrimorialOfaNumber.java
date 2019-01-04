package PrimorialOfaNumber;

public class PrimorialOfaNumber {
    public static void main(String[] args) {
        int n = 9;
        int a = 1;
        int count;
        int i = 1;
        long wynik=1;
        while (a <= n) {
            count = 1;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                if (i > 1) {
                    System.out.println(i);
                    wynik=wynik*i;
                    a++;
                }
            }
            i++;

        }

        System.out.println(wynik);
    }
}
