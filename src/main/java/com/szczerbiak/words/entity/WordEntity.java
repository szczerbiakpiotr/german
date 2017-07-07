package com.szczerbiak.words.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Locale;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */
//@Entity
@Data
public class WordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String body;
    private Locale language;
}
