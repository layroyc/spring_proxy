package springjdk;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;


public class LlqQQTest {
    @Test
    public void test01(){
        LlqQQ llqQQ = new LlqQQ();
        Vpns jdk = (Vpns) Proxy.newProxyInstance(llqQQ.getClass().getClassLoader(),
                llqQQ.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Boolean invoke = (Boolean) method.invoke(llqQQ, args);
                        if (invoke!=null){
                            invoke=true;
                        }

                        return invoke;
                    }
                }
        );
        Boolean b = jdk.visits();
        System.out.println("b = " + b);
    }

}
