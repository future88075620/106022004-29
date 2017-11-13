import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int counter=1;
        int pass=0;
        int grade;
        while(counter<=10)
        {
            grade=in.nextInt();
            if(grade==1)
                pass=pass+1;
            counter=counter+1;
        }
        System.out.println("Pass"+pass);
        System.out.println("Fall"+(10-pass));
        if(pass>8)
            System.out.println("Bonus!!");
    }
}
