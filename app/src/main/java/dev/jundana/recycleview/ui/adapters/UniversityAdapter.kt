package dev.jundana.recycleview.ui.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dev.jundana.recycleview.R
import dev.jundana.recycleview.model.Universities
import dev.jundana.recycleview.ui.view.InfoUniversityActivity
import kotlinx.android.synthetic.main.item_university.view.*

class UniversityAdapter(list: ArrayList<Universities>) :
    RecyclerView.Adapter<UniversityAdapter.ListViewHolder>() {

    private val listUniversity: ArrayList<Universities> = list

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_university, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(listViewHolder: ListViewHolder, position: Int) {
        listUniversity.get(position).let { listViewHolder.bind(it) }
    }

    override fun getItemCount(): Int {
        return listUniversity.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(universities: Universities) {
            Glide.with(itemView.getContext())
                .load(universities.universityPhoto)
                .apply(RequestOptions().override(55, 55))
                .into(itemView.img_univ_photo)
            itemView.tv_univ_name.text = universities.universityName
            itemView.tv_univ_info.text = universities.universityInfo
            itemView.setOnClickListener {
                val university: Universities = listUniversity.get(adapterPosition)
                val intent = Intent(itemView.getContext(), InfoUniversityActivity::class.java)
                intent.putExtra("photoUniv", university.universityPhoto)
                intent.putExtra("nameUniv", university.universityName)
                intent.putExtra("infoUniv", university.universityInfo)
                intent.putExtra("locationUniv", university.universityLocation)
                itemView.getContext().startActivity(intent)
            }
        }
    }
}

