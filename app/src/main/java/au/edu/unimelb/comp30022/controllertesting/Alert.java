package au.edu.unimelb.comp30022.controllertesting;

public class Alert {
    private String s;

    public Alert(String s) {
        this.s = s;
    }

    public void show() {
        System.err.println(s);
    }
}
