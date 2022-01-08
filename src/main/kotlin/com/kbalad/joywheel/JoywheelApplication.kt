package com.kbalad.joywheel

import org.springframework.boot.autoconfigure.AutoConfigurationPackage
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@AutoConfigurationPackage(basePackages = ["com.kbalad.joywheel"])
class JoywheelApplication

fun main(args: Array<String>) {
    runApplication<JoywheelApplication>(*args)
}
