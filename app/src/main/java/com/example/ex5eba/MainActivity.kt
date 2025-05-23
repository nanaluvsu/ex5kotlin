package com.example.ex5eba

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ex5eba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val emailVerif = "bom@aulakotlin.com"
        val senhaVerif = "24018492"
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener {

            val email = binding.emailUsuario.text.toString()
            val senha = binding.senhaUsuario.text.toString()

            if (email.isBlank()) { //checa email vazio
                val toast = Toast.makeText(this, "Por favor, preencha o campo e-mail", Toast.LENGTH_SHORT).show()

            } else if (email != emailVerif ) {

                var toast = Toast.makeText(this, "E-mail incorreto. Por favor, tente novamente", Toast.LENGTH_SHORT).show()
            } else if (senha.isBlank()) { //checa senha vazia

                    val toast = Toast.makeText(this, "Por favor, preencha o campo senha", Toast.LENGTH_SHORT).show()
            } else if (senha != senhaVerif) {

                    val toast = Toast.makeText(this, "Senha incorreta. Por favor, tente novamente", Toast.LENGTH_SHORT).show()
            } else {
                    val toast = Toast.makeText(this, "Bem-vinda,$email!", Toast.LENGTH_SHORT).show();
                val intent = Intent(this@MainActivity, telalogada::class.java)
                startActivity(intent)
                }
            }
        }
        }
    
