class ParentClass
{
    static void m1()
    {
        System.out.println("Parent Class static method");
    }
}

class ChildClass extends ParentClass
{
    static void m1()
    {
        System.out.println("Child class static method");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.m1();
        ChildClass childClass = new ChildClass();
        childClass.m1();
        ParentClass parentClass2 = new ChildClass();
        parentClass2.m1();/*In method hiding method resolution always takes care by compiler based on reference
        type. In overloading Run Time object will not play any role.
        Also known as CompileTime Polymorphism,Static Polymorphism or Early Binding*/

    }
}
