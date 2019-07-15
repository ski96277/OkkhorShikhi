package imransk.ml.okkhorshikhi.AdapterClass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import imransk.ml.okkhorshikhi.R
import kotlinx.android.synthetic.main.banjon_borno_item_view.view.*

class BanjonBorno_Adapter(var banjon_borno_List: ArrayList<String>) :
    RecyclerView.Adapter<BanjonBorno_Adapter.SetValue>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetValue {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.banjon_borno_item_view, parent, false)

        return SetValue(view)
    }

    override fun getItemCount(): Int {
        return banjon_borno_List.size
    }

    override fun onBindViewHolder(holder: SetValue, position: Int) {

        return holder.getValue(banjon_borno_List[position])
    }

    //the custom class is hodling the list view
    class SetValue(view: View) : RecyclerView.ViewHolder(view) {

        fun getValue(banjonborno:String){

//            itemView.item_image_banjon_borno.setImageResource(images)
            itemView.item_text_banjon_borno.text=banjonborno

        }
    }
}