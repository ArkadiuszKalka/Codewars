package Dubstep;

public class Dubstep {
    public static void main(String[] args) {
        String song = "RWUBWUBWUBLWUBCWUBWUBDWUB";
        String[] song2 = song.split("WUB");
        int dlugosc = song2.length;
        String answer = "";
        for (int i = 0; i < dlugosc; i++) {
            if (song2[i].length() > 0) {
                System.out.println(i);
                System.out.println(song2[i]);
                if (answer == "") {
                    answer = song2[i];
                } else {
                    answer = answer + " " + song2[i];
                }
            }
            System.out.println(answer);


        }
    }
}
