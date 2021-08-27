package spring17aopjingtaidaili;

/**
 * 代理对象  用于增强目标对象的方法
 *      游戏      迅游加速器
 *      王宝强     宋吉吉
 *      浏览器     vpn
 *      被告人     律师
 *
 *      请问：谁依赖了谁，谁拥有了谁?谁应该注入谁的类中？
 *      谁是主体类？谁是辅助类？
 *
 *      右边依赖左边
 *      谁依赖了谁，谁就是主体
 */

public class JiaSuQi {
    private Game game;//代理类才是主体类，代理对象依赖了目标对象，  代理对象包含了目标对象
    private int ws;

    //代理对象的方法  必须和目标对象一样，因为代理对象也要目标对象的方法
    public void conNet(){
        //这个方法  要 承接  目标对象的方法
        int wangSu = game.getWangSu();//目标对象的  网速方法
        this.ws = wangSu-400;
        System.out.println("现在打游戏的网速："+this.ws);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }
}
