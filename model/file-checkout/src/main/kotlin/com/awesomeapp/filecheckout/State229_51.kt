package com.awesomeapp.filecheckout

sealed class State229_51 {
    data object Loading : State229_51()
    data class Success(val data: String) : State229_51()
    data class Error(val message: String) : State229_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}