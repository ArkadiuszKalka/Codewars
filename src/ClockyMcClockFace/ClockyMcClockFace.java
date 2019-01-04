package ClockyMcClockFace;

public class ClockyMcClockFace {

    public static void main(String[] args) {
        final double angle = 0;
        double circle = 360;
        int minut = 0;
        double reszta = 0;
        StringBuilder stringBuilder = new StringBuilder();
        int hour = (int) (12 / (circle / angle));
        reszta = angle - (hour * (circle / 12));
        if (hour == 0) hour = 12;
        if (hour < 10) {
            stringBuilder.append("0");
        }
        minut=(int)(reszta*2);
        System.out.println(minut);
        stringBuilder.append(hour).append(":");
        if(minut<10) stringBuilder.append("0");
        stringBuilder.append(minut);
        System.out.println(stringBuilder.toString());
    }
}
