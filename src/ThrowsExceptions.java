import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ThrowsExceptions {
    public static void convert() throws IOException, FileNotFoundException{
        Scanner sc=new Scanner(new File("a.text"));
        sc.nextLine();
    }

    public static void input() throws IOException,FileNotFoundException{
        convert();
        System.out.println("input");
    }

    public static void main(String[] args) {
        try {
            input();
            convert();
        }catch (FileNotFoundException e1)
        {

        }
        catch (IOException e2)
        {

        }

    }
}
