package com.rgc.example.exmvpandroid.repository

import com.rgc.example.exmvpandroid.datasource.Movie

interface MovieRepository {

    fun getMovies() : ArrayList<Movie>

}