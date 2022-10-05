package com.example.valueclassmongo.domain

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface ValueClassDemoRepository : MongoRepository<ValueClassDemo, ObjectId>
