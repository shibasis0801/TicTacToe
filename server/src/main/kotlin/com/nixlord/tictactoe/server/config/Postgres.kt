package com.nixlord.tictactoe.server.config

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration
import org.springframework.context.annotation.Configuration
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import org.springframework.context.annotation.Bean
import org.springframework.data.r2dbc.core.DatabaseClient

@Configuration
class Postgres {
    @Bean
    fun getConnectionFactory() = PostgresqlConnectionFactory(PostgresqlConnectionConfiguration.builder()
            .host("localhost")
            .port(5432)
            .database("dev")
            .username("postgres")
            .password("postgres")
            .build())
}
