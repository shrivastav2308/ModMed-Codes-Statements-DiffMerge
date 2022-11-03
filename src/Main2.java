public class Main2 {
    public static void main(String[] args) {
        displayHigh("Alex", 1000);
        displayHigh("Gia", 900);
        displayHigh("Aly", 400);
        displayHigh("Alistair", 50);
    }
    public static void displayHigh(String pname, int pscore) {
        int pos = calHigh(pscore);
        System.out.println(pname + " has secured " + pos + " position on the high score table.");
    }
    public static int calHigh(int pscore) {
        int pos = 4;
        if(pscore>=1000) pos = 1;
        else if(pscore>=500) pos = 2;
        else if(pscore>=100) pos = 3;
        return pos;
    }
}
