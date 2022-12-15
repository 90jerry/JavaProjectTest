package com.wang;

/**
 * 编译在左，运行在右
 */
public class TestDog {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal b = new Dog();
        Dog c = new Dog();
        animal.move();
        b.move();
        c.bark();
    }
}
