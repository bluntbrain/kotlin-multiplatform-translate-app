package com.example.myfirstkmmapp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, Ishan, I'm ${platform.name} !"
    }
}