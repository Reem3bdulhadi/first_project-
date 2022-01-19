import java.util.Scanner;

/**
 * Created by students on 13/01/22.
 */
public class Methods {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int [] array=new int[3];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("enter 4 numbres");
            array[i]=x.nextInt();
        }
        print(array);

}

    public static void print(int x[]){
        for (int i = 0; i <5 ; i++) {
            System.out.println(x);

        }

    }
    public static void input( int y[]) {
        Scanner x=new Scanner(System.in);
        for (int i = 0; i <y.length ; i++)
        y[i]=x.nextInt();

        }
    }


