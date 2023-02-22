package ladder.view;

import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String REGEX = ",";

    private final Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public List<String> inputPlayerNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String value = scanner.nextLine();
        return List.of(value.split(REGEX));
    }
}
