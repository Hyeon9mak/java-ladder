package ladder.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("플레이어 이름 테스트")
class PlayerNameTest {

    @ParameterizedTest(name = "1~5 글자 사이의 플레이어 이름 \"{0}\" 을(를) 생성할 수 있다.")
    @ValueSource(strings = {"현구막", "안녕하세요", "abc12"})
    void playerNameTest(String value) {
        assertThat(new PlayerName(value)).isInstanceOf(PlayerName.class);
    }

    @DisplayName("플레이어 이름은 null 일 수 없다.")
    @Test
    void playerNameNotNullTest() {
        assertThatThrownBy(() -> new PlayerName(null))
            .isExactlyInstanceOf(IllegalArgumentException.class)
            .hasMessage("플레이어 이름은 null일 수 없습니다.");
    }

    @ParameterizedTest(name = "플레이어 이름은 공백 일 수 없다.")
    @ValueSource(strings = {"", " ", "     "})
    void playerNameNotBlankTest(String blank) {
        assertThatThrownBy(() -> new PlayerName(blank))
            .isExactlyInstanceOf(IllegalArgumentException.class)
            .hasMessage("플레이어 이름은 공백일 수 없습니다.");
    }

    @ParameterizedTest(name = "플레이어 이름은 5자를 초과할 수 없다.")
    @ValueSource(strings = {"abcdef", "123456", "여섯글자이름"})
    void playerNameLengthTest(String value) {
        assertThatThrownBy(() -> new PlayerName(value))
            .isExactlyInstanceOf(IllegalArgumentException.class)
            .hasMessage("플레이어 이름은 1자 이상 5자 이하만 가능합니다.");
    }
}
