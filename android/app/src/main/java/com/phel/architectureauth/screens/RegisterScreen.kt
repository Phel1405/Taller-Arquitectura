package com.phel.architectureauth.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import androidx.lifecycle.viewmodel.compose.viewModel
import com.phel.architectureauth.viewmodel.RegisterViewModel

data class RegisterState(
    val email: String = "",
    val password: String = "",
    val username: String = "",
    val nombre: String = "",
    val apellido: String = "",
    val cedula: String = ""
)

@Composable
fun RegisterScreen(controller: NavController, model: RegisterViewModel = viewModel()){
    val registerState by model.registerState.collectAsState()
}