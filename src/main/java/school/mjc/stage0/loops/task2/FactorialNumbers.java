package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int result = 1;
        while (counter <= printToInclusive) {
            if (counter == 0) {
                result = 1;
            } else {
                result = result * counter;
            }
            System.out.println(result);
            counter++;
        }
    }
}
