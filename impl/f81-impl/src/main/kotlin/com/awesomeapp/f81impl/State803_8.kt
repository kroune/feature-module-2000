package com.awesomeapp.f81impl

sealed class State803_8 {
    data object Loading : State803_8()
    data class Success(val data: String) : State803_8()
    data class Error(val message: String) : State803_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
