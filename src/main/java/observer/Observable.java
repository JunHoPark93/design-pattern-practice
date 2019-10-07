package observer;

public interface Observable {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyCrew(String something);
}
