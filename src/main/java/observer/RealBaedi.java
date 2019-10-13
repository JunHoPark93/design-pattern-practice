package observer;

import java.util.Observable;

public class RealBaedi extends Observable {
    void eatFood() {
        System.out.println("밥 먹는다");
        setChanged();
        notifyObservers("밥");
    }
}
