package com.sharjeel.example.controller;

import com.sharjeel.example.service.JPasetoExample;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/account")
public class AccountController {

    @PostMapping("/generateToken")
    public ResponseEntity<String> generateToken() {
        String jwt = JPasetoExample.createToken();

        return ResponseEntity.ok(jwt);
    }

}
