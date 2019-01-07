public class Bmi {
    public static void main(String[] args) {
        double weight = 80;
        double height = 1.80;
        String a = "";
        double bmi = weight / (height * height);
        if (bmi <= 18.5) a = "Underweight";
        if (bmi <= 25.0 & bmi>18.5) a = "Normal";
        if (bmi <= 30.0 & bmi>25) a = "Overweight";
        if (bmi > 30) a = "Obese";
        System.out.println(bmi);
        System.out.println(a);
    }
}


