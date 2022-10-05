package com.example.valueclassmongo.domain

import org.springframework.stereotype.Service

@Service
class ValueClassDemoService(
    private val valueClassDemoRepository: ValueClassDemoRepository
) {

    fun create() {
        val demo = ValueClassDemo(
            demo = ValueClassDemo.Demo(1)
        )

        valueClassDemoRepository.save(demo)
    }

    fun findAll(): MutableList<ValueClassDemo> {
        return valueClassDemoRepository.findAll()
    }
}
