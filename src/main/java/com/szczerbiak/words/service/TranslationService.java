package com.szczerbiak.words.service;

import com.szczerbiak.words.entity.TranslationEntity;
import com.szczerbiak.words.model.Translation;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */
public interface TranslationService {

    void saveTranslation(TranslationEntity entity, String translatedBody);

    List<TranslationEntity> getTranslations();

}
