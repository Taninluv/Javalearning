package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceInvocationHandler implements InvocationHandler {
//    被代理的接口
    private Service service;
    public void setUserService(Service service)
    {
        this.service=service;
    }
//    动态生成代理类实例
    public Object getProxy(){
        Object obj = Proxy.newProxyInstance(this.getClass().getClassLoader(), service.getClass().getInterfaces(),this);
        return obj;
    }


//    处理代理类实例返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method);
        Object obj = method.invoke(service, args);
        return obj;
    }

//    业务的自定义需求
    public void log(Method method){
        System.out.println("[Info] " + method.getName() + "方法被调用");
    }
}

