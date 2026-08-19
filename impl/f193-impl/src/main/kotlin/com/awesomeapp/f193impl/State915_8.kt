package com.awesomeapp.f193impl

sealed class State915_8 {
    data object Loading : State915_8()
    data class Success(val data: String) : State915_8()
    data class Error(val message: String) : State915_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
