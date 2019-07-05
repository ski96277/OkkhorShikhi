package imransk.ml.okkhorshikhi.AdapterClass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import imransk.ml.okkhorshikhi.R
import kotlinx.android.synthetic.main.small_letter_item_view.view.*

class Small_Letter_Adapter(var small_Litter_List: ArrayList<Int>) :
    RecyclerView.Adapter<Small_Letter_Adapter.ViewHolderClass>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.small_letter_item_view, parent, false)
        return ViewHolderClass(view)
    }

    override fun getItemCount(): Int {
        return small_Litter_List.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        return holder.setValue(small_Litter_List[position])
    }

    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setValue(small_Litter_List: Int) {
            itemView.item_image_small_letter.setImageResource(small_Litter_List)
        }
    }
}