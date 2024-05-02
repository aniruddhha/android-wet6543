package com.ani.rest.crud

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RequestMapping("/simple")
@RestController
class SimpleController {

    @GetMapping
    public fun show(): ResponseEntity<App> {
        val app = App(id = "12", cnt = 90)
        println("-------> Client requested this method")
        return  ResponseEntity.ok(app)
    }
}