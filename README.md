# twitter-crawler

## Goal

- use Twitter API to send data to Kafka topics
- is able to scale

## Optimization

- smaller size of pod -> faster scale up
  - shrink lib
  - optimize docker image
- tuning twitter client and kafka client(producer)
  - thread
  - serialization
- JVM configuration


---
## How to use Twitter API

### Add Rule
- `"value"`: rule 
  - https://developer.twitter.com/en/docs/twitter-api/tweets/filtered-stream/integrate/build-a-rule

```shell
curl -X POST 'https://api.twitter.com/2/tweets/search/stream/rules' \
-H "Content-type: application/json" \
-H "Authorization: Bearer $APP_ACCESS_TOKEN" -d \
'{
  "add": [
    {"value": "cat has:images", "tag": "cats with images"}
  ]
}'
```

### Get Rules

```shell
curl -X GET 'https://api.twitter.com/2/tweets/search/stream/rules' \
-H "Authorization: Bearer $APP_ACCESS_TOKEN" 
```

### Retrieve specific fields

note: use postman will fail to get streaming result
```shell
curl -X GET -H "Authorization: Bearer $APP_ACCESS_TOKEN" "https://api.twitter.com/2/tweets/search/stream?tweet.fields=created_at&user.fields=created_at"
```

---
## Rate Limit

https://developer.twitter.com/en/docs/twitter-api/rate-limits
