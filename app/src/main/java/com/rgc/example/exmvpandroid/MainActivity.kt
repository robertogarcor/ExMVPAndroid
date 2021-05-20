package com.rgc.example.exmvpandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.rgc.example.exmvpandroid.databinding.ActivityMainBinding
import com.rgc.example.exmvpandroid.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainPresenter.View {

    private val presenter = MainPresenter(this, lifecycleScope)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        with(binding) {
            buttonGetList.setOnClickListener {
                textViewMovie.text = ""
                presenter.onButtonClicked()
            }
        }
    }

    override fun setProgressVisibility(boolean: Boolean) {
        with(binding) {
            if (boolean) progressBar.visibility = View.VISIBLE else progressBar.visibility = View.INVISIBLE
        }
    }

    override fun setTextMovies(string: String) {
        binding.textViewMovie.append(string)
    }
}