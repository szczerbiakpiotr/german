package com.szczerbiak.words.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */

@Entity
@ToString
@Table(name = "translation")
public class TranslationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;

    @Getter
    @Setter
    private String original;

    @Getter
    @Setter
    private String translation;

//    private List<WordEntity> translationList;
}
