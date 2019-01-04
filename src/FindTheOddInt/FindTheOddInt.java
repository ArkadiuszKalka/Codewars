package FindTheOddInt;

public class FindTheOddInt {
    public static void main(String[] args) {
        int[] tablica = {1,1,2,-2,5,2,4,4,-1,-2,5};
        int dlugosc = tablica.length;
        int wynik = 0;
        int answer = 0;
        for (int i = 0; i < dlugosc; i++) {
            wynik = 0;
            for (int j = 0; j < dlugosc; j++) {
                // if(i==j) continue;
                if (tablica[i] == tablica[j]) {
                    wynik++;
                }
            }
            if (wynik % 2 != 0) {
                answer = tablica[i];
            }
        }
        System.out.println(answer);
    }
}
