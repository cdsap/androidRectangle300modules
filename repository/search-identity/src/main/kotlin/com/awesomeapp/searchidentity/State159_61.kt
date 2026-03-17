package com.awesomeapp.searchidentity

sealed class State159_61 {
    data object Loading : State159_61()
    data class Success(val data: String) : State159_61()
    data class Error(val message: String) : State159_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}