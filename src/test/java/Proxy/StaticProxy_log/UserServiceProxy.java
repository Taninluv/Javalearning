package Proxy.StaticProxy_log;
//需求来了，现在我们需要增加一个日志功能，怎么实现！
//
//        思路1 ：在实现类上增加代码 【麻烦！】
//        思路2：使用代理来做，能够不改变原来的业务情况下，实现此功能就是最好的了！
public class UserServiceProxy implements Service{
    private UserService userService;
    public void setUserService(UserService userService){
        this.userService=userService;
    }

    @Override
    public void add() {
        log("add");
        System.out.println("add");
    }

    @Override
    public void delete() {
        log("delete");
        System.out.println("delete");
    }

    @Override
    public void update() {
        log("update");
        System.out.println("update");
    }

    @Override
    public void query() {
        log("query");
        System.out.println("query");
    }
    public void log(String msg){
        System.out.println("[Debug]使用了 " + msg +"方法");
    }
    }


