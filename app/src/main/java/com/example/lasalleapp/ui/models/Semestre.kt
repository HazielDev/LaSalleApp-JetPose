package com.example.lasalleapp.ui.models

import com.example.lasalleapp.ui.models.Materia

data class Semestre (
    val nombre : String,
    val materias : List<Materia>
)
