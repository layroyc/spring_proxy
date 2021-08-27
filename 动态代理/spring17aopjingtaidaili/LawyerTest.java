package spring17aopjingtaidaili;

import org.junit.Test;

public class LawyerTest {
    @Test
    public void test01(){
        Defendant df = new Defendant();
        Lawyer cc = new Lawyer();
        cc.setDefendant(df);
        cc.proof();

    }
}
