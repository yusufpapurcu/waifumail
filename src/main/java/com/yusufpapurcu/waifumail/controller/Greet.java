package com.yusufpapurcu.waifumail.controller;


import com.yusufpapurcu.waifumail.client.MailClient;
import com.yusufpapurcu.waifumail.models.WaifuDTOResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yusufpapurcu.waifumail.client.WaifuClient;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URL;

@RestController
public class Greet {

    @GetMapping("/")
    public String index() {
        try {
            var waifu = WaifuClient.getRandomWaifuLandscape().getImages().get(0);
            MailClient.sendMail(new URL(waifu.getUrl()),waifu.getWidth(),waifu.getHeight());
            return "Sent mail";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
