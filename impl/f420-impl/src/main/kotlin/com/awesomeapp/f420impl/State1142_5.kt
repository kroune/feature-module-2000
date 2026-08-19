package com.awesomeapp.f420impl

sealed class State1142_5 {
    data object Loading : State1142_5()
    data class Success(val data: String) : State1142_5()
    data class Error(val message: String) : State1142_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
