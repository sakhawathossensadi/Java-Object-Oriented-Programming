public class Overloading {
    public void sum(int x,int y)
    {
        System.out.println("Summation : "+(x+y));
    }
    public void sum(int x,int y,int z)
    {
        System.out.println("Summation : "+(x+y+z));
    }
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.sum(10, 20);
        overloading.sum(10, 20, 30);
    }
}
