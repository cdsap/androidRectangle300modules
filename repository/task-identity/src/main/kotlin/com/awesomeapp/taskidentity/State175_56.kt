package com.awesomeapp.taskidentity

sealed class State175_56 {
    data object Loading : State175_56()
    data class Success(val data: String) : State175_56()
    data class Error(val message: String) : State175_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}