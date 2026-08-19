package com.awesomeapp.f129impl

sealed class State851_8 {
    data object Loading : State851_8()
    data class Success(val data: String) : State851_8()
    data class Error(val message: String) : State851_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
