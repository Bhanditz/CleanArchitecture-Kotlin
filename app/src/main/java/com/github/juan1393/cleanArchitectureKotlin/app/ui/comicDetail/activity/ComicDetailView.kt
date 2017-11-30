package com.github.juan1393.cleanArchitectureKotlin.app.ui.comicDetail.activity

import com.github.juan1393.cleanArchitectureKotlin.app.ui.base.PresentationView


interface ComicDetailView : PresentationView {

    fun setHeaderImage(imageUrl: String)

    fun setTitle(title: String)

    fun setDescription(description: String)

    fun setCharacters(characters: String)

    fun setCreators(creators: String)

    fun setPrice(price: String)
}