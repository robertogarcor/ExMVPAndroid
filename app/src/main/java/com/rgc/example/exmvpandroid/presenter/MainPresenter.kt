package com.rgc.example.exmvpandroid.presenter

import com.rgc.example.exmvpandroid.repository.MovieRepository
import com.rgc.example.exmvpandroid.repository.MovieRepositoryImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainPresenter(private val view: View, private val lifecycleScope: CoroutineScope) {

    private val repository : MovieRepository = MovieRepositoryImpl()

    interface View {
        fun setProgressVisibility(boolean: Boolean)
        fun setTextMovies(string: String)
    }

    fun onButtonClicked() {
        view.setProgressVisibility(true)
        lifecycleScope.launch {
            view.setTextMovies("")
            val listMovies = withContext(Dispatchers.IO) {
                Thread.sleep(2000)
                repository.getMovies()
            }
            for (movie in listMovies) {
                view.setTextMovies("${movie.title} | ${movie.type} \n")
            }
            view.setProgressVisibility(false)
        }
    }

}