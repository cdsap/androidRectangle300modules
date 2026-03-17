package com.awesomeapp.filecheckout

sealed class State229_57 {
    data object Loading : State229_57()
    data class Success(val data: String) : State229_57()
    data class Error(val message: String) : State229_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}