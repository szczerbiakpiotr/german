package com.szczerbiak.words.controller;

import com.szczerbiak.words.converter.Converter;
import com.szczerbiak.words.entity.OriginalWordEntity;
import com.szczerbiak.words.entity.TranslatedWordEntity;
import com.szczerbiak.words.entity.TranslationEntity;
import com.szczerbiak.words.repository.TranslationRepository;
import com.szczerbiak.words.service.TranslationService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

/**
 * Created by piotr.szczerbiak on 05.07.2017.
 */

@Controller
@Log
public class MainController {

    @Autowired
    TranslationService translationService;

    @RequestMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("entity", new TranslationEntity());
        model.addAttribute("translated", new TranslatedWordEntity());
        return "index";
    }

    @PostMapping(value = "/add")
    public String addTranslation(@ModelAttribute TranslationEntity entity, @RequestParam("translated_body") String translatedBody) {
//        log.info("Original: "+original);
//        log.info("TranslationEntity: "+translation);
        log.info("Translation: " + entity);
        log.info("translated_body: " + translatedBody);

        translationService.saveTranslation(entity, translatedBody);
//        repository.save(entity);

        return "redirect:/";
    }

    @RequestMapping("/translations")
    public String showTranslations(Model model) {
        model.addAttribute("translations", translationService.getTranslations());
        return "list";
    }
}
