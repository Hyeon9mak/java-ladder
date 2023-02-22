package ladder.domain;

public class Player {

    private final PlayerName name;

    public Player(String name) {
        this(new PlayerName(name));
    }

    public Player(PlayerName name) {
        this.name = name;
    }
}
