package com.yusufpapurcu.waifumail.controller;


import com.yusufpapurcu.waifumail.client.MailClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.yusufpapurcu.waifumail.client.WaifuClient;

import java.net.URL;

@RestController
public class SendWaifuMail {

    @GetMapping("/sendmail")
    public String sendmail(@RequestParam String email) {
        try {
            var waifu = WaifuClient.getRandomWaifuLandscape().getImages().get(0);
            MailClient.sendMail(new URL(waifu.getUrl()),email,waifu.getWidth(),waifu.getHeight());
            return "Mail sent";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
