import javax.swing.text.Style;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)

    {

        Scanner inp = new Scanner(System.in);

        int a,b,c;

        System.out.print("a : ");
        a =inp.nextInt();
        System.out.print("b : ");
        b=inp.nextInt();
        System.out.print("c :");
        c=inp.nextInt();

        if ((a > b) && (a > c)){
            if (b > c){
                System.out.print("a > b > c");

            }else {
                System.out.print("a > c > b");
            }

        } else if ((b > a) &&(b > c)) {
            if (a > c){
                System.out.print("b > a > c");
            }
            else {
                System.out.print("b > c > a");
            }

        } else if ((c > a) && (c > b)) {
            if (b > a){
                System.out.print("c > b > a");

            }else {
                System.out.print("c > a > b");
            }

        }


    }
}