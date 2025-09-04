package ru.job4j.devops.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс для результата вычисления.
 * @author ILYA IZVEKOV
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    /**
     * Значение вычисления.
     */
    private double value;
}
