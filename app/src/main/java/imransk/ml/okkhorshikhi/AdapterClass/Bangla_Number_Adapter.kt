package imransk.ml.okkhorshikhi.AdapterClass

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import imransk.ml.okkhorshikhi.R
import kotlinx.android.synthetic.main.bangla_number_item_view.view.*
import kotlinx.android.synthetic.main.english_number_item_view.view.*

class Bangla_Number_Adapter(
    var banglanumberList: ArrayList<String>,
    var banglaNumberKothayList: ArrayList<String>
) : RecyclerView.Adapter<Bangla_Number_Adapter.viewHolder_Class>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder_Class {

        var layoutInflater =
            LayoutInflater.from(parent.context).inflate(R.layout.bangla_number_item_view, parent, false)
        return viewHolder_Class(layoutInflater)
    }

    override fun getItemCount(): Int {
        return banglanumberList.size
    }

    override fun onBindViewHolder(holder: viewHolder_Class, position: Int) {

        return holder.setvalue(banglanumberList[position],banglaNumberKothayList[position])
    }


    class viewHolder_Class(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setvalue(number: String,number_kothay:String) {

            if (number.toInt()%2==0){
                itemView.linearLayout_Bangla_number_Item.setBackgroundColor(Color.parseColor("#0388EE"))
            }else{
                itemView.linearLayout_Bangla_number_Item.setBackgroundColor(Color.parseColor("#99BCD5"))
            }

            itemView.textView_ID_Bangla_number.text=number
            itemView.textView_ID_Bangla_number_kothay.text=number_kothay


        }

    }
}