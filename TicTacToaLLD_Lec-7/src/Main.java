public class Main {
    public static void main(String[] args) {

        System.out.println("Your tic Tac toe game has been started!");

        TicTacToeGame game = new TicTacToeGame();
        System.out.println("game winner is : " + game.startGame());
    }
}