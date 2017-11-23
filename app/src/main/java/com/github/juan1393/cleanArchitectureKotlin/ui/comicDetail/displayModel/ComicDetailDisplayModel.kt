package com.github.juan1393.cleanArchitectureKotlin.ui.comicDetail.displayModel

import com.github.juan1393.cleanArchitectureKotlin.domain.model.Comic
import java.text.SimpleDateFormat
import java.util.*


class ComicDetailDisplayModel(comic: Comic) {

    val imageUrl: String
    val title: String
    val description: String
    val characters: String
    val creators: String
    val releaseDate: String
    val price: String

    init {
        this.imageUrl = randomImage(comic)
        this.title = formatTitle(comic)
        this.description = formatDescription(comic)
        this.characters = formatCharacters(comic)
        this.creators = formatCreators(comic)
        this.releaseDate = comic.releaseDate!!
        this.price = formatPrice(comic)
    }

    private fun randomImage(comic: Comic): String {
        val random = Random()
        val index = random.nextInt(comic.imagesUrl!!.size)
        return comic.imagesUrl[index]
    }

    private fun formatTitle(comic: Comic): String = comic.title!!

    private fun formatDescription(comic: Comic) = comic.description!!

    private fun formatCharacters(comic: Comic): String {
        var characters = ""
        for (i in 0 until comic.characters!!.size) {
            val character = comic.characters!![i]
            characters += character.name
            if (i != comic.characters!!.size - 1) {
                characters += ", "
            }
        }
        return characters
    }

    private fun formatCreators(comic: Comic): String {
        var creators = ""
        for (i in 0 until comic.creators!!.size) {
            val creator = comic.creators!![i]
            creators += creator.name
            if (i != comic.creators!!.size - 1) {
                creators += ", "
            }
        }
        return creators
    }

    /*private fun formatReleaseDate(comic: Comic): String {
        val dateFormat = SimpleDateFormat("dd/MM/yyyy")
        return dateFormat.format(comic.releaseDate)
    }*/

    private fun formatPrice(comic: Comic): String = comic.printPrice.toString()
}
