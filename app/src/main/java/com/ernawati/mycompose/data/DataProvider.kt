package com.ernawati.mycompose.data

import com.ernawati.mycompose.R

object DataProvider {
    val zodiakal =
        Zodiakal(
            id = 1,
            name = "David de Gea Quintana",
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            image = R.drawable.aries
        )

    val zodiakalList = listOf(
        zodiakal,
        Zodiakal(
            id = 2,
            name = "Eric Bertrand Bailly",
            description = "Jubilee enjoys thoughtful discussions by the campfire.",
            image = R.drawable.taurus
        ),
        Zodiakal(
            id = 3,
            name = "Victor Jörgen Nilsson Lindelöf",
            description = "Beezy's favorite past-time is helping you choose your brand color.",
            image = R.drawable.gemini
        ),
        Zodiakal(
            id = 4,
            name = "Jacob Harry Maguire",
            description = "Mochi is the perfect \"rubbery ducky\" debugging pup, always listening.",
            image = R.drawable.cancer
        ),
        Zodiakal(
            id = 5,
            name = "Luke Paul Hoare Shaw",
            description = "Brewery loves fetching you your favorite homebrew.",
            image = R.drawable.leo
        ),
        Zodiakal(
            id = 6,
            name = "Bruno Miguel Borges Fernandes",
            description = "Picture yourself in a boat on a river, Lucy is a pup with kaleidoscope eyes.",
            image = R.drawable.virgo
        ),
        Zodiakal(
            id = 7,
            name = "Frederico Rodrigues de Paula Santos",
            description = "Is it a bird? A plane? No, it's Astro blasting off into your heart!",
            image = R.drawable.libra
        ),
        Zodiakal(
            id = 8,
            name = "Paul Labile Pogba",
            description = "Boo is just a teddy bear in disguise. What he lacks in grace, he makes up in charm.",
            image = R.drawable.scorpio
        ),
        Zodiakal(
            id = 9,
            name = "Edinson Roberto Gómez Cavani",
            description = "Pippa likes to look out the window and write pup-poetry.",
            image = R.drawable.sagitarius
        ),
        Zodiakal(
            id = 10,
            name = "Mason Will John Greenwood",
            description = "Coco enjoys getting pampered at the local puppy spa.",
            image = R.drawable.capricorn
        ),
        Zodiakal(
            id = 11,
            name = "Daniel Owen James",
            description = "Brody is a good boy, waiting for your next command.",
            image = R.drawable.aquarius
        ),
        Zodiakal(
            id = 12,
            name = "Marcus Rashford",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            image = R.drawable.pisces
        ),
    )
}
