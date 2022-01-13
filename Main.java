package Lab4_task1.task1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> linesF1 = Files.readAllLines(Paths.get("resources/one_expression.txt"));
        System.out.println("1 expression file:");
        for (String line : linesF1) {
            System.out.println(ExpChecker.isCorrect(line));
        }

        List<String> linesF2 = Files.readAllLines(Paths.get("resources/three_expressions.txt"));
        System.out.println("3 expressions file:");
        for (String line : linesF2) {
            System.out.println(ExpChecker.isCorrect(line));
        }
    }
}

