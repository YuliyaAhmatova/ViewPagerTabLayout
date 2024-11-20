package com.example.viewpagertablayout.models

import com.example.viewpagertablayout.R
import java.io.Serializable

class Page(
    val name: String,
    val image: Int,
    val address: String
) : Serializable {
    companion object {
        var pages = mutableListOf(
            Page("Gismeteo", R.drawable.ic_sun, "https://www.gismeteo.ru/"),
            Page("Yandex", R.drawable.ic_search, "https://dzen.ru/?clid=2233626&yredirect=true"),
            Page("Mail", R.drawable.ic_email, "https://mail.ru/"),
            Page("Wikipedia", R.drawable.ic_newspaper, "https://www.wikipedia.org/")
        )
    }
}