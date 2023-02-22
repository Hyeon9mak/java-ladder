package ladder.controller;

import ladder.domain.Players;
import ladder.view.InputView;
import ladder.view.OutputView;

public class LadderController {

    private final InputView inputView;
    private final OutputView outputView;

    public LadderController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }


    public void play() {
        Players players = Players.of(inputView.inputPlayerNames());
    }
}
