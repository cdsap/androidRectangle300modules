package com.awesomeapp.filecheckout

sealed class State229_54 {
    data object Loading : State229_54()
    data class Success(val data: String) : State229_54()
    data class Error(val message: String) : State229_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}