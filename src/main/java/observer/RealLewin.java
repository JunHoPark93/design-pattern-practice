package observer;

import java.util.Observable;
import java.util.Observer;

public class RealLewin implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("르윈 수신 : " + arg);
    }
}
