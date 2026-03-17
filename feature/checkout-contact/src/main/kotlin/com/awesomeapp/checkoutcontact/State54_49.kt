package com.awesomeapp.checkoutcontact

sealed class State54_49 {
    data object Loading : State54_49()
    data class Success(val data: String) : State54_49()
    data class Error(val message: String) : State54_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}