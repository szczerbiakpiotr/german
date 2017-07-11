package com.szczerbiak.words.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Locale;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */
@Entity
@Data
@RequiredArgsConstructor()
//@Table(name = "word")
public class WordEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String body;
    private Locale locale;

    @ManyToOne
    @JoinColumn(name = "book_category_id")
    private TranslationEntity xxx;

    public WordEntity(String body, Locale locale) {
        this.body = body;
        this.locale = locale;
    }
}
