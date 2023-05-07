package Dz5;

import java.util.Arrays;
import java.util.stream.*;

public class Ex1 
{
    public static void main(String[] args) 
    {
        IntStream intStr = Arrays.stream(new int[]{-5,1,-2,0,5,1});
        long opt = intStr.filter(w -> w > 0).count();
        System.out.println("Количество положительных: " + opt);

        long pis = IntStream.of(-5,1,-2,0,5,1).filter(w -> w < 0).count();
        System.out.println("Количество отрицательных: " + pis);

        long two = IntStream.of(-5,11,-2,0,50,1, 100).filter(w -> w > 10).filter(w -> w < 100).count();
        System.out.println("Количество двухзначных: " + two);
    }     
}
