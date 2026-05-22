package com.BridgeToFuture;

abstract class Shape {
 abstract void draw();

 void display() {
     System.out.println("Displaying the shape...");
 }
}

class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Circle");
 }
}

class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

public class Abstraction {
 public static void main(String[] args) {
     Shape s1 = new Circle();
     Shape s2 = new Rectangle();

     s1.display();
     s1.draw();

     s2.display();
     s2.draw();
 }
}
