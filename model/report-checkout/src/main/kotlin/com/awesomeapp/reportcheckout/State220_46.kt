package com.awesomeapp.reportcheckout

sealed class State220_46 {
    data object Loading : State220_46()
    data class Success(val data: String) : State220_46()
    data class Error(val message: String) : State220_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}