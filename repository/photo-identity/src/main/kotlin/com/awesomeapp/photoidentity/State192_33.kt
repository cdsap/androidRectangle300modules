package com.awesomeapp.photoidentity

sealed class State192_33 {
    data object Loading : State192_33()
    data class Success(val data: String) : State192_33()
    data class Error(val message: String) : State192_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}