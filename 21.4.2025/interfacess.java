public class interfacess
{
    public static void main(String[] args) {
        servicemanager service=new servicemanager();        
    }
}
interface location
{
    public void cleanlocation();
    public void hourlymessage();
}
interface defaultuser
{
    public void showidcard();
    public void hourlymessage();
}
class servicemanager implements location,defaultuser
{

    @Override
    public void showidcard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showidcard'");
    }

    @Override
    public void cleanlocation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cleanlocation'");
    }

    @Override
    public void hourlymessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hourlymessage'");
    }
}
