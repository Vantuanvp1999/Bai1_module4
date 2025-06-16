package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class dictionaryController {
    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("goodbye", "tạm biệt");
        dictionary.put("apple", "quả táo");
        dictionary.put("dog", "con chó");
    }
    @GetMapping("/index")
    public String showForm() {
        return "index";
    }
    @PostMapping("/translate")
    public String translate(@RequestParam String word, Model model) {
        String result = dictionary.getOrDefault(word.toLowerCase(), "Không tìm thấy từ");
        model.addAttribute("word", word);
        model.addAttribute("result", result);
        return "result";
    }
}
