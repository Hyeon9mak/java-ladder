package ladder.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Players {

    private final List<Player> values;

    public Players(List<Player> values) {
        this.values = values;
    }

    public static Players of(List<String> nameValues) {
        List<Player> players = mapToPlayers(nameValues);
        return new Players(players);
    }

    private static List<Player> mapToPlayers(List<String> nameValues) {
        return nameValues.stream()
            .map(Player::new)
            .collect(Collectors.toList());
    }
}
