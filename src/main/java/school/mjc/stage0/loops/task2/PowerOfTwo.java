package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }

        int counter = 0;
        int result = 1;
        while (counter <= power) {
            if (counter == 0) {
                result = 1;
            } else {
                result = result * 2;
            }
            System.out.println(result);
            counter++;
        }
    }
}
