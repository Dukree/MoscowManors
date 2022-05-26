package com.max.moscowmanors.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.max.moscowmanors.domain.Manors
import com.max.moscowmanors.R
import com.max.moscowmanors.ui.SuburbMoscowFragment

class SuburbMoscowAdapter (
    private val context: SuburbMoscowFragment,
    private val allmanors: List<Manors>,
    val listener: (Manors) ->Unit
):RecyclerView.Adapter<SuburbMoscowAdapter.SuburbMoscowViewHolder>() {
    class SuburbMoscowViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val image_usadeb = view.findViewById<ImageView>(R.id._image_item)
        val nameManors = view.findViewById<TextView>(R.id._text_item)
            fun bindView (manors: Manors, listener: (Manors) -> Unit){
                image_usadeb.setImageResource(manors.image_usadeb)
                nameManors.text = manors.nameManors
                itemView.setOnClickListener{listener(manors)}
            }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuburbMoscowViewHolder =
        SuburbMoscowViewHolder(LayoutInflater.from(context.context).inflate(R.layout.list_item_view,parent,false))


    override fun onBindViewHolder(holder: SuburbMoscowViewHolder, position: Int) {
        holder.bindView(allmanors[position], listener)
    }

    override fun getItemCount(): Int =allmanors.size

}