package com.pets.petshop.model

import javax.persistence.*

@Entity
@Table(name = "pet")
open class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Column(name = "name", nullable = false)
    open var name: String? = null
    @Column(name = "age", nullable = false)
    open var age: Int? = null


    constructor(name: String?, age: Int?) {
        this.name = name
        this.age = age
    }
}

