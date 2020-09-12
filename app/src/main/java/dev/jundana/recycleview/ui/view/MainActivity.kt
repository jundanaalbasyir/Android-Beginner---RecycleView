package dev.jundana.recycleview.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.jundana.recycleview.R
import dev.jundana.recycleview.data.UniversitiesData
import dev.jundana.recycleview.model.Universities
import dev.jundana.recycleview.ui.adapters.UniversityAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list: ArrayList<Universities> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUniversity.setHasFixedSize(true)
        list.addAll(UniversitiesData.listData)

        rvUniversity.setLayoutManager(LinearLayoutManager(applicationContext))

        val listUniversityAdapter = UniversityAdapter(list)
        rvUniversity.setAdapter(listUniversityAdapter)
    }
}