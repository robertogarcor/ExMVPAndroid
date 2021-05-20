package com.rgc.example.exmvpandroid.repository

import com.rgc.example.exmvpandroid.datasource.Movie

class MovieRepositoryImpl : MovieRepository {

    private val dataSource = ArrayList<Movie>()

    init {
        dataSource.add(Movie("Aquellos que desean mi muerte","Suspense","http://es.web.img2.acsta.net/pictures/21/04/27/15/37/5016956.jpg"))
        dataSource.add(Movie("Nadie (Nobody)","Acción","http://es.web.img2.acsta.net/pictures/20/12/15/11/11/4656694.jpg"))
        dataSource.add(Movie("El Señor de los Anillos: El retorno del Rey","Fantasia","http://es.web.img2.acsta.net/medias/nmedia/18/89/68/19/20061877.jpg"))
        dataSource.add(Movie("Chaos Walking","Ciencia ficción","http://es.web.img2.acsta.net/pictures/20/11/13/15/54/0111059.jpg"))
        dataSource.add(Movie("Tiburón blanco","Acción","http://es.web.img1.acsta.net/pictures/18/06/11/12/39/2719882.jpg"))
        dataSource.add(Movie("Godzilla vs Kong","Acción","http://es.web.img2.acsta.net/pictures/21/03/15/18/35/3097205.jpg"))
        dataSource.add(Movie("¡Upsss 2! ¿Y ahora dónde está Noé?","Animación","http://es.web.img3.acsta.net/pictures/20/12/22/18/16/0531955.jpg"))
        dataSource.add(Movie("Mortal Kombat","Acción","http://es.web.img2.acsta.net/pictures/21/03/30/16/14/5223967.jpg"))
        dataSource.add(Movie("Ejército de los muertos","Acción","http://es.web.img1.acsta.net/pictures/21/05/11/13/22/5520699.jpg"))
        dataSource.add(Movie("Raya y el último dragón","Animación","http://es.web.img1.acsta.net/pictures/21/02/24/11/45/0895010.jpg"))
        dataSource.add(Movie("Los Croods: Una nueva era","Animación","http://es.web.img1.acsta.net/pictures/20/09/22/10/55/0339841.jpg"))
        dataSource.add(Movie("Ruega por nosotros","Terror","http://es.web.img3.acsta.net/pictures/21/03/17/13/18/1808324.jpg"))
        dataSource.add(Movie("El Señor de los Anillos: Las dos torres","Fantasia","http://es.web.img1.acsta.net/medias/nmedia/18/89/85/69/20070008.jpg"))
        dataSource.add(Movie("Fausto","Drama","http://es.web.img2.acsta.net/medias/nmedia/18/89/04/60/20033172.jpg"))
        dataSource.add(Movie("The Father","Drama","http://es.web.img3.acsta.net/pictures/20/07/07/14/50/3107181.jpg"))
        dataSource.add(Movie("El Señor de los Anillos: La Comunidad del Anillo","Fantasia","http://es.web.img1.acsta.net/medias/nmedia/18/89/67/45/20061512.jpg"))
        dataSource.add(Movie("Valhalla Rising","Aventura","http://es.web.img3.acsta.net/pictures/21/05/12/10/18/2689211.jpg"))
        dataSource.add(Movie("Yalda, la noche del perdón","Drama","http://es.web.img1.acsta.net/pictures/21/03/11/11/03/0348566.jpg"))
        dataSource.add(Movie("Saw VIII","Terror","http://es.web.img3.acsta.net/pictures/17/10/17/15/37/4218287.jpg"))
        dataSource.add(Movie("Bajo las estrellas de París","Comedia dramática","http://es.web.img2.acsta.net/pictures/21/03/17/10/35/0228383.jpg"))
        dataSource.add(Movie("El Fotógrafo de Mauthausen","Biografía","http://es.web.img3.acsta.net/pictures/18/06/06/10/23/4915649.jpg"))
    }

    override fun getMovies(): ArrayList<Movie> {
        return dataSource
    }
}