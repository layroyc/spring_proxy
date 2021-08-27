package spring17aopjingtaidaili;

import org.junit.Test;

public class GameTest {
    @Test
    public void test01(){
        Game wangZhe = new Game();
        JiaSuQi xunYou = new JiaSuQi();
        xunYou.setGame(wangZhe);//set注入  王者注入了迅游，迅游依赖了王者，迅游包含了王者，迅游才是主体类
        xunYou.conNet();
    }
}
