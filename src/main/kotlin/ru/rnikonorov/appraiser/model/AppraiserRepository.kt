package ru.rnikonorov.appraiser.model

import org.springframework.data.repository.CrudRepository

interface AppraiserRepository : CrudRepository<AppraiserData, Long>