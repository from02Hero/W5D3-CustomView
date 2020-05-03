package com.example.customview.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customview.R
import com.example.customview.viewmodel.ExampleViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(ExampleViewModel::class.java)
        viewModel.usersLiveData.observe(this, Observer {
            usersRv.layoutManager = LinearLayoutManager(this)
            usersRv.adapter = UsersAdapter(it)
        })
        viewModel.loadUsers()
    }
}
