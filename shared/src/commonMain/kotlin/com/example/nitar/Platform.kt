package com.example.nitar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform