package com.szczerbiak.words.service;

import com.szczerbiak.words.entity.TranslationEntity;
import com.szczerbiak.words.model.Translation;
import org.springframework.stereotype.Service;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */
public interface TranslationService {

    TranslationEntity convert(Translation translation);

}
