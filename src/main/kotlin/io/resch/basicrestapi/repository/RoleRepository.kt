package io.resch.basicrestapi.repository

import io.resch.basicrestapi.model.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role, Long> {
    fun findByName(name: String): Role
}