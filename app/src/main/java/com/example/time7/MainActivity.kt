package com.example.time7

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Login");
        val btLogin = findViewById<Button>(R.id.buttonLogin)


        btLogin.setOnClickListener{
            val tLogin = findViewById<EditText>(R.id.editTextLogin)
            val tSenha = findViewById<EditText>(R.id.editTextSenha)
            val login = tLogin.text.toString()
            val senha = tSenha.text.toString()

            if(login == "caio" && senha =="lindo7"){
                val intent = Intent(this, BemVindo::class.java)
                val params = Bundle()
                params.putString("login", login)
                intent.putExtras(params)
                startActivity(intent)

            }else{
                Toast.makeText(this, "login e/ou senha incorretos!",
                    Toast.LENGTH_LONG).show()
            }
        }
        }
    }

