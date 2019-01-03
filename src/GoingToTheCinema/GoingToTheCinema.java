package GoingToTheCinema;

public class GoingToTheCinema {
    public static void main(String[] args) {
        int card=500;
        int ticket=15;
        double perc=0.9;
        double systemA = 0;
        double systemB = card;
        double cena = ticket;
        int count = 0;
        while (systemA < (systemB+1)) {
            systemA += ticket;
            cena *= perc;
            systemB += cena;
            count++;
        }
        System.out.println(count);
        }
    }

