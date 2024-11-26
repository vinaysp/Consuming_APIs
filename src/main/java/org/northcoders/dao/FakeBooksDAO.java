package org.northcoders.dao;

import org.northcoders.model.Results;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class FakeBooksDAO {

   public static Results apiResults(){
       String BASE_URL ="https://fakerapi.it/api/v1/books";
       WebClient webClient = WebClient.builder().baseUrl(BASE_URL).build();

       Results responseBody;

       responseBody = webClient
               .get()
               .uri("?_locale=en_GB&_quantity=5&_seed=20")
               .retrieve()
               .bodyToMono(Results.class)
               .block();


       return responseBody;
   }

}
