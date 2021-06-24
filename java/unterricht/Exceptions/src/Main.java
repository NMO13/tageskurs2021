import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static int myMethodThatThrowsException(int index) throws MyException {
        if(index < 0 || index > 4)
            throw new MyException(index);

        int[] array = new int[5];

        return array[index];
    }

    public static void main(String[] args) {
        try {
            myMethodThatThrowsException(8);
        }
        catch (MyException e) {
            System.out.println("Index is out of bounds. The index was: " + e.getIndex());
        }

        // File handling
        // 1. get absolute path
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);

        String path = "data/names.txt";
        boolean fileNotFound = true;

        // open file
        File myObj = new File(path);

        try {
            Scanner myReader = new Scanner(myObj);
            // print file content
            while(myReader.hasNextLine()) {
                String line = myReader.nextLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }



//
//        int i = 0;
//        while(fileNotFound) {
//            Scanner myReader = null;
//            try {
//                File myObj = new File(path);
//                myReader = new Scanner(myObj);
//                while (myReader.hasNextLine()) {
//                    String data = myReader.nextLine();
//                    System.out.println(data);
//                }
//                int y = 10 / i;
//                fileNotFound = false;
//            } catch (FileNotFoundException e) {
//                System.out.println("The file was not found.");
//                e.printStackTrace();
//                path = "data2/filename.txt";
//            } catch (ArithmeticException e) {
//                i++;
//                System.out.println(e.toString());
//            } finally {
//                // will be entered whether or not an exception was thrown
//                if(myReader != null) {
//                    myReader.close();
//                }
//            }
//        }
    }
}
