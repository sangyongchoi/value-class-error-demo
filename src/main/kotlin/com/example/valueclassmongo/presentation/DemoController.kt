package com.example.valueclassmongo.presentation

import com.example.valueclassmongo.domain.ValueClassDemo
import com.example.valueclassmongo.domain.ValueClassDemoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
    private val valueClassDemoService: ValueClassDemoService
) {

    @PostMapping("/demo")
    fun demo(): ResponseEntity<Nothing> {
        valueClassDemoService.create()

        return ResponseEntity.ok().build()
    }

    @GetMapping("/all")
    fun all(): MutableList<ValueClassDemo> {
        return valueClassDemoService.findAll()
    }
}
