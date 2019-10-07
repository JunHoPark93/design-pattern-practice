package observer;

import java.util.ArrayList;
import java.util.List;

public class BaediPublisher implements Observable {
    private List<Observer> observers = new ArrayList<>();

    public void eatFood() {
        System.out.println("베디가 밥을 먹는다 \n");
        notifyCrew("밥");
    }

    public void strengthenResponsibility() {
        System.out.println("베디는 책임감이 강하다 \n");
        notifyCrew("책임감");
    }

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyCrew(String something) {
        observers.forEach(observer -> observer.update(something));
    }
}
