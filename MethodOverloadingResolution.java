class Animal
{

}
class Monkey extends Animal
{

}
public class MethodOverloadingResolution {
    public void m1(Animal a)
    {
        System.out.println("Animal Class");
    }
    public void m1(Monkey m)
    {
        System.out.println("Monkey Class");
    }
    public static void main(String[] args) {
        MethodOverloadingResolution methodOverloadingResolution = new MethodOverloadingResolution();
        Animal animal = new Animal();
        methodOverloadingResolution.m1(animal); 
        Monkey monkey = new Monkey();
        methodOverloadingResolution.m1(monkey);
        Animal animal2 = new Monkey();
        methodOverloadingResolution.m1(animal2);/*In overloading method resolution always takes care by compiler based on reference
        type. In overloading Run Time object will not play any role.
        Also known as CompileTime Polymorphism,Static Polymorphism or Early Binding*/
    }
}
