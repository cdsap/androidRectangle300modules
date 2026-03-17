package com.awesomeapp.metricidentity

sealed class State174_49 {
    data object Loading : State174_49()
    data class Success(val data: String) : State174_49()
    data class Error(val message: String) : State174_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}