public class L1SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        boolean answer = false;
        if (employed & !vacation) answer = true;
        return answer;

    }
}
