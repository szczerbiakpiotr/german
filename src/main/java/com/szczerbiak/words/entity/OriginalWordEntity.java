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
@Table(name = "original_word")
public class OriginalWordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String body;
    private Locale locale = new Locale("PL");

    @OneToOne(mappedBy = "original",optional = false,cascade = CascadeType.ALL)
    private TranslationEntity translationEntity;

    public OriginalWordEntity(String body) {
        this.body = body;
    }
}
