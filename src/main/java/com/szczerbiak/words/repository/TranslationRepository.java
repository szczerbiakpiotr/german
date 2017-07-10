package com.szczerbiak.words.repository;

import com.szczerbiak.words.entity.TranslationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */
@Repository
public interface TranslationRepository extends CrudRepository<TranslationEntity, Long> {

    TranslationEntity findTranslationEntityByOriginal(String original);

}
