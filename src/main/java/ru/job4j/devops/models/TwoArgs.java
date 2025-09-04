package ru.job4j.devops.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс аргументов.
 * @author ILYA IZVEKOV
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoArgs {
    /**
     * Первый аргумент.
     */
    private double first;
    /**
     * Второй аргумент.
     */
    private double second;
}
