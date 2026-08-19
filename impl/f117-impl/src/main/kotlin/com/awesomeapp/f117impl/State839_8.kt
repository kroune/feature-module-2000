package com.awesomeapp.f117impl

sealed class State839_8 {
    data object Loading : State839_8()
    data class Success(val data: String) : State839_8()
    data class Error(val message: String) : State839_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
