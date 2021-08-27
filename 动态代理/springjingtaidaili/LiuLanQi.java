package springjingtaidaili;
//目标对象
public class LiuLanQi {
    private Boolean google=false;

    public Boolean getGoogle() {
        return google;
    }

    public void setGoogle(Boolean google) {
        this.google = google;
    }
    public void visit(){
        System.out.println("浏览器对谷歌的访问是："+this.getGoogle());
    }
}
