package com.max.moscowmanors.domain

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.imageview.ShapeableImageView
import com.max.moscowmanors.R
import com.max.moscowmanors.ui.MoscowFragment.Companion.INTENT_PARCELABLE


class ManorsDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.manors_details)

        val manors = intent.getParcelableExtra<Manors>(INTENT_PARCELABLE)

        val imgUsadeb = findViewById<ShapeableImageView>(R.id.image_usadeb)
        val nameManors = findViewById<TextView>(R.id.nameManors)
        val addressManors = findViewById<TextView>(R.id.addressManors)
        val hystoryManors = findViewById<TextView>(R.id.history_manors)

        if (manors != null) {
            imgUsadeb.setImageResource(manors.image_usadeb)
        }
        if (manors != null) {
            nameManors.text = manors.nameManors
        }
        if (manors != null) {
            addressManors.text = manors.addressManors
        }
        if (manors != null) {
            hystoryManors.text = manors.history_manors
        }
        hystoryManors.movementMethod = LinkMovementMethod.getInstance()

        //val shapeableImageView = findViewById<ShapeableImageView>(R.id.image_usadeb)
        val shapeAppearanceModel = imgUsadeb.shapeAppearanceModel.toBuilder()
            .build()
        imgUsadeb.shapeAppearanceModel = shapeAppearanceModel

//        val builder = AlertDialog.Builder(this)
//        builder.setMessage("Перейти на сайт Википедии?")
//            .setCancelable(true)
//            .setPositiveButton("Да") { dialog, which ->
//                hystoryManors.movementMethod = LinkMovementMethod.getInstance()
//            }
//            .setNegativeButton("Нет") { dialog, which ->
//                dialog.cancel()
//            }
//        builder.show()
    }

    }




