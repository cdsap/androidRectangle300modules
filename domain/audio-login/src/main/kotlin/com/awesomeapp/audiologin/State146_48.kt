package com.awesomeapp.audiologin

sealed class State146_48 {
    data object Loading : State146_48()
    data class Success(val data: String) : State146_48()
    data class Error(val message: String) : State146_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}