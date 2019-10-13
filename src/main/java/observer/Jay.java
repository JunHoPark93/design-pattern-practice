package observer;

public class Jay implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("observer.Jay 수신 : " + msg);
    }
}
