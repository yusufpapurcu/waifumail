package com.yusufpapurcu.waifumail.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yusufpapurcu.waifumail.models.WaifuDTOResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WaifuClient {

    public static WaifuDTOResponse getRandomWaifuLandscape() throws Exception{
        var uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("api.waifu.im")
                .path("search")
                .queryParam("orientation", "LANDSCAPE")
                .build()
                .toUri();

        var request = HttpRequest.newBuilder()
                .uri(uri)
                .header(HttpHeaders.USER_AGENT, "yusufpapurcu/waifumail")
                .GET()
                .build();

        var client = HttpClient.newHttpClient();
        var res = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .join();

        var mapper = new ObjectMapper();

        return mapper.readValue(res, WaifuDTOResponse.class);
    }
}
