package ua.masaltsev.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.masaltsev.jokesapp.service.JokesService;

@Controller
public class JokesController {

    private JokesService service;

    JokesController(JokesService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("joke", service.getRandomQuote());
        return "index";
    }

}
