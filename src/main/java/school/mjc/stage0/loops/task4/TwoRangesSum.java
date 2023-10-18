package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int numSkipSum = 0;
        int lastInRowSum = 0;
        int count = 0;
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");

        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");

        } else {
            do {
                if (count++ < numberToSkip) {
                    numSkipSum += count;
                } else {
                    lastInRowSum += count;
                }
            } while (count < numberToSkip || count < lastInRow);
            System.out.printf("skipped sum is %d%n", numSkipSum);
            System.out.printf("counted sum is %d%n", lastInRowSum);
        }
    }
}
