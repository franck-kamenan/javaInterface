package be.intecbrussel.javaInterface;

import be.intecbrussel.javaInterface.MyPig;

public class MyMain
{
    public static void main(String[] args)
    {
        MyPig monCochon = new MyPig();
        monCochon.animalSound();
        monCochon.dormir();
        System.out.println(monCochon.a + monCochon.b);
    }


}
