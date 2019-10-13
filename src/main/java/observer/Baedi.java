package observer;

import java.util.ArrayList;
import java.util.List;

public class Baedi implements Observable {
    private List<Observer> observers = new ArrayList<>();

    public void eatFood() {
        System.out.println("베디코치가 밥을 먹는다");
        notifyObserver("나 밥 먹었따");
    }

    public void runaway() {
        System.out.println("베디코치가 농땡이를 친다");
        notifyObserver("나 농땡이 쳤따");
    }

    public void upgradeCutie() {
        System.out.println("베디코치가 귀여움을 강화했다");
        notifyObserver("나 더 귀여워 졌따");
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String msg) {
        observers.forEach(crew -> crew.update(msg));
    }
}
