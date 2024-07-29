package com.example.lesson5android3.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson5android3.data.models.DataItem
import com.example.lesson5android3.data.repositories.CharacterRepository
import com.example.lesson5android3.utils.UiState

class CharacterViewModel : ViewModel() {

    private val repository = CharacterRepository()
    private val _uiState = MutableLiveData<UiState<List<DataItem>>>()
    val uistate: LiveData<UiState<List<DataItem>>> = _uiState
    fun getCharacters(query: String) {
        repository.searchHarryPotter(query = query,
            onResponse = { data ->
                _uiState.value = UiState(isLoading = false, success = data)

            },
            onFailure = {
                _uiState.value = UiState(isLoading = false, error = null)
            })
    }
}