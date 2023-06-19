package com.aditi.alertdialogue

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.aditi.alertdialogue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val builder1=AlertDialog.Builder(this)
            builder1.setTitle("Are you Sure?")
            builder1.setMessage("Do you want to close the App?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes") { dialogInterface, i ->
                //What action should be performed when Yes is clicked
                finish()
            }
            builder1.setNegativeButton("No") { dialogInterface, i ->
            }
            builder1.show()
        }

        binding.btn2.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rasmalai", "Rasogulla")
            val builder2 = AlertDialog.Builder(this)
        builder2.setTitle(("Which is your favourite item"))
        builder2.setSingleChoiceItems(options, 0) { dialog, which ->
            Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
        }
            builder2.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                //What action should be performed when Yes is clicked
            })
            builder2.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
            })
            builder2.show()
        }

        binding.btn3.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rasamalai", "Rasogulla")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle(("Which is your favourite item"))
            builder2.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog , which, isChecked ->
                Toast.makeText(this,"You clicked on ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Yes", { dialogInterface, i ->
                //What action should be performed when Yes is clicked
            })
            builder2.setNegativeButton("No") { dialogInterface, i ->
            }
            builder2.show()
        }

        }
    }

