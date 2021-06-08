package it.vashykator.spring.cloud.app.first

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstClientAppApplication

fun main(args: Array<String>) {
	runApplication<FirstClientAppApplication>(*args)
}
