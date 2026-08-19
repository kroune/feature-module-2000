package com.awesomeapp.f272impl

sealed class State994_8 {
    data object Loading : State994_8()
    data class Success(val data: String) : State994_8()
    data class Error(val message: String) : State994_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
