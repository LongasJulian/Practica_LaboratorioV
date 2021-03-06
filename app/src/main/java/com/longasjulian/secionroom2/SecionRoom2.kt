package com.longasjulian.secionroom2

import android.app.Application
import androidx.room.Room
import com.longasjulian.secionroom2.model.Deudor.DeudorDataBase
import com.longasjulian.secionroom2.model.usuario.UsuarioDataBase

class SecionRoom2 : Application()  {

    companion object{
        lateinit var database: DeudorDataBase
        lateinit var database2: UsuarioDataBase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            this,
            DeudorDataBase::class.java,
            "misdeudores_db"
        ).allowMainThreadQueries()
            .build()

        database2 = Room.databaseBuilder(
            this,
            UsuarioDataBase::class.java,
            "usuarios_db"
        ).allowMainThreadQueries()
            .build()

    }


}