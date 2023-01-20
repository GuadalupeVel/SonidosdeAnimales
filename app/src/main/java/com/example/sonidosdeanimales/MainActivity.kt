package com.example.sonidosdeanimales

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var sonidoCaballo: MediaPlayer
    private lateinit var sonidoElefante: MediaPlayer
    private lateinit var sonidoGallo: MediaPlayer
    private lateinit var sonidoMono: MediaPlayer
    private lateinit var sonidoGato: MediaPlayer
    private lateinit var sonidoPato: MediaPlayer
    private lateinit var sonidoPerro: MediaPlayer
    private lateinit var sonidoRana: MediaPlayer
    private lateinit var sonidoVaca: MediaPlayer

    private lateinit var sonido: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sonido = MediaPlayer()

        sonidoCaballo = MediaPlayer.create(this, R.raw.caballo)
        sonidoElefante = MediaPlayer.create(this, R.raw.elefante)
        sonidoGallo= MediaPlayer.create(this, R.raw.gallo)
        sonidoGato= MediaPlayer.create(this, R.raw.gato)
        sonidoMono= MediaPlayer.create(this, R.raw.mono)
        sonidoPato= MediaPlayer.create(this, R.raw.pato)
        sonidoPerro= MediaPlayer.create(this, R.raw.perro)
        sonidoRana= MediaPlayer.create(this, R.raw.rana)
        sonidoVaca= MediaPlayer.create(this, R.raw.vaca)

    }

    fun fnCaballo(view: View) {
        fnReproduccion(sonidoCaballo)
    }

    fun fnElefante(view: View) {
        fnReproduccion(sonidoElefante)
    }

    fun fnGallo(view: View) {
        fnReproduccion(sonidoGallo)
    }

    fun fnGato(view: View) {
        fnReproduccion(sonidoGato)
    }

    fun fnMono(view: View) {
        fnReproduccion(sonidoMono)
    }

    fun fnPato(view: View) {
        fnReproduccion(sonidoPato)
    }

    fun fnPerro(view: View) {
        fnReproduccion(sonidoPerro)
    }

    fun fnRana(view: View) {
        fnReproduccion(sonidoRana)
    }

    fun fnVaca(view: View) {
        fnReproduccion(sonidoVaca)
    }

    fun fnReproduccion(sonidoAnimal: MediaPlayer){
        if(sonido.isPlaying){
            sonido.pause()
            sonido.seekTo(0)
        }
        sonido = sonidoAnimal
        sonido.start()
    }


}
