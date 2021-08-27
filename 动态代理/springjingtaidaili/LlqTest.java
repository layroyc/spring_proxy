package springjingtaidaili;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;
import springjdkdongtaidaili.Conn;
import springjdkdongtaidaili.Llq;

import java.lang.reflect.Method;

public class LlqTest {
    @Test
    public void text01(){
        Llq llq = new Llq();
        Conn jdkProxy=(Conn) Proxy.newProxyInstance(llq.getClass().getClassLoader(),
                llq.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Boolean bool= (Boolean) method.invoke(llq,args);
                        if(bool!=null){
                            bool=true;
                        }
                        return bool;
                    }
                }
        );
        Boolean i=jdkProxy.visits();
        System.out.println("i = " + i);
    }
}
