package com.szczerbiak.words.model;

import lombok.Data;
import lombok.ToString;

/**
 * Created by piotr.szczerbiak on 07.07.2017.
 */

@Data
@ToString
public class Translation {

    private String original;

    private String translation;

}
