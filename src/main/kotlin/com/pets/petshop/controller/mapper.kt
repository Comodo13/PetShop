package com.pets.petshop.service

import com.pets.petshop.model.Pet
import com.pets.petshop.model.PetDto

fun fromEntity(entity: Pet) = PetDto(
    entity.name!!,
    entity.age!!
)

fun toEntity(dto: PetDto)= Pet(
    dto.name,
    dto.age
)