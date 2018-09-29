package com.android.aluno.projetoandroid

import android.app.ProgressDialog.show
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<Button>(R.id.text);
        editText = findViewById(R.id.editext);
    }
    fun testeClick(view: View){
        Toast.makeText(this, "Mensagem",Toast.LENGTH_SHORT)
        val textoDoEditText = editext.text.toString()
        textView.text = textoDoEditText
    }
}
