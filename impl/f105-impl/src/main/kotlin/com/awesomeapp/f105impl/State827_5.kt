package com.awesomeapp.f105impl

sealed class State827_5 {
    data object Loading : State827_5()
    data class Success(val data: String) : State827_5()
    data class Error(val message: String) : State827_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
