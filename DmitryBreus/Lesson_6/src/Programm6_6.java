import java.util.Random;
import java.util.Scanner;
public class Programm6_6
{
    static int size_array=0;
    static int[] array;
    public static void main(String[] args)
    {
        System.out.println("Найти минимальный и максимальный элемент массива");
        System.out.println("Введите длинну массива");
        Scanner in = new Scanner(System.in);
        size_array = in.nextInt();
        array=new int[size_array];
        int i,minVal=-1,maxVal=-1;
        Random Rnd =new Random();
        System.out.println( "Знач. номер эл.");
        for ( i=0; i<=size_array-1; i++)
        {
            array[i]=Rnd.nextInt(size_array+i+5);
            System.out.println( array[i] +"      " +i);
         if(i==0)
         {
             minVal=array[0];
             maxVal=array[0];
         }
             minVal=Math.min(minVal,array[i]);
            maxVal=Math.max(maxVal,array[i]);
        }
            System.out.println("Макс.  Мин.");
            System.out.println(maxVal +"       " +minVal);
    }
}
