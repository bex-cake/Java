package com.company;

public class Fish extends Animal implements toSwim{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void toVoice() {
        System.out.println("   ");
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " is swimming");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void live() {
        System.out.println(getName() + " is living");
    }
}
