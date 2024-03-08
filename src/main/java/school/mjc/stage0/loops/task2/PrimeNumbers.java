package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 0;
        while (counter <= printToInclusive) {
            if (counter == 2 || counter == 3 || counter == 5 || counter == 7) {
                System.out.println(counter);
            } else if (counter % 2 != 0 && counter % 3 != 0 && counter % 5 != 0 && counter % 7 != 0) {
                System.out.println(counter);
            }

            counter++;
        }
    }
}
