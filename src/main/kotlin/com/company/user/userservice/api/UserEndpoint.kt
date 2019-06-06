package com.company.user.userservice.api

import com.company.user.userservice.domain.User
import com.company.user.userservice.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class UserEndpoint @Autowired constructor(val userRepository: UserRepository){

    @PostMapping
    fun create(@RequestBody user: User) : String {
        return userRepository.store(user)
    }

    @GetMapping("{id}")
    fun read(@PathVariable id: String) : User {
        return userRepository.read(id)
    }
}