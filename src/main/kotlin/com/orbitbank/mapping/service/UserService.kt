package com.orbitbank.mapping.service

import com.orbitbank.mapping.entity.User
import com.orbitbank.mapping.repository.UserDao
import org.springframework.stereotype.Service

@Service
class UserService(private val userDao: UserDao) {

    fun getUserByName(username:String):User{
        return userDao.findById(username).get()
    }
}