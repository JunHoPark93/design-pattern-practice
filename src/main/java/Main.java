import observer.BaediPublisher;
import observer.Ike;
import observer.Lewin;
import observer.Observer;

public class Main {
    public static void main(String[] args) {
        BaediPublisher baediPublisher = new BaediPublisher();
        Observer observer1 = new Ike();
        Observer observer2 = new Lewin();

        baediPublisher.subscribe(observer1);
        baediPublisher.subscribe(observer2);

        baediPublisher.eatFood();

        baediPublisher.unsubscribe(observer2);
        baediPublisher.strengthenResponsibility();
    }
}
