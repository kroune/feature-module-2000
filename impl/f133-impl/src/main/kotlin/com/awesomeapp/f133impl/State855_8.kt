package com.awesomeapp.f133impl

sealed class State855_8 {
    data object Loading : State855_8()
    data class Success(val data: String) : State855_8()
    data class Error(val message: String) : State855_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
