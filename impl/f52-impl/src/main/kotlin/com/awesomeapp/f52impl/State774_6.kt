package com.awesomeapp.f52impl

sealed class State774_6 {
    data object Loading : State774_6()
    data class Success(val data: String) : State774_6()
    data class Error(val message: String) : State774_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
