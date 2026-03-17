package com.awesomeapp.eventlogin

sealed class State128_74 {
    data object Loading : State128_74()
    data class Success(val data: String) : State128_74()
    data class Error(val message: String) : State128_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}