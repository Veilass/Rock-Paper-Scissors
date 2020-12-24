package game;

import java.util.ArrayList;

public class Player {
    private String name;
    private VARIANTS variants;

    Player(){
        this.name = "Bot";
        this.variants = RandomVariants();
    }

    private VARIANTS RandomVariants() {
        int x = (int) (Math.random() * 3);
        switch (x) {
            case 0:
                return VARIANTS.ROCK;
            case 1:
                return VARIANTS.PAPER;
            default:
               return VARIANTS.SCISSORS;
        }
    }

    public Player(VARIANTS variants,String name) {
        this.variants = variants;
        this.name = name;
    }

    public String whoWins(Player Bot, Player Pl) {
        System.out.println(Bot.name + " Выбрал " + Bot.variants);
        System.out.println(Pl.name + " Выбрал " + Pl.variants);

        ArrayList<VARIANTS> arr = new ArrayList<VARIANTS>();
        arr.add(VARIANTS.ROCK);
        arr.add(VARIANTS.PAPER);
        arr.add(VARIANTS.SCISSORS);
        int index1 = arr.indexOf(Bot.variants);
        int index2 = arr.indexOf(Pl.variants);
        if (index1 == index2) {
            return "Ничья!";
        }
        if ((index1 - index2) == 1 || (index1 - index2) == -2) {
            return Bot.name + " Выйграл!";
        } else {
            return Pl.name + " Выйграл!";
        }
    }
        enum VARIANTS {
            ROCK,
            PAPER,
            SCISSORS
        }
    }
