public class TakeaTenMinuteWalk {
    public static void main(String[] args) {
//        char[] tab={'n','s','n','s','n','s','n','s','n','s'};
//        char[] tab={'n','s','n','s','n','s','n','s','n','s'};
        char[] tab={'w','e','w','e','w','e','w','e','w','e','w','e'};
        int we=0;
        int ns=0;
        boolean answer=false;
        if(tab.length==10) {
            for (char i : tab) {
                if (i == 'n') ns++;
                if (i == 's') ns--;
                if (i == 'w') we++;
                if (i == 'e') we--;

            }
            if((ns+we)==0) answer=true;
        }
        System.out.println("ns "+ns+" we "+we);
        System.out.println(answer);






    }
}
