package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {

    @GetMapping("/index")
    String showForm(){
        return "index";
    }
    @PostMapping("/convert")
    public String convert(@RequestParam("rate") double rate, @RequestParam("usd") double usd, Model model){
    double vnd = usd * rate;
    model.addAttribute("vnd", vnd);
    return "result";
    }
}
