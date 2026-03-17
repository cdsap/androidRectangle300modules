package com.awesomeapp.forecastidentity

sealed class State187_36 {
    data object Loading : State187_36()
    data class Success(val data: String) : State187_36()
    data class Error(val message: String) : State187_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}