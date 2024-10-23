package com.example.lasalleapp.utils

import com.example.lasalleapp.ui.models.Calificacion
import com.example.lasalleapp.ui.models.Community
import com.example.lasalleapp.ui.models.Materia
import com.example.lasalleapp.ui.models.News
import com.example.lasalleapp.ui.models.Semestre

val newsList = listOf(
    News(id = 1,    title = "Evento de Construcción de la Paz",description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image =  "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"),
    News(id = 2,    title = "Conferencia de Liderazgo",    description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",    image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"),
    News(id = 3,    title = "Semana Cultural 2024",    description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",    image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg")
)

val communities = listOf(Community(1,"https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),    Community(2,"https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),    Community(3,"https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg  "),    Community(4,"https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),    Community(5,"https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),)


val semestreActual = Semestre(nombre = "Semestre Actual", materias = listOf(
    Materia(id = 1, nombre = "Matematicas", calificacion = Calificacion(parcial1 = 8.0, parcial2 = 2.1, parcial3 = 9.0)),
    Materia(id = 2, nombre = "Civica y etica", calificacion = Calificacion(parcial1 = 8.0, parcial2 = 2.1, parcial3 = 9.0)),
    Materia(id = 3, nombre = "Java 1", calificacion = Calificacion(parcial1 = 10.0, parcial2 = 9.1, parcial3 = 9.0)),
    Materia(id = 4, nombre = "Pyhton 2", calificacion = Calificacion(parcial1 = 8.0, parcial2 = 9.1, parcial3 = 9.0)),
    Materia(id = 5, nombre = "Minecraft 5", calificacion = Calificacion(parcial1 = 10.0, parcial2 = 6.1, parcial3 = 3.0)),
    Materia(id = 6, nombre = "Game Design", calificacion = Calificacion(parcial1 = 9.5, parcial2 = 10.0, parcial3 = 10.0)),
))