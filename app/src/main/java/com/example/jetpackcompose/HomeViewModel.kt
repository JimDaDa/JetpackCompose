package com.example.jetpackcompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpackcompose.item.Books_Screen
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


private data class HomeViewModelState(
    val selectbook: String?=null,
    val screen_book :Books_Screen ?= null,
    val isLoading: Boolean=false

){

}

