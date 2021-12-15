package com.pets.petshop.repo

import com.pets.petshop.model.Pet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PetRepository : JpaRepository<Pet, Long> {
    fun findByName(name: String) : List<Pet>
}