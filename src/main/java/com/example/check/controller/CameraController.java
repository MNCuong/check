package com.example.check.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CameraController {

    @GetMapping("/")
    public String index() {
        return "camera";
    }
}