class P
{
    public void m1()
    {
        System.out.println("parent class method");
    }
}

class C extends P
{
    public void m1()
    {
        System.out.println("Child class method");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        P p = new P();
        p.m1();
        C c = new C();
        c.m1();
        P p1 = new C();
        p1.m1();/*In overriding method resolution always takes care by JVM based on reference
        type. In overloading Run Time object will not play any role.
        Also known as RunTime Polymorphism,Dynamic Polymorphism or Late Binding*/
    }
}
