package com.awesomeapp.analyticscontact

sealed class State72_72 {
    data object Loading : State72_72()
    data class Success(val data: String) : State72_72()
    data class Error(val message: String) : State72_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}