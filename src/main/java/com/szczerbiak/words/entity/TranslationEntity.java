package com.szczerbiak.words.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */

@Entity
@Data
@ToString
//@Table(name = "translation")
public class TranslationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private WordEntity original;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "xxx")
    @ElementCollection(targetClass = WordEntity.class)
    private List<WordEntity> translationList = new ArrayList<WordEntity>();

//    private List<WordEntity> translationList;
}
