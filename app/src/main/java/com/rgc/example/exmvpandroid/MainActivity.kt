package com.rgc.example.exmvpandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.rgc.example.exmvpandroid.databinding.ActivityMainBinding
import com.rgc.example.exmvpandroid.repository.MovieRepository
import com.rgc.example.exmvpandroid.repository.MovieRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val repository : MovieRepository = MovieRepositoryImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonGetList.setOnClickListener {
            binding.progressBar.visibility =  View.VISIBLE
            binding.textViewMovie.text = ""
            lifecycleScope.launch {
                binding.textViewMovie.text = ""
                val listMovies = withContext(Dispatchers.IO) {
                    Thread.sleep(2000)
                    repository.getMovies()
                }
                for (movie in listMovies) {
                    binding.textViewMovie.append("${movie.title} | ${movie.type} \n")
                }
                binding.progressBar.visibility =  View.INVISIBLE
            }
        }

    }
}