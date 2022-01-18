package crawler.twitterclient;

import crawler.dto.Tweet;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class ReactorTwitterClient implements TwitterClient {
    @Override
    public Flux<Tweet> streamTweet() {
        return null;
    }
}
