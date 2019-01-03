package VasyaClerk;

public class VasyaClerk {

    public static void main(String[] args) {
        int[] peopleInLine = {25, 25, 50, 100};
        int dlugosc = peopleInLine.length;
        int reszta = 0;
        int b25 = 0;
        int b50 = 0;
        int ok = 0;
        System.out.println(dlugosc);
        if (peopleInLine[0] == 25) {
            for (int i = 0; i < dlugosc; i++) {
                ok = 0;
                if (peopleInLine[i] == 25) b25 = b25 + 1;
                if (peopleInLine[i] == 50) b50 = b50 + 1;

                if (peopleInLine[i] > 25) {
                    reszta = peopleInLine[i] - 25;

                    if (reszta == 25 & b25 > 1) {
                        b25 = b25 - 1;
                        ok = 1;
                    }
                    if (reszta == 75 & b25 > 1 & b50 > 1) {
                        b25 = b25 - 1;
                        b50 = b50 - 1;
                        ok = 1;
                    }
                    if (reszta == 75 & b25 > 3 & b50 == 0) {
                        b25 = b25 - 3;
                        ok = 1;
                    }


                }

            /*    if (ok == 1) return "YES";
                if (ok == 0) return "NO"*/;
            }
        }


    }

}
