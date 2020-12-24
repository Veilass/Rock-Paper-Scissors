package game;

public class Main {

    public static void main(String[] args) {

        Player Bot = new Player();
        Player Alex = new Player(Player.VARIANTS.ROCK, "Игрок");

        System.out.println(Bot.whoWins(Bot, Alex));
    }
}
