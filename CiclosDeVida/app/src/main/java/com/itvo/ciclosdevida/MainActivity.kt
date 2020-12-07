package com.itvo.ciclosdevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var txvMusica:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txvMusica = findViewById(R.id.txv_estatus_musica)
        txvMusica.text="Reproduciendo musica"

        Log.i("RegistrosDeMiApp","Estamos onCreate")
    }

    override fun onStart() {
        super.onStart()



        Log.i("RegistrosDeMiApp","Estamos onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("RegistrosDeMiApp","Estamos onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("RegistrosDeMiApp","Estamos onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("RegistrosDeMiApp","Estamos onPause")
    }

    override fun onStop() {
        super.onStop()

        txvMusica.text = "Musica Pausada"
        Log.i("RegistrosDeMiApp","Estamos onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("RegistrosDeMiApp","Estamos onDestroy")
    }
}