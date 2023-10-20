package Proxy.StaticProxy;

public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("host try rent");
    }
}
