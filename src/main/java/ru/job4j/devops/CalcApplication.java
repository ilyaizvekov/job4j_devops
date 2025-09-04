package ru.job4j.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * * Основной класс приложения Spring Boot.
 * Запускает сервер и инициализирует Spring-контекст.
 * @author ILYA IZVEKOV
 * @version 1.0
 */
@SpringBootApplication
public class CalcApplication {

	/**
	 * Конструктор по умолчанию.
	 * Используется для инициализации приложения.
	 */
	public CalcApplication() {
	}

	/**
	 * Точка входа в приложение.
	 *
	 * @param args аргументы командной строки
	 */
	public static void main(String[] args) {
		SpringApplication.run(CalcApplication.class, args);
	}
}
