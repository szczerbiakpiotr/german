package com.szczerbiak.words.controller;

import com.szczerbiak.words.converter.Converter;
import com.szczerbiak.words.entity.TranslationEntity;
import com.szczerbiak.words.entity.WordEntity;
import com.szczerbiak.words.repository.TranslationRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

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
        model.addAttribute("entity", new TranslationEntity());
        return "index";
    }

    @PostMapping(value = "/add")
    public String addTranslation(@ModelAttribute TranslationEntity entity) {
//        log.info("Original: "+original);
//        log.info("TranslationEntity: "+translation);
        log.info("Translation: " + entity);
        entity.getTranslationList().add(new WordEntity("schlecht", new Locale("DE")));
        entity.getTranslationList().add(new WordEntity("schlimm", new Locale("DE")));
        repository.save(entity);

        return "redirect:/";
    }
}
