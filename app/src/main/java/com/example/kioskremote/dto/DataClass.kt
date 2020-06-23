package com.example.kioskremote.dto

import com.google.firebase.Timestamp

class FoodData(var image: Int, var title: String, var description: String)

data class Store(
    val name: String? = null,
    val menuList: List<Menu>? = null,
    val table: List<Table>? = null,
    val location: String? = null
)

data class Menu(
    val name: String? = null,
    val price: Int? = null,
    val image: String? = null,
    val menuAbout: String? = null,
    val menuRatings: List<MenuRating>? = null
)

data class MenuRating(
    val rating: Int? = null,
    val review: String? = null
)

data class Table(
    val num: Int? = null,
    val availability: Boolean? = null
)

data class Order(
    var name: String? = null,
    var table: Int? = null,
    var menu: MutableList<String>? = null,
    var timestamp: Timestamp,
    var flag: Boolean
)

object OrderCount {
    var list = mutableListOf(0, 0, 0)
}