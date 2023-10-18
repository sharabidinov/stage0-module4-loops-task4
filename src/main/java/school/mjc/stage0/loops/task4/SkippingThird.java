package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int i = 1;
        if (lastPrinted > 0) {
            do {
                if (i % 3 == 0) {
                    i++;
                    continue;
                }
                System.out.println(i);
                i++;
            } while (i <= lastPrinted);
        }
    }
}
