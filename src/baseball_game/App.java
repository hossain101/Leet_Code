package baseball_game;

public class App {
    public static void main(String[] args) {

        BaseballGame baseballGame = new BaseballGame("5 2 C D +");
        BaseballGame baseballGame2 = new BaseballGame("5 -2 4 C -4 X D 9 + +");
        System.out.println("Final Score : "+baseballGame.checkScore());
        System.out.println("Final Score : "+baseballGame2.checkScore());
    }
}
