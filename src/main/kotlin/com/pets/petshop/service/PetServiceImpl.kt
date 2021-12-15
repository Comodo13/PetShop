package com.pets.petshop.service



import com.pets.petshop.model.PetDto
import com.pets.petshop.model.Pet
import com.pets.petshop.repo.PetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PetServiceImpl @Autowired constructor(val petRepository: PetRepository) : PetService{

    override fun getAll(): List<Pet> = petRepository.findAll()

    override fun getByName(name: String): List<Pet> = petRepository.findByName(name)

    override fun savePet(pet : Pet) = petRepository.save(pet)


}