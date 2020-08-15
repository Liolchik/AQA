
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.File;

public class Task10 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String wordToCount = scan.nextLine();

        final String sp = File.separator;
        final Path srcPath = Paths.get
                (System.getProperty("user.dir"));
        String pathToInFile =
                srcPath + sp + "src" + sp + "main" + sp + "java" + sp + "com" + sp + "Task10" + sp + "alice.txt";
        Path inPath = Paths.get(pathToInFile);

        List<String> lines = Files.readAllLines(inPath);

        ArrayList<String> arrList = new ArrayList<>();

        Map<String, Integer> counts = new HashMap<>();

        for (String linesWithWords : lines) {
            Collections.addAll(arrList, linesWithWords.split("\\W +"));
        }

        for (String separateWords : arrList) {
            counts.put(separateWords, counts.getOrDefault(separateWords, 0) + 1);
        }


        System.out.println(counts.get(wordToCount) + " matches " + wordToCount );

    }
}
