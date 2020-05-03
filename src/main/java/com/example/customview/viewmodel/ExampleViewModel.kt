package com.example.customview.viewmodel

import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.customview.R
import com.example.customview.model.Users

class ExampleViewModel: ViewModel() {
    private var usersMutableLiveData = MutableLiveData<List<Users>>()
    val usersLiveData: LiveData<List<Users>>
        get() = usersMutableLiveData
    private var usersList = mutableListOf<Users>()

    fun loadUsers() {
        val user1 = Users(R.drawable.ic_child_friendly_black_24dp, "some text", true, Color.BLUE)
        val user2 = Users(R.drawable.ic_euro_symbol_black_24dp, "another text", true, Color.GREEN)
        val user3 = Users(R.drawable.ic_child_friendly_black_24dp, "lots and lots and lots of different text", false, Color.MAGENTA)
        usersList.clear()
        usersList.add(user1)
        usersList.add(user2)
        usersList.add(user3)
        usersMutableLiveData.postValue(usersList)
    }
}