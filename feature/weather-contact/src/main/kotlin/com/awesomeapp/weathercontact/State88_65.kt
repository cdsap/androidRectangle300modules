package com.awesomeapp.weathercontact

sealed class State88_65 {
    data object Loading : State88_65()
    data class Success(val data: String) : State88_65()
    data class Error(val message: String) : State88_65()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}