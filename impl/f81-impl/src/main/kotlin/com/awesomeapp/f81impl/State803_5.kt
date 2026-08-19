package com.awesomeapp.f81impl

sealed class State803_5 {
    data object Loading : State803_5()
    data class Success(val data: String) : State803_5()
    data class Error(val message: String) : State803_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
