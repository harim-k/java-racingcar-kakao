package Controller;

import Domain.Cars;
import View.InputView;
import View.OutputView;

import java.util.List;

public class RacingCarGame {
    public static void main(String[] args) {
        List<String> carNames = InputView.readNames();

        Cars cars = new Cars(carNames);

        int round = InputView.readRound();

        for (int i = 0; i < round; i++) {
            cars.moveCars();
            OutputView.printCars(cars.getCars());
        }

        OutputView.printWinningCars(cars.findWinningCars());
    }
}
