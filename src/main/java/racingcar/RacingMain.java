package racingcar;

import java.util.List;

import racingcar.service.Racing;
import racingcar.service.RacingGame;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingMain {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingGame racingGame = new RacingGame(new Racing());
        List<Integer> input = inputView.inputRacing();
        List<Integer> result = racingGame.setInRacing(input);
        ResultView resultView = new ResultView();
        resultView.racingResult(result);
    }

}