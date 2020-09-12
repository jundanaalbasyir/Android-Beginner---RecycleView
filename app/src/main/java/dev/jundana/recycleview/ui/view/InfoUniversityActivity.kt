package dev.jundana.recycleview.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import dev.jundana.recycleview.R
import kotlinx.android.synthetic.main.activity_info_university.*

class InfoUniversityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_university)

        val univPhoto = intent.getIntExtra("photoUniv", 0)
        val univName = intent.getStringExtra("nameUniv")
        val univInfo = intent.getStringExtra("infoUniv")
        val univLocation = intent.getStringExtra("locationUniv")

        Glide.with(this)
            .load(univPhoto)
            .into(img_univ_photo)

        tv_univ_name.setText(univName)
        tv_univ_info.setText(univInfo)
        tv_univ_location.setText(univLocation)
    }
}