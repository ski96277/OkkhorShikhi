package imransk.ml.okkhorshikhi.AdapterClass

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import imransk.ml.okkhorshikhi.R
import kotlinx.android.synthetic.main.english_number_item_view.view.*

class English_Numer_Adapter(var numberEnglishSpeeling: ArrayList<String>) : RecyclerView.Adapter<English_Numer_Adapter.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.english_number_item_view, parent, false)
        return ViewHolderClass(view)

    }

    override fun getItemCount(): Int {

        return numberEnglishSpeeling.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {

        return holder.setvalue(position,numberEnglishSpeeling[position])
    }

    class ViewHolderClass(var view: View) : RecyclerView.ViewHolder(view) {

        fun setvalue(number: Int, numberEnglishSpeeling: String) {
            if (number%2==0){
                view.linearLayout_English_number_Item.setBackgroundColor(Color.parseColor("#0388EE"))
            }else{
                view.linearLayout_English_number_Item.setBackgroundColor(Color.parseColor("#99BCD5"))
            }
            view.textView_ID_English_number.text = number.toString()
            view.textView_ID_English_number_Speeling.text=numberEnglishSpeeling

        }


    }
}

