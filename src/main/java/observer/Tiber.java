package observer;

public class Tiber implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("observer.Tiber 수신 : " + msg);
    }
}
