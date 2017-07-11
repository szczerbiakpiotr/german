package com.szczerbiak.words.model;

import lombok.Data;
import lombok.ToString;

import java.util.Locale;

/**
 * Created by piotr.szczerbiak on 11.07.2017.
 */

@Data
@ToString
public class Word {

    private String body;

    private Locale locale;
}
