package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        int count = 1;
        if (numberToGoUntil < toBreakWith) {
            System.out.println("iterating till the end");
            for (int i = 1; i <= numberToGoUntil; i++) {
                System.out.println(i);
                if (count >= 1000) {
                    break;
                }
            }
        } else {
            do {
                System.out.println(count++);
            } while (count <= toBreakWith);
        }
    }
}
