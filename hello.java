import java.util.Scanner;

/**
 * Created by students on 13/01/22.
 */

public class hello {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int [] array=new int[3];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("enter 4 numbres");
            array[i]=x.nextInt();
        }
         print(array);
        }
        public static void print(int[] array){
        for (int i = 0; i <array.length ; i++) {
        System.out.print(array[i]+"\t");

    }
}
    }


