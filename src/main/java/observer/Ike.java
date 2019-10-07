package observer;

public class Ike implements Observer {
    @Override
    public void update(String something) {
        System.out.println("IKE 가 수신 " + something);
    }
}
