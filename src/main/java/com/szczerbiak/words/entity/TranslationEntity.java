package com.szczerbiak.words.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */

@Entity
@Data
@ToString
@Table(name = "translation")
public class TranslationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private OriginalWordEntity original;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TranslatedWordEntity> translationList = new ArrayList<TranslatedWordEntity>();

}
