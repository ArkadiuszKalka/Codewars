public class LongestPalindrom {

    public static void main(String[] args) {

//        String s = "baa";
        String s = "";
        String[] tab = s.split("");
        int dl = tab.length;
        int max = 1;
        String text = "";
        String temptext;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dl; i++) {
            temptext = tab[i];
            for (int j = i + 1; j < dl; j++) {
                temptext = temptext + tab[j];
                stringBuilder.append(temptext);
                text = stringBuilder.reverse().toString();
                if (temptext.equals(text)) {
                    if (temptext.length() > max) max = temptext.length();
                }
                stringBuilder.setLength(0);
            }

        }
        if(s.length()==0)max=0;
        System.out.println(max);
    }
}