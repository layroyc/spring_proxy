package spring17aopjingtaidaili;

public class Lawyer {
    private Defendant defendant;
    private int sta;

    public void proof(){
        int state = defendant.getState();
        this.sta = state-5;
        System.out.println("被告人的证据："+this.sta);
    }

    public Defendant getDefendant() {
        return defendant;
    }

    public void setDefendant(Defendant defendant) {
        this.defendant = defendant;
    }

    public int getSta() {
        return sta;
    }

    public void setSta(int sta) {
        this.sta = sta;
    }
}
