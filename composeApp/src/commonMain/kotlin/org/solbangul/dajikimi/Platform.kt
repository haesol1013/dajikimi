package org.solbangul.dajikimi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform