public class Reduce {
    static void main() {
        // Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
        int steps = 0;
        // start from 100 to 0
        int start = 100;
        while (0 < start) {
            boolean isEven = start % 2 == 0;
            if (isEven) {start = start/2;}
            else {start -= 1;}
            steps += 1;
        }
        System.out.println(steps);
    }
}
