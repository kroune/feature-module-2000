package com.awesomeapp.f105impl

sealed class State827_8 {
    data object Loading : State827_8()
    data class Success(val data: String) : State827_8()
    data class Error(val message: String) : State827_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
