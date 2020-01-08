package ru.rnikonorov.appraiser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppraiserApplication

fun main(args: Array<String>) {
	runApplication<AppraiserApplication>(*args)
}
