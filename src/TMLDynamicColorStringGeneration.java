public class TMLDynamicColorStringGeneration {

    public static void main(String[] args) {
        int random;
        String wynik="#";
        for (int i=1; i<=3;i++){
            random=(int) (Math.random()*255+1);
            String hex = Integer.toHexString(random);
            if (hex.length()==1){
                hex="1"+hex;
            }
            System.out.println(hex);
            wynik=wynik+hex;
        }
        System.out.println(wynik);
    }

}
