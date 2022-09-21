package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int revert = 0;
        for( ;number != 0; number=number/10){
            int remainder = number % 10;
        revert = revert * 10 + remainder;}
        System.out.println(revert);
    }
}