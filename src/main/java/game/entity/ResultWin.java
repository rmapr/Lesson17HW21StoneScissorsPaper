package game.entity;

public enum ResultWin {
    STONEPLAYER("Player \"Stone\" won computer \"Scissors\" ", 0),
    PAPERCOMPUTER("The computer's \"Paper\" won the player's \"Stone\"", 1),
    STONECOMPUTER("Computer \"Stone\" won player \"Scissors\"", 2),
    SCISSORSPLAYER("Player \"Scissors\" won computer \"Paper\"", 3),
    PAPERPLAYER("The player's \"Paper\" won the computer's \"Stone\"", 4),
    SCISSORSCOMPUTER("Computer \"Scissors\" won player \"Paper\"", 5),
    DRAWSTONE("Draw: \"Stone\" player - \"Stone\" computer", 6),
    DRAWSCISSORS("Draw: \"Scissors\" player - \"Scissors\" computer", 7),
    DRAWPAPER("Draw: \"Paper\" player - \"Paper\" computer", 8);

    private final String name;
    private final int id;

    ResultWin(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ResultWin{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
