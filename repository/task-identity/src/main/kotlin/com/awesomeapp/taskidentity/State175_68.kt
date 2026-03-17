package com.awesomeapp.taskidentity

sealed class State175_68 {
    data object Loading : State175_68()
    data class Success(val data: String) : State175_68()
    data class Error(val message: String) : State175_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}