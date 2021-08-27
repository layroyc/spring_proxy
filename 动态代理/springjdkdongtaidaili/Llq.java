package springjdkdongtaidaili;

public class Llq implements Conn{
    private Boolean google=false;

    public Boolean getGoogle() {
        return google;
    }

    public void setGoogle(Boolean google) {
        this.google = google;
    }

    @Override
    public Boolean visits() {
        System.out.println("浏览器对谷歌的访问是："+google);
        return this.google;
    }
}
