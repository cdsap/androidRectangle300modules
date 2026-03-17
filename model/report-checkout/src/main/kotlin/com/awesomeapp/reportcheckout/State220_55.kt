package com.awesomeapp.reportcheckout

sealed class State220_55 {
    data object Loading : State220_55()
    data class Success(val data: String) : State220_55()
    data class Error(val message: String) : State220_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}