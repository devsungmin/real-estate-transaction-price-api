package dev.sungmin.price

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    System.setProperty("spring.profiles.default", "local")
    runApplication<Application>(*args)
}
