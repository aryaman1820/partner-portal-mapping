package com.orbitbank.mapping.repository

import com.orbitbank.mapping.entity.Mapping
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MappingDao: JpaRepository<Mapping,String> {
}