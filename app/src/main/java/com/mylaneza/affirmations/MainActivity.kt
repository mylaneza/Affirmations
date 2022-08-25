package com.mylaneza.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.TextView
//import com.mylaneza.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //3. Setting up the list of data
        /*val textView : TextView = findViewById(R.id.textview)
        textView.text = Datasource().loadAffirmations().size.toString()*/
    }
}