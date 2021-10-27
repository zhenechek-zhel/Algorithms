import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class SearchFile {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchFile(new File("C:/Users"), fileList);
        for (File file : fileList) {
            file.getAbsolutePath();
        }
    }

    private static void searchFile (File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println("searching at: " + rootFile.getAbsolutePath());
            File[] fileDirectory = rootFile.listFiles();
            for (File file : fileDirectory) {
                if (file.isDirectory()) {
                    searchFile(file, fileList);
                } else {
                    if (file.getName().toLowerCase().endsWith(".jpg")) {
                        fileList.add(file);
                    }
                }
            }
        }
    }
}