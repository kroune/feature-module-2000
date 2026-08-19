package com.awesomeapp.f275impl

sealed class State997_8 {
    data object Loading : State997_8()
    data class Success(val data: String) : State997_8()
    data class Error(val message: String) : State997_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
