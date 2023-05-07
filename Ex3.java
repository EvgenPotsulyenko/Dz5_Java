package Dz5;

import java.util.stream.*;
import java.util.Scanner;

public class Ex3 
{
    public static void main(String[] args) 
    { 
        Stream.of(new Device("device1",5,2000,"blue","C"),new Device("device2",3,100,"Purple","b1")).forEach(s->System.out.println(s.name));
        Stream.of(new Device("device1",5,2000,"blue","C"),new Device("device2",3,100,"Purple","b1")).filter(s-> s.colour == "blue").forEach(s->System.out.println("По цвету " + s.name));
        Stream.of(new Device("device1",5,2000,"blue","C"),new Device("device2",3,100,"Purple","b1")).filter(s-> s.year == 5).forEach(s->System.out.println("По дате " + s.name));
        Stream.of(new Device("device1",5,2000,"blue","C"),new Device("device2",3,100,"Purple","b1")).filter(s-> s.cost > 1000).forEach(s->System.out.println("По цене " + s.name));
        Stream.of(new Device("device1",5,2000,"blue","C"),new Device("device2",3,100,"Purple","b1")).filter(s-> s.type == "b1").forEach(s->System.out.println("По типу " + s.name));
        Stream.of(new Device("device1",5,2000,"blue","C"),new Device("device2",3,100,"Purple","b1")).filter(s-> s.year > 2).filter(s-> 5 > s.year).forEach(s->System.out.println("По году(диапазон) " + s.name));
    }         
}

class Device
{
    String name;
    int year;
    int cost;
    String colour;
    String type;

    Device(String n,int y,int c,String col,String t)
    {
        name = n;
        year = y;
        cost = c;
        colour = col;
        type =t;
    }
}