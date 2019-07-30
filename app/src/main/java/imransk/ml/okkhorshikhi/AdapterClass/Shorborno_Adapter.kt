package imransk.ml.okkhorshikhi.AdapterClass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import imransk.ml.okkhorshikhi.Activity.Shorborno_Activity
import imransk.ml.okkhorshikhi.R
import kotlinx.android.synthetic.main.shorborno_item_view.view.*

class Shorborno_Adapter(val contex: Shorborno_Activity, val shorbborno_text: ArrayList<String>) :
    RecyclerView.Adapter<Shorborno_Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.shorborno_item_view, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shorbborno_text.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindItems(shorbborno_text[position])

    }


    //the custom class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(shobrorno_text: String) {
//            itemView.item_image_shorborno.setImageResource(shobrorno_text)
            itemView.item_text_shorborno.setText(shobrorno_text)
        }


    }
}
