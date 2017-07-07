package com.szczerbiak.words.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */

@Entity
@Data
@ToString
public class TranslationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String original;

    private String translation;

//    private List<WordEntity> translationList;
}
