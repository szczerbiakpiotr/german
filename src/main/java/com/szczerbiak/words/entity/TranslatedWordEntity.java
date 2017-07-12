package com.szczerbiak.words.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Locale;

/**
 * Created by piotr.szczerbiak on 12.07.2017.
 */
@Entity
@Data
@RequiredArgsConstructor()
@Table(name = "translated_word")
public class TranslatedWordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String body;
    private Locale locale = new Locale("DE");

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "translation_entity")
//    private TranslationEntity translationEntity;

    public TranslatedWordEntity(String body) {
        this.body = body;
    }
}

