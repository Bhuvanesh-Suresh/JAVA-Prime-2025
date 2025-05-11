public class poly {
    public static void main(String[] args) {
        cat Cat=new cat();
        Cat.info();
        Cat.sound();
        
    }
}
class animal
{
    public void info()
    {
        System.out.println("I am a animal");
    }
}
class cat extends animal
{
    public void sound()
    {
        System.out.println("Meow");
    }
}