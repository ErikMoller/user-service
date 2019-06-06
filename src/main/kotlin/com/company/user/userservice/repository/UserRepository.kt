package com.company.user.userservice.repository

import com.company.user.userservice.domain.User

interface UserRepository {
    fun store(user: User) : String

    fun read(id: String) : User
}