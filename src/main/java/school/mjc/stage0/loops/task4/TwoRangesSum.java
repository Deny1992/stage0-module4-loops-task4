package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip > lastInRow){
            System.out.println("number to skip is bugger then the last");
            return;
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int sum = 0;
        for (int i = 1; i < lastInRow; i++) {
            if(i == numberToSkip){
                System.out.println("skipped sum is " + (sum + i));
                continue;
            }
            sum += i;
        }
        if(numberToSkip == lastInRow){
            System.out.println("skipped sum is " + (sum + numberToSkip));
            System.out.println("counted sum is 0");
        }else {
            System.out.println("counted sum is " + sum);
        }
    }
}
