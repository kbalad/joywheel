package com.kbalad.joywheel.configuration.db

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class EmptyMigrationStrategyConfig {

    @Bean
    fun flywayMigrationStrategy(): FlywayMigrationStrategy? {
        return FlywayMigrationStrategy { }
    }
}
