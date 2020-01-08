package ru.rnikonorov.appraiser.model

/**
 * Типы недвижимого имущества
 */
enum class PropertyTypes(val description: String) {
    OFFICE("Офисные"),
    RETAIL("Торговое"),
    PRODUCTION("Производственное"),
    WAREHOUSE("Складское"),
    COMMON("Универсальное"),
    LAND("Земельный участок")
}