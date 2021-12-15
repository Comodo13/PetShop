package com.pets.petshop.service

import com.pets.petshop.model.Pet
import com.pets.petshop.model.PetDto

interface PetService {
    fun getAll(): List<Pet>
    fun getByName(name: String): List<Pet>
    fun savePet(pet : Pet) : Pet
}