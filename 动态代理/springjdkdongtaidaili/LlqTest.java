package springjdkdongtaidaili;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class LlqTest {
    @Test
    public void test01(){
        Llq llq = new Llq();
        Conn jdkProxy = (Conn)Proxy.newProxyInstance(llq.getClass().getClassLoader(),
                llq.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        Boolean bool = (Boolean)method.invoke(llq,objects);
                        if(bool!=null){
                            bool = true;
                        }
                        return bool;
                    }
                }
        );
        Boolean b = jdkProxy.visits();
        System.out.println("b = " + b);
    }
}
