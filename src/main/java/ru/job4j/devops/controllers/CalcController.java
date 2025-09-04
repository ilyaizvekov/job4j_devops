package ru.job4j.devops.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.job4j.devops.models.Result;
import ru.job4j.devops.models.TwoArgs;

/**
 * REST-контроллер калькулятора.
 * Предоставляет операции сложения и умножения через HTTP-запросы.
 * @author ILYA IZVEKOV
 * @version 1.0
 */
@RestController
@RequestMapping("calc")
public class CalcController {

    /**
     * Создает контроллер калькулятора.
     * Используется Spring Boot для инициализации.
     */
    public CalcController() {
    }

    /**
     * Складывает два числа.
     *
     * @param twoArgs объект с двумя аргументами
     * @return результат сложения
     */
    @PostMapping("summarise")
    public ResponseEntity<Result> summarise(@RequestBody TwoArgs twoArgs) {
        var result = twoArgs.getFirst() + twoArgs.getSecond();
        return ResponseEntity.ok(new Result(result));
    }

    /**
     * Умножает два числа.
     *
     * @param twoArgs объект с двумя аргументами
     * @return результат умножения
     */
    @PostMapping("times")
    public ResponseEntity<Result> times(@RequestBody TwoArgs twoArgs) {
        var result = twoArgs.getFirst() * twoArgs.getSecond();
        return ResponseEntity.ok(new Result(result));
    }
}
