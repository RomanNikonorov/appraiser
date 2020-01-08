package ru.rnikonorov.appraiser.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Основная таблица данных
 */
@Entity
class AppraiserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // синтетический уникальный идентификатор
    val id: Long = 0

    // тип помещения
    val type: PropertyTypes = PropertyTypes.COMMON

    // Район
    val district: String = ""

    // Улица (адрес)
    val address: String = ""

    // S, кв.м.
    val square: Double = 0.0

    // Этаж / подвал ()
    val floor: String = ""

    // Цена предложения
    val price: Long = 0

    // Примечания
    val comments: String? = null

    // в базе на дату
    val databaseDate: LocalDate = LocalDate.now()

    val link: String = ""

}