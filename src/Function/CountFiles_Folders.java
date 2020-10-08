package Function;

import java.io.File;
import java.util.Scanner;

public class CountFiles_Folders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dir = sc.nextLine();

        Criteria criteria = new Criteria(dir);
        count(criteria);
    }

    private static void count(Criteria criteria) {
        File file = new File(criteria.folderPath);
        if (!file.exists()) {
            System.out.println("Invalid Input");
            return;
        }
        String fileName = file.getName();
        String extension = "";
        int fileCnt = 0;
        int folderCnt = 0;
        if (file.exists() && file.isDirectory()) {
            File[] arr = file.listFiles();

            for (File f : arr) {
                if (f.isDirectory()) {
                    criteria.includeSubFolder = true;
                    folderCnt++;
                } else if (f.isFile()) {
                    String name = f.getName();
                    int lastIndexOf = name.lastIndexOf(".");
                    if (lastIndexOf == -1) {
                        criteria.extension = "";
                    } else {
                        extension = name.substring(lastIndexOf);
                        criteria.extension = extension;
                    }
                    fileCnt++;
                }
            }
        }
        System.out.println("There are " + (fileCnt - 1) + " files and " + folderCnt + " folders inside folder " + fileName + " with extension " + extension + ".");
    }

    private static class Criteria{
        String folderPath;
        boolean includeSubFolder;
        String extension;

        public Criteria(String folderPath) {
            this.folderPath = folderPath;
        }
    }
}
