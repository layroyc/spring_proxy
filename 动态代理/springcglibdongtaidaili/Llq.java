package springcglibdongtaidaili;

public class Llq {
    private Boolean google = false;
    public Boolean visit(){
        System.out.println("浏览器访问谷歌为："+this.google);
        return this.google;
    }

    public Boolean getGoogle() {
        return google;
    }

    public void setGoogle(Boolean google) {
        this.google = google;
    }
}
