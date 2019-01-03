package WriteNumberInExpandedForm;

public class WriteNumberinExpandedForm {
    public static void main(String[] args) {
        int a = 12;
        String aString = Integer.toString(a);
        String temp;
        double temp2;
        double pow;
        int wynik;
        int liczba=0;
        int dlugosc = aString.length();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < dlugosc; i++) {
            System.out.println(aString.charAt(i));
            temp = "" + aString.charAt(i);
            temp2 = Double.parseDouble(temp);
            pow = Math.pow(10, (dlugosc - i - 1));
            wynik = (int) (temp2 * pow);
            liczba = liczba+wynik;
            if (wynik != 0) {
                stringBuilder.append(wynik);
                if (a !=liczba ) {
//                    System.out.println(""+ a + wynik + (a-wynik));
                    stringBuilder.append(" + ");
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
