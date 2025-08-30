package org.arturocastro.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform