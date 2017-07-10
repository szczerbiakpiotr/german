package com.szczerbiak.words.converter;

import com.szczerbiak.words.entity.TranslationEntity;
import com.szczerbiak.words.model.Translation;
import org.springframework.stereotype.Service;

/**
 * Created by piotr.szczerbiak on 10.07.2017.
 */

@Service
public class Converter {
    public Translation convert (TranslationEntity entity){
        Translation translation = new Translation();
        translation.setOriginal(entity.getOriginal());
        translation.setTranslation(entity.getTranslation());
        return translation;
    }

    public TranslationEntity convert (Translation translation){
        TranslationEntity entity = new TranslationEntity();
        entity.setOriginal(translation.getOriginal());
        entity.setTranslation(translation.getTranslation());
        return entity;
    }


}
