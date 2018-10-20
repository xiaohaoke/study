import java.util.Date;
import java.lang.Character;
import java.io.*;
public class math {
    static char a='d';

    public static void main(String[] args) throws IOException{
        char c;
        System.out.println(Math.sin(Math.PI/2));
        System.out.println(Math.cos(0));
        System.out.println(Math.tan(Math.PI/3));

        int i1=200;
        int i2=200;

        if(i1==i2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        Date date=new Date();
        System.out.println(date.toString());
        System.out.println(Character.isLetter(a));
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.toLowerCase('A'));

      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


      String str;
        System.out.println("enter lines");
        System.out.println("enter end");

        do{
            str=br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));

      do{
          c=(char)br.read();
          System.out.println(c);
      }while (c!='q');









    }

}
