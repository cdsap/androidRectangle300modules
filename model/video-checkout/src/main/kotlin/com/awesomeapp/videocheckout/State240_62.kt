package com.awesomeapp.videocheckout

sealed class State240_62 {
    data object Loading : State240_62()
    data class Success(val data: String) : State240_62()
    data class Error(val message: String) : State240_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}