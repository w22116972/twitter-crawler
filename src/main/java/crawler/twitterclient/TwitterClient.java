package crawler.twitterclient;

import crawler.dto.Tweet;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public interface TwitterClient {

    Flux<Tweet> streamTweet();
}
