package com.szczerbiak.words.util;

import com.szczerbiak.words.entity.OriginalWordEntity;
import com.szczerbiak.words.entity.TranslatedWordEntity;
import com.szczerbiak.words.entity.TranslationEntity;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by piotr.szczerbiak on 17.07.2017.
 */
@Service
@Log
public class CsvReader {

    private String CSV_VALUE_SEPARATOR = "#";
    private TranslationEntity tmpEntity;
    private Iterator<String> iterator;

    public List<TranslationEntity> convert(Path path) {
        log.info("Converting started...");
        List<String> columns;
        List<List<String>> values = null;
        List<TranslationEntity> result = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String firstLine = br.readLine();
            if (firstLine == null) throw new IOException("empty file");
            columns = Arrays.asList(firstLine.split(CSV_VALUE_SEPARATOR));
            columns.forEach(log::info);
            values = br.lines()
                    .map(line -> Arrays.asList(line.split(",")))
                    .collect(Collectors.toList());
            values.forEach(element -> {
                log.info("csvLine = " + element);
                iterator = element.iterator();
                tmpEntity = new TranslationEntity();
                log.info("Created new TranslationEntity...");

                tmpEntity.setOriginal(new OriginalWordEntity(iterator.next()));
                while (iterator.hasNext()) {
                    tmpEntity.getTranslationList().add(new TranslatedWordEntity(iterator.next()));
                    log.info("Added translation to TranslationEntity...");
                }
                log.info(tmpEntity.toString());
                result.add(tmpEntity);

            });
            log.info("File converted...");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
