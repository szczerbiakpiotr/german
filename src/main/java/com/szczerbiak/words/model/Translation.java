package com.szczerbiak.words.model;

import lombok.Data;
import lombok.ToString;

import java.util.Locale;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */

@Data
@ToString
public class Translation {

    private Word original;

    private Word translation;

    public Translation(){
        this.original = new Word();
        this.translation = new Word();

        this.original.setLocale(new Locale("PL"));
        this.translation.setLocale(new Locale("DE"));
    }

}
