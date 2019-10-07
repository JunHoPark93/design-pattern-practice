package observer;

public class Lewin implements Observer {
    @Override
    public void update(String something) {
        System.out.println("르윈이 수신 : " + something);
    }
}
