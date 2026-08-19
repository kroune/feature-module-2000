package com.awesomeapp.f197api

sealed class State280_9 {
    data object Loading : State280_9()
    data class Success(val data: String) : State280_9()
    data class Error(val message: String) : State280_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
