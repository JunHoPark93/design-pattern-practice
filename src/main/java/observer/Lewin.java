package observer;

public class Lewin implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("observer.Lewin 수신 : " + msg);
    }
}
