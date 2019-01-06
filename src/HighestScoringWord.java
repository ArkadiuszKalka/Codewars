public class HighestScoringWord {
    public static void main(String[] args) {
        int wartosc = 0;
        int maxwartosc = 0;
        String maxstring = "";
        String s = "man i need a taxi up to ubud";
        String[] tablica = s.split(" ");
        int dl = tablica.length;
        int dlSlowa = 1;
        char[] slowo;
        for (int i = 0; i < dl; i++) {
            wartosc = 0;
            slowo = tablica[i].toCharArray();
            dlSlowa = slowo.length;
            for (char a : slowo) {
                wartosc = wartosc + (int) a-96;
            }
            if (wartosc>maxwartosc){
                maxwartosc=wartosc;
                maxstring=tablica[i];
            }
        }
        System.out.println(maxstring);
    }

}

