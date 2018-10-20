import java.util.Scanner;

public class next {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("next");
        if(scan.hasNext()){
            String str1=scan.next();
            System.out.println(str1);
        }



//        if(scan.hasNext())
//        {
//            String str2=scan.nextLine();
//            System.out.println(str2);
//        }


        if(scan.hasNext())
        {
            int i=scan.nextInt();
            System.out.println(i);
        }
        scan.close();

    }
}
