class Parent
{
    public void m1()
    {
        System.out.println("Parent class method");
    }
}

class Child extends Parent
{
    public void m2()
    {
        System.out.println("Child class method");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();
        Child child = new Child();
        child.m2();
        child.m1();
    }
}
