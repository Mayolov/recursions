import java.io.File;
import java.util.Scanner;

public class DirectorySize {
    public static void main(String[] args) {

        // prompts user to enter a directory or file
        System.out.println("Enter a Directory or file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        // Display size
        System.out.println(getSize(new File(directory)) + " Bytes");
    }

    private static long getSize(File file) {
        long size = 0;// store the total size of all files
        if (file.isDirectory()) {
            File[] files = file.listFiles();// all files an subdirectories
            for (int i = 0; files != null && i < files.length; i++) {
                size += getSize(files[i]); // recursive call
            }
        } else {// base case
            size += file.length();
        }
        return size;
    }

}
