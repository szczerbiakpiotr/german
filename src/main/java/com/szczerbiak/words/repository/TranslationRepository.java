package com.szczerbiak.words.repository;

import com.szczerbiak.words.entity.TranslationEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */
public interface TranslationRepository extends CrudRepository<TranslationEntity, Long> {

    TranslationEntity findTranslationEntityByOriginal(String original);

}
