import java.lang.Thread;
class ThreadDemoClass implements Runnable
{
    public void run()
    {
        for(int i=0;i<30;i++)
        {
            System.out.println("Thread class method");
        }
    }
}
public class MultithreadingDemo {
    public static void main(String[] args) {
        ThreadDemoClass threadDemoClass = new ThreadDemoClass();
        Thread thread = new Thread(threadDemoClass);
        thread.start();
        for(int i=0;i<30;i++)
        {
            System.out.println("Main class method");
        }
    }
}
