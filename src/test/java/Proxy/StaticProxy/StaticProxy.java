package Proxy.StaticProxy;
//优点：
//
//        可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情 .
//        公共的业务由代理来完成 . 实现了业务的分工 ,
//        公共业务发生扩展时变得更加集中和方便 .
//        缺点 :
//
//        一个真是类对应一个代理角色，代码量翻倍，开发效率降低 .
//        我们想要静态代理的好处，又不想要静态代理的缺点，所以 , 就有了动态代理 !
public class StaticProxy {
    private Host host;

    public StaticProxy() {
    }

    public StaticProxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
        contract();
        fare();
    }

    // 看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    // 收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    // 签租赁合同
    public void contract() {
        System.out.println("签租赁合同");
    }
}
