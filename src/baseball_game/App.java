package baseball_game;

public class App {
    public static void main(String[] args) {
    // String[] input = ;
        BaseballGame baseballGame = new BaseballGame(new String[]{"5", "2", "C", "D", "+"});
       BaseballGame baseballGame2 = new BaseballGame(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"});
        System.out.println("Final Score : "+baseballGame.calPoints());
       System.out.println("Final Score : "+baseballGame2.checkScore());
    }
}
