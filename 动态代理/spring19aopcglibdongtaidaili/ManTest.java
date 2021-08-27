package spring19aopcglibdongtaidaili;

import org.junit.Test;

public class ManTest {
    @Test
    public void test01(){
        Man erzi = new CglibFactory().cglibCreator();//多态中的 父类 指向子类对象，本质是儿子对象
        int score = erzi.dream();
        System.out.println("score = " + score);
    }
}
