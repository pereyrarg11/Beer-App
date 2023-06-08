package com.pereyrarg11.beerapp.data.mappers

import com.pereyrarg11.beerapp.data.local.BeerEntity
import com.pereyrarg11.beerapp.data.remote.BeerDto
import com.pereyrarg11.beerapp.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id ?: 0,
        name = name.orEmpty(),
        tagline = tagline.orEmpty(),
        description = description.orEmpty(),
        firstBrewed = first_brewed.orEmpty(),
        imageUrl = image_url.orEmpty(),
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl,
    )
}