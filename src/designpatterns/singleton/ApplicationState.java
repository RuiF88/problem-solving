package designpatterns.singleton;

import java.awt.desktop.AppForegroundListener;

public class ApplicationState {
    private static ApplicationState INSTANCE;
    private String state;

    private ApplicationState(String state) {
            this.state = state;
    }

    public static ApplicationState getInstance(String state){

        //this prevents multiple multi thread issues
        synchronized (ApplicationState.class) {
            if (INSTANCE == null)
                INSTANCE = new ApplicationState(state);
        }
        return INSTANCE;
    }

    public void getState(){
        System.out.println(state);
    }


}
