package be.intecbrussel.javaInterface;

import be.intecbrussel.javaInterface.MyAnimal;

public class MyPig implements MyAnimal
{
    @Override
    public void animalSound()
    {
        System.out.println("Le cochon dit wee wee.");
    }
    @Override
    public void dormir()
    {
        System.out.println("Zzz");
    }
}
