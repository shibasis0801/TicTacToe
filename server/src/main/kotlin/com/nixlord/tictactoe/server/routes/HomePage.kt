package com.nixlord.tictactoe.server.routes

import io.r2dbc.spi.Row
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.r2dbc.core.DatabaseClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class Friend(val name: String, val age: Int) {
    companion object{
        fun create(row: Row): Friend? {
            val name = row.get("name") as String?
            val age = row.get("age") as Int?

            return if (name != null && age != null)
                Friend(name, age)
            else null
        }
    }
}

@RestController
class HomePage {
    @Autowired
    private lateinit var postgres: DatabaseClient;

    @GetMapping("/")
    fun handle() = "Hello WebFlux"

    @GetMapping("/friends")
    fun getFromDB() = postgres
                .execute("select * from friends")
                .map { row -> Friend.create(row) }
                .all()

}
