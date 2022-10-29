package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat.startActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //SetUp
        setUp()
    }

    private fun setUp() {
        title = "Autenticacion"
        button3.setOnClickListener {
            if (editTextTextEmailAddress2.text.isNotEmpty() && editTextTextPassword2.text.isNotEmpty() &&
                editTextTextPassword3.text.isNotEmpty()
            ) {
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    editTextTextEmailAddress2.text.toString(), editTextTextPassword2.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {
                        showHome(it.result.user?.email?:"",ProviderType.BASIC)
                    } else {
                        showAlert()
                    }
                }
            }
            }
        button4.setOnClickListener{
         startActivity(Intent(this,MainActivity::class.java))
        }
        }

    private fun showAlert() {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Notificacion")
            builder.setMessage("Confirmada tu cuenta")
            builder.setPositiveButton("aceptar", null)
            val dialog: AlertDialog = builder.create()
            dialog.show()

        }
 private fun showHome(email: String,provider: ProviderType) {
     val homeIntent: Intent = Intent( this, MainActivity3::class.java).apply {
         putExtra("email", email)
         putExtra("provider", provider.name)
     }
     startActivity(homeIntent)
 }


}


