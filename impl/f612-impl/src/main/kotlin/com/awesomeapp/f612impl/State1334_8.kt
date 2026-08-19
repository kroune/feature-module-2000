package com.awesomeapp.f612impl

sealed class State1334_8 {
    data object Loading : State1334_8()
    data class Success(val data: String) : State1334_8()
    data class Error(val message: String) : State1334_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
