public class threadrunnable implements Runnable
{
    public static void main(String[] args) {
        threadrunnable runnable =new threadrunnable();
        Thread thread=new Thread(runnable);//Passing the object of user defined class
        thread.start();

    }
    @Override
    public void run()
    {
        for(int i=0;i<=20;i++)
        {
            System.out.println(i);
        }
    }
}