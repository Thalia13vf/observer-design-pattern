package pattern;

import pattern.observable.NewsAgency;
import pattern.observers.NewsChannel;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();

        NewsChannel observer = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news 1"); //observable change its state
        System.out.println("Observer news '" + observer.getNews() + "'"); //observable change observer state

        observable.setNews("news 2");
        System.out.println("Observer new '" + observer.getNews() + "'"); //observable change observer state again

        observable.addObserver(observer2); //add a new observer
        observable.setNews("News 3");

    }
}
