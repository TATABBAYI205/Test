package Test;

class Person 
{
 private String name;
 private int age;
 private String address;
 public String getName() 
 {
     return name;
 }

 public void setName(String name) 
 {
     this.name = name;
 }
 public int getAge() 
 {
     return age;
 }
 public void setAge(int age) 
 {
     this.age = age;
 }
 public String getAddress() 
 {
     return address;
 }
 public void setAddress(String address) 
 {
     this.address = address;
 }
}

public class PersonTest 
{
 public static void main(String[] args) 
 {
     Person person = new Person();
     person.setName("Tatabbayi");
     person.setAge(23);
     person.setAddress("8/176 - Hyderabad");
     System.out.println("Name: " + person.getName());
     System.out.println("Age: " + person.getAge());
     System.out.println("Address: " + person.getAddress());
 }
}

