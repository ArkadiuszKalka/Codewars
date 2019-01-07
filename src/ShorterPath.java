import com.sun.xml.internal.ws.util.StringUtils;

public class ShorterPath {
    public static void main(String[] args) {
        String[]goal={"S","S","N","E","W","S","N","E","E"};
        int we=0;
        int ns=0;
        for (String i : goal) {
            if (i == "N") ns++;
            if (i == "S") ns--;
            if (i == "W") we++;
            if (i == "E") we--;
        }
        System.out.println("ns "+ns+" we "+we);
        if(we<0)we=we*(-1);
        if(ns<0)ns=ns*(-1);
        StringBuilder stringBuilder=new StringBuilder();
        String a= "asasa";
                /*
        if(ns>0){
            for(int i=1;i<=ns;i++){
                stringBuilder.append()
            }
        }
*/


    }
}
