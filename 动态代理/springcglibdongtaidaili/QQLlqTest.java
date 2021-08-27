package springcglibdongtaidaili;

import org.junit.Test;

public class QQLlqTest {
    @Test
    public void test01(){
        Llq cc = new CglibFactory().CglibCreate();
        Boolean vs = cc.visit();
        System.out.println("vpn = " + vs);
    }
}
