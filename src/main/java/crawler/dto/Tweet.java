package crawler.dto;

import lombok.Data;

import java.util.List;

@Data
public class Tweet {
  private crawler.dto.Data data;
  private List<MatchRule> matchRules;
}
