class ThreadClass extends Thread
{
    public void run()
    {
        for(int i=0;i<30;i++)
        {
            System.out.println("Thread class method");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
        for(int i=0;i<30;i++)
        {
            System.out.println("Main class method");
        }
    }
}
