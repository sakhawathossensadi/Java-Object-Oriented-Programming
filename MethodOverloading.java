public class MethodOverloading {
    public void m1(int x)
    {
        System.out.println("Method takes int value as parameter");
    }
    public void m1(float x)
    {
        System.out.println("Method takes float value as parameter");
    }
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.m1(10);
        methodOverloading.m1('a');//automatic promotion in method overloading
        methodOverloading.m1(10.56f);
        methodOverloading.m1(10l);//automatic promotion in method overloading
    }
}
