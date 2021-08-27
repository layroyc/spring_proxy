package spring17aopjingtaidaili;

public class Defendant {
    private int state=15;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void proof(){
        System.out.println("被告人的证据："+this.getState());
    }
}
