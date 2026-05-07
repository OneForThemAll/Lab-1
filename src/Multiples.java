public class Multiples {
    static void main() {
        int endNum = 1000;
        int countingNum = 1;
        int totalz = 0;

        while (countingNum < endNum) {

            if (countingNum % 3 == 0 || countingNum % 5 == 0) {
                totalz += 1;
            }
            countingNum += 1;
        }

        System.out.println(totalz);
    }
}
