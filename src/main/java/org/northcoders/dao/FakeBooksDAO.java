package org.northcoders.dao;

import org.northcoders.model.Results;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class FakeBooksDAO {

   public static Results apiResults(@RequestParam String localeValue, @RequestParam int quantityValue, @RequestParam int seedValue){
       String BASE_URL ="https://fakerapi.it/api/v1/books";
       WebClient webClient = WebClient.builder().baseUrl(BASE_URL).build();

       Results responseBody;


       responseBody = webClient
               .get()
               .uri("?_locale="+localeValue+"&_quantity="+quantityValue+"&_seed="+seedValue)
               .retrieve()
               .bodyToMono(Results.class)
               .block();


       return responseBody;
   }

}
