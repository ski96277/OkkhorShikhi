package imransk.ml.okkhorshikhi.AdapterClass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import imransk.ml.okkhorshikhi.R
import kotlinx.android.synthetic.main.capital_letter_item_view.view.*

class CapitalLetters_Adapter(var capitalLetters_list: ArrayList<Int>) : RecyclerView.Adapter<CapitalLetters_Adapter.ViewHolder_Class>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder_Class {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.capital_letter_item_view, parent, false)
        return ViewHolder_Class(view)
    }

    override fun getItemCount(): Int {

        return capitalLetters_list.size
    }

    override fun onBindViewHolder(holder: ViewHolder_Class, position: Int) {


        return holder.setvalue(capitalLetters_list[position])
    }

    class ViewHolder_Class(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setvalue(capitalLetters_list: Int){
            itemView.item_image_capital_letter.setImageResource(capitalLetters_list)
        }

    }
}