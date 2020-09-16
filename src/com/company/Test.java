package com.company;

public class Test
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball ("black ","basketball",6);
        Ball b2 = new Ball ("white ","football",3);
        Ball b3 = new Ball ("brown ","volleyball",1);
        b3.setRadius(1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println();

    }
}