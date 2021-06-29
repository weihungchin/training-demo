package com.example.training.course

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "course", schema = "training")
@Entity
class CourseEntity(
    @Id
    @Column(name = "id")
    val id: Long
)
