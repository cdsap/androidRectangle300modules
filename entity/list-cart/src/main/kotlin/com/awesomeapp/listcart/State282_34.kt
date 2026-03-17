package com.awesomeapp.listcart

sealed class State282_34 {
    data object Loading : State282_34()
    data class Success(val data: String) : State282_34()
    data class Error(val message: String) : State282_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}