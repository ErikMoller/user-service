package com.company.user.userservice.repository

import com.company.user.userservice.domain.User
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class UserRepositoryImpl : UserRepository {
    val repo = mutableMapOf<String,User>()

    override fun read(id: String) : User {
        return repo[id]!!
    }

    override fun store(user: User) : String {
        val id = UUID.randomUUID().toString()
        user.id = id
        repo[id] = user
        return id
    }
}