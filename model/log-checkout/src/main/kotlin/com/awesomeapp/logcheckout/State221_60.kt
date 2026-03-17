package com.awesomeapp.logcheckout

sealed class State221_60 {
    data object Loading : State221_60()
    data class Success(val data: String) : State221_60()
    data class Error(val message: String) : State221_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}