package com.awesomeapp.f630api

sealed class State713_8 {
    data object Loading : State713_8()
    data class Success(val data: String) : State713_8()
    data class Error(val message: String) : State713_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
