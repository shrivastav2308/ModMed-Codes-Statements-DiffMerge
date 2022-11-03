public class Main {
    public static void main(String[] args) {

        int highScore = score(true, 800, 5, 100);
        System.out.println("The final score was " + highScore);

        highScore = score(false, 10000, 8, 200);
        System.out.println("The final score was " + highScore);

    }
    public static int score(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}