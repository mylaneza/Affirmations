package com.mylaneza.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mylaneza.affirmations.adapter.ItemAdapter
import com.mylaneza.affirmations.data.Datasource

//import android.widget.TextView
//import com.mylaneza.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //3. Setting up the list of data
        /*val textView : TextView = findViewById(R.id.textview)
        textView.text = Datasource().loadAffirmations().size.toString()*/

        //4. Adding a RecyclerView to your app
        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this,myDataset)
        //Optional for fixed sized data
        recyclerView.setHasFixedSize(true)
    }
}