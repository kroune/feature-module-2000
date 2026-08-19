package com.awesomeapp.f143impl

sealed class State865_7 {
    data object Loading : State865_7()
    data class Success(val data: String) : State865_7()
    data class Error(val message: String) : State865_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
