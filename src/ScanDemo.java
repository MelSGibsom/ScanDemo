import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Alexander on 14.11.2015.
 */
public class ScanDemo {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int i;


            while (x.hasNextInt()){
               i = x.nextInt();
                System.out.println("Введена цифра "+i);
            }


        }



    }

