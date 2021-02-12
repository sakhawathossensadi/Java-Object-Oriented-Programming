class Encapsulate
{
    //data hiding
    private int value;

    //set method for value access
    public void setValue(int value)
    {
        this.value = value;
    }
    
    //get method for value access
    public int getValue() 
    {
        return value;
    }
}

public class Encapsulation
{
    public static void main(String[] args) {
        Encapsulate encapsulate = new Encapsulate();
        encapsulate.setValue(100);
        System.out.println(encapsulate.getValue());
        encapsulate.setValue(200);
        System.out.println(encapsulate.getValue());
    }
}