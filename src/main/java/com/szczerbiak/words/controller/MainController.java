package com.szczerbiak.words.controller;

import com.szczerbiak.words.converter.Converter;
import com.szczerbiak.words.entity.TranslationEntity;
import com.szczerbiak.words.model.Translation;
import com.szczerbiak.words.repository.TranslationRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by piotr.szczerbiak on 05.07.2017.
 */

@Controller
@Log
public class MainController {

    @Autowired
    TranslationRepository repository;

    @Autowired
    Converter converter;

    @RequestMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("translation", new Translation());
        return "index";
    }

    @PostMapping(value = "/add")
    public String addTranslation(@ModelAttribute Translation translation) {
//        log.info("Original: "+original);
//        log.info("TranslationEntity: "+translation);
        log.info("Translation: " + translation);

        repository.save(converter.convert(translation));

        return "redirect:/";
    }
}
