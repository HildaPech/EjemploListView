package com.example.ejemplolistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var frutas:ArrayList<String> = ArrayList()
        frutas.add("Manzana")
        frutas.add("Durazno")
        frutas.add("Plátano")
        frutas.add("Sandía")

        val lista = findViewById<ListView>(R.id.lista)
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        lista.adapter = adaptador
        lista.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this, frutas.get(position), Toast.LENGTH_LONG).show()
        }
    }
}