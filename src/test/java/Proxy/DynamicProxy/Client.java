package Proxy.DynamicProxy;


public class Client {
    public static void main(String[] args) {
        // 真实角色
        Proxy.DynamicProxy.UserService userService= new Proxy.DynamicProxy.UserService();
        // 代理角色，不存在
        UserServiceInvocationHandler userServiceInvocationHandler = new UserServiceInvocationHandler();
        userServiceInvocationHandler.setUserService((Proxy.DynamicProxy.Service) userService);  //设置代理对象
        // 动态生成代理类
        Proxy.DynamicProxy.Service proxy = (Service) userServiceInvocationHandler.getProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
