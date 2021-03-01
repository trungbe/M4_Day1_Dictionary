package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("cat", "meo meo");
        map.put("dog", "cho");
        map.put("paper", "giay");
        map.put("pen", "but");


    }

    @GetMapping("/show")
    public ModelAndView showDictionary() {
        ModelAndView modelAndView = new ModelAndView("list");
        return modelAndView;
    }

    @PostMapping("/dictionary")
    public ModelAndView Dictionary(String word) {
        ModelAndView modelAndView = new ModelAndView("list");
        String result = map.get(word);
        modelAndView.addObject("word", word);
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
