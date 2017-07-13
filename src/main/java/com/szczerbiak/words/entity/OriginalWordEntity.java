package com.szczerbiak.words.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Locale;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */
@Setter
@Getter
@Entity
@ToString
@RequiredArgsConstructor()
@Table(name = "original_word")
public class OriginalWordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String body;
    private Locale locale = new Locale("PL");

    @OneToOne(mappedBy = "original", optional = false, cascade = CascadeType.ALL)
    private TranslationEntity translationEntity;

    public OriginalWordEntity(String body) {
        this.body = body;
    }

}
