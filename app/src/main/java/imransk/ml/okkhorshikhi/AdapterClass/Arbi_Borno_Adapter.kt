package imransk.ml.okkhorshikhi.AdapterClass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import imransk.ml.okkhorshikhi.R
import kotlinx.android.synthetic.main.arbi_borno_item_view.view.*

class Arbi_Borno_Adapter(var arbiBornoList: ArrayList<String>) :RecyclerView.Adapter<Arbi_Borno_Adapter.viewHolder_Class>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder_Class {

        var layoutInflater=LayoutInflater.from(parent.context).inflate(R.layout.arbi_borno_item_view,parent,false)

        return viewHolder_Class(layoutInflater)
    }

    override fun getItemCount(): Int {

        return arbiBornoList.size
    }

    override fun onBindViewHolder(holder: viewHolder_Class, position: Int) {

        return holder.setvalue(arbiBornoList[position])
    }


    class viewHolder_Class(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setvalue(s: String) {
            itemView.item_text_arbi_letter.text=s


        }
    }

}