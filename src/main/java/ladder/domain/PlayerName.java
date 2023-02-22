package ladder.domain;

public class PlayerName {

    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 5;

    private final String value;

    public PlayerName(String value) {
        this.value = value;
        validateNull(this.value);
        validateBlank(this.value);
        validateLength(this.value);
    }

    private void validateNull(String value) {
        if (value == null) {
            throw new IllegalArgumentException("플레이어 이름은 null일 수 없습니다.");
        }
    }

    private void validateBlank(String value) {
        if (value.isBlank()) {
            throw new IllegalArgumentException("플레이어 이름은 공백일 수 없습니다.");
        }
    }

    private void validateLength(String value) {
        if (value.length() < MIN_LENGTH || MAX_LENGTH < value.length()) {
            String message = String.format(
                "플레이어 이름은 %d자 이상 %d자 이하만 가능합니다.",
                MIN_LENGTH, MAX_LENGTH
            );
            throw new IllegalArgumentException(message);
        }
    }
}
