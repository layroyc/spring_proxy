package springcglibdongtaidaili;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibFactory implements MethodInterceptor {
    private Llq qqllq;
    public CglibFactory(){
        qqllq = new Llq();
    }

    public Llq CglibCreate(){
        //1.用字节码的增强器
        Enhancer enhancer = new Enhancer();
        //2.指定一个父亲
        enhancer.setSuperclass(Llq.class);
        //3.调用工厂执行
        enhancer.setCallback(this);
        //4.创建
        return (Llq) enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Boolean bool = (Boolean) method.invoke(qqllq,objects);
                bool = true;
        return bool;
    }
}
