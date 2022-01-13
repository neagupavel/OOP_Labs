package Lab4_task1.task1;

public class ExpChecker {
    static boolean isCorrect(String exp) {
        if (exp == null) {
            return false;
        }

        int counter = 0;
        for (Character c: exp.toCharArray()) {
            if (c == '(') {
                counter++;
            }

            if (c == ')') {
                counter--;
            }

            if (counter < 0) {
                return false;
            }
        }
        if (counter != 0) {
            return false;
        }
        return true;
    }
}
