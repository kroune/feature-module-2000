package com.awesomeapp.f274impl

sealed class State996_8 {
    data object Loading : State996_8()
    data class Success(val data: String) : State996_8()
    data class Error(val message: String) : State996_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
