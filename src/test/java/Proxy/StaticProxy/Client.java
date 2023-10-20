package Proxy.StaticProxy;

public class Client {
    public static void main(String[] args) {
        Host host=new Host();
        StaticProxy staticProxy=new StaticProxy();
        staticProxy.rent();
    }
}
