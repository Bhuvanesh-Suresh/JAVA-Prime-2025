public class thread extends Thread
{
    public static void main(String[] args) {
        thread thread=new thread();
        thread.start();

        thread thread2=new thread();
        thread2.start();

        thread thread3=new thread();
        thread3.start();
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