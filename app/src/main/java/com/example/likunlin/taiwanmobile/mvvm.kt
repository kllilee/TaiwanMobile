package com.example.likunlin.taiwanmobile


import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.likunlin.taiwanmobile.databinding.ActivityMvvmBinding

class mvvm : AppCompatActivity() {
    var bind: ActivityMvvmBinding? = null
    var viewModel: ViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)
        bind = DataBindingUtil.setContentView(this, R.layout.activity_mvvm)
        viewModel = ViewModel()

        bind!!.model = viewModel
        viewModel!!.name = "James"

    }
}

class ViewModel : BaseObservable() {
        @Bindable
        var name = ""
            set(value) {
                field = value
                 notifyPropertyChanged(BR.name)
            }
    }
