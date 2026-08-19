package com.awesomeapp.f605impl

sealed class State1327_8 {
    data object Loading : State1327_8()
    data class Success(val data: String) : State1327_8()
    data class Error(val message: String) : State1327_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
