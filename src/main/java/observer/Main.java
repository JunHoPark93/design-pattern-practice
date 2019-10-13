package observer;

public class Main {
    public static void main(String[] args) {
        Baedi baedi = new Baedi();
        Observer lewin = new Lewin();
        Observer tiber = new Tiber();
        Observer jay = new Jay();

        baedi.subscribe(lewin);
        baedi.subscribe(tiber);
        baedi.subscribe(jay);

        baedi.upgradeCutie();

        baedi.unsubscribe(lewin);
        baedi.eatFood();

        // Java 의 observer.Observer 를 쓰려면 주석을 해제
//        observer.RealBaedi realBaedi = new observer.RealBaedi();
//        observer.RealLewin lewin = new observer.RealLewin();
//        realBaedi.addObserver(lewin);
//
//        realBaedi.eatFood();

    }
}
