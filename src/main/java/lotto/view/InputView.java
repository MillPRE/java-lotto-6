package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import static java.lang.Integer.parseInt;

public class InputView {
    public InputView() {}

    public static int requestPayMoney() {
        return parseInt(Console.readLine());
    }
}
