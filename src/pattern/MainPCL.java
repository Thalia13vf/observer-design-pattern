package pattern;

import pattern.observable.PCLNewsAgency;
import pattern.observers.PCLNewsChannel;

public class MainPCL {

    public static void main(String[] args) {
        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();
        PCLNewsChannel observer2 = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);
        observable.addPropertyChangeListener(observer2);
        observable.setNews("News 1");

        System.out.println("Observer news: " + observer.getNews());
        System.out.println("Observer2 news: " + observer2.getNews());

        System.out.println("Observable news: " + observable.getNews());

    }
}
