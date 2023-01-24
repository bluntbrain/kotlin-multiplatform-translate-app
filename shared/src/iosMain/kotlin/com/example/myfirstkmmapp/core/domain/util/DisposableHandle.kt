package com.example.myfirstkmmapp.core.domain.util

fun interface DisposableHandle: kotlinx.coroutines.DisposableHandle

// this is how you use this DisposableHandle made by us
//fun DisposableHandle(block: () -> Unit): DisposableHandle{
//    return object: DisposableHandle{
//        override fun dispose() {
//            block()
//        }
//    }
//}
