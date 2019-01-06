
public class FindTheUniqueNumber {

    public static void main(String[] args) {

//        double[] arr = {1, 0, 0, 2, 2, 3, 4, 5, 3, 4, 5};
//      double[] arr = {1, 1, 1, 2, 1, 1};
      double[] arr = {0, 1, 0};
        int dl = arr.length;
        int test = 0;
        double wynik = 0;
        for (int i = 0; i < dl; i++) {
            test = 0;
            for (int j = 0; j < dl; j++) {
                if (i == j) continue;
                if (arr[i] == arr[j]) {
                    test++;
                    if (test>1)break;
                }
            }
            if (test < 1) {
                wynik = arr[i];
            }

        }
        System.out.println("znaleziono unikat " + wynik);

    }

}

