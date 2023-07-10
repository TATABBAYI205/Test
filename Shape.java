package Test;

abstract class Parameters 
{
 public abstract double calculateArea();
}

class Rectangle extends Parameters 
{
 private double length;
 private double width;
 public Rectangle(double length, double width) 
 {
     this.length = length;
     this.width = width;
 }

 public double calculateArea() 
 {
     return length * width;
 }
}

class Circle extends Parameters 
{
 private double radius;
 public Circle(double radius) 
 {
     this.radius = radius;
 }

 public double calculateArea() 
 {
     return Math.PI * radius * radius;
 }
}

class Triangle extends Parameters 
{
 private double base;
 private double height;
 public Triangle(double base, double height) 
 {
     this.base = base;
     this.height = height;
 }

 public double calculateArea() 
 {
     return 0.5 * base * height;
 }
}

class ShapeCalculator 
{
 public void printArea(Parameters prtmt) 
 {
     double area = prtmt.calculateArea();
     System.out.println("The area of the shape is: " + area);
 }
}

public class Shape 
{
 public static void main(String[] args) 
 {
     ShapeCalculator sc = new ShapeCalculator();
     Parameters rectangle = new Rectangle(5.0, 3.0);
     Parameters circle = new Circle(2.5);
     Parameters triangle = new Triangle(4.0, 6.0);

     sc.printArea(rectangle); 
     sc.printArea(circle);    
     sc.printArea(triangle); 
 }
}

