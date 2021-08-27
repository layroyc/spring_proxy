package springjingtaidaili;
//代理类
public class Vpn {
    private LiuLanQi liuLanQi;
    private Boolean guge;

    public LiuLanQi getLiuLanQi() {
        return liuLanQi;
    }

    public void setLiuLanQi(LiuLanQi liuLanQi) {
        this.liuLanQi = liuLanQi;
    }

    public Boolean getGuge() {
        return guge;
    }

    public void setGuge(Boolean guge) {
        this.guge = guge;
    }
    public void visit(){
        Boolean google = liuLanQi.getGoogle();
        this.guge = true;
        System.out.println("vpn对谷歌的访问是："+this.guge);

    }
}
