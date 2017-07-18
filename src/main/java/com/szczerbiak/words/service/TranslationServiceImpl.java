package com.szczerbiak.words.service;

import com.szczerbiak.words.entity.TranslatedWordEntity;
import com.szczerbiak.words.entity.TranslationEntity;
import com.szczerbiak.words.model.Translation;
import com.szczerbiak.words.repository.TranslationRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */
@Service
@Log
public class TranslationServiceImpl implements TranslationService {

    @Autowired
    TranslationRepository repository;

    @Autowired
    MessageSource messageSource;

    @Override
    public void saveTranslation(TranslationEntity entity, String translatedBody) {
        String[] splitted = translatedBody.split(",");
        log.info("splitted.length: "+splitted.length);
        if (!splitted[0].isEmpty()){
            for (String singleTranslation : splitted){
                entity.getTranslationList().add(new TranslatedWordEntity(singleTranslation));
            }
            repository.save(entity);
        } else log.severe("Translated text is empty!");
    }

    @Override
    public void saveTranslation(TranslationEntity entity) {
        repository.save(entity);
    }

    @Override
    public List<TranslationEntity> getTranslations() {
        List<TranslationEntity> result = repository.findAll();
/*        for (TranslationEntity entity : result){
            log.info(entity.toString());
        }*/
        return result;
    }
}
