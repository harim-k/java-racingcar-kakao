import java.util.List;
import java.util.stream.Collectors;

public class OutputView {


    public static void printCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getName());
            System.out.print(" : ");
            printDistance(car.getPosition());
            System.out.println();
        }
        System.out.println();
    }

    private static void printDistance(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print('-');
        }
    }

    public static void printWinnerCars(List<Car> winnerCars) {
        String winnerCarNames = winnerCars.stream()
                .map(car -> car.getName())
                .collect(Collectors.joining(", "));
        System.out.println(winnerCarNames + "가 최종 우승했습니다.");
    }


/*
    pobi : --
    crong : -
    honux : --
    손코딩 뇌컴파일 눈디버깅
*/

}
