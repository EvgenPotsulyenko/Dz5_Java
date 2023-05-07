package Dz5;

//import java.util.Arrays;
import java.util.stream.*;
import java.util.Scanner;

public class Ex2 
{
    public static void main(String[] args) 
    { 
        Stream.of("Молоко","Хлеб","Конфеты","Печенье","Овощи").forEach(s->System.out.println(s));
        
        System.out.println("Меньше пяти символов: ");
        Stream.of("Молоко","Хлеб","Конфеты","Печенье","Овощи").filter(s->s.length() < 5).forEach(s->System.out.println(s));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите продукт: ");
        String first = in.nextLine(); 
        Stream.of("Moloko","Xleb","Konfetu","Pechene","Ovochi").filter(s-> first.equals(s)).forEach(s->System.out.println("Найденный продукт - " + s));
        in.close();    
    }     
}
