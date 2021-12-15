package com.pets.petshop.controller

import com.pets.petshop.model.PetDto
import com.pets.petshop.service.PetService
import com.pets.petshop.service.toEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pets")
class PetController @Autowired constructor(val petService: PetService) {

    @RequestMapping("/")
    fun getAll() = petService.getAll()

    @GetMapping("/{name}")
    fun getByName(@PathVariable name: String) = petService.getByName(name)

    @PostMapping("/add/")
    fun addPet(@RequestBody petDto: PetDto) = petService.savePet(toEntity(petDto))
}