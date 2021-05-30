package pattern.observers;

public class NewsChannel implements Channel{

    private String news;

    @Override
    public void update(Object news) {
        this.news = (String) news;
        System.out.println("Object notified by News Agency !! with the news: " + this.news);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
