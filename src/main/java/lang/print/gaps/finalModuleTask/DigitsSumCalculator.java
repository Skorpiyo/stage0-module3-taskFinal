package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int calculateSum;
        for (calculateSum = 0; number > 0; calculateSum = calculateSum + number % 10, number = number / 10);
        System.out.println(calculateSum);
    }
}
