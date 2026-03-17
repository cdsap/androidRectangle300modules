package com.awesomeapp.alarmcart

sealed class State276_63 {
    data object Loading : State276_63()
    data class Success(val data: String) : State276_63()
    data class Error(val message: String) : State276_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}