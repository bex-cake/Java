package com.company;

public class Cat extends Animal implements toWalk, toSwim{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void toVoice() {
        System.out.println("mur mur");
    }

    @Override
    public void walk() {
        System.out.println(super.getName() + " is walking");
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
