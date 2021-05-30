package pattern.observable;

import pattern.observers.Channel;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private String news;

    private List<Channel> channels = new ArrayList<>(); //list of obeservers

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for(Channel channel : channels) {
            channel.update(this.news);
        }
    }
}
