package Test;


interface Drawable 
{
 void draw();
}

class Hexagon implements Drawable 
{
 public void draw() 
 {
     System.out.println("Drawing a Hexagon");
 }
}

class Pentagon implements Drawable 
{
 public void draw() 
 {
     System.out.println("Drawing a Pentagon");
 }
}

public class DrawableTest 
{
 public static void main(String[] args) 
 {
     Hexagon hexagon = new Hexagon();
     Pentagon pentagon = new Pentagon();
     hexagon.draw();     
     pentagon.draw();   
 }
}

