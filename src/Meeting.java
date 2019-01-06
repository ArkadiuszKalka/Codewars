import java.util.Arrays;

public class Meeting {

    public static void main(String[] args) {
        String text ="Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";
        String text2=text.toUpperCase();
        String []tab=text2.split(";");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i = 0;i<tab.length;i++)
        {
            String []tab2=tab[i].split(":");
            tab[i]=tab2[1]+", "+tab2[0];
        }

        Arrays.sort(tab);
        for(int i = 0;i<tab.length;i++)
        {
            stringBuilder.append("(").append(tab[i]).append(")");
        }
        System.out.println(stringBuilder.toString());

    }
}
