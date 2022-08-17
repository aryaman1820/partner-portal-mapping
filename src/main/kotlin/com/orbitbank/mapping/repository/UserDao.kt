package com.orbitbank.mapping.repository

import com.orbitbank.mapping.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDao: JpaRepository<User, String> {
}