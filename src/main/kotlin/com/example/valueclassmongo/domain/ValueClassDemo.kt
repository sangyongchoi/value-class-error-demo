package com.example.valueclassmongo.domain

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class ValueClassDemo(
    @Id
    var id: ObjectId? = null,
    val demo: Demo
) {
    @JvmInline
    value class Demo(
        val value: Int
    )
}
