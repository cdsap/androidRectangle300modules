package com.awesomeapp.forecastlogin

sealed class State138_55 {
    data object Loading : State138_55()
    data class Success(val data: String) : State138_55()
    data class Error(val message: String) : State138_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}