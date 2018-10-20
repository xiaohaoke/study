import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ThrowsExceptions2 {

        public static void convert() throws IOException,FileNotFoundException
        {
            Scanner sc = new Scanner(new File("a.text"));
            sc.nextLine();
        }

    public static void main(String[] args) {
        try{
            convert();
        }catch (IOException e)
        {

        }

    }
}
