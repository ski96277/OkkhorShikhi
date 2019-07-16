package imransk.ml.okkhorshikhi.Activity

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import imransk.ml.okkhorshikhi.AdapterClass.Arbi_Borno_Adapter
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import kotlinx.android.synthetic.main.activity_arbi__borno.*

class Arbi_Borno_Activity : AppCompatActivity() {

    var arbi_borno_List=ArrayList<String>()
    val arbi_Letters_Sound_list = ArrayList<Int>()

var mediaPlayer=MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arbi__borno)

        arbi_borno_List.add("ا")
        arbi_borno_List.add("ب")
        arbi_borno_List.add("ت")
        arbi_borno_List.add("ث")
        arbi_borno_List.add("ج")
        arbi_borno_List.add("ح")
        arbi_borno_List.add("خ")
        arbi_borno_List.add("د")
        arbi_borno_List.add("ذ")
        arbi_borno_List.add("ر")
        arbi_borno_List.add("ز")
        arbi_borno_List.add("س")
        arbi_borno_List.add("ش")
        arbi_borno_List.add("ص")
        arbi_borno_List.add("ض")
        arbi_borno_List.add("ط")
        arbi_borno_List.add("ظ")
        arbi_borno_List.add("ع")
        arbi_borno_List.add("غ")
        arbi_borno_List.add("ف")
        arbi_borno_List.add("ق")
        arbi_borno_List.add("ك")
        arbi_borno_List.add("ل")
        arbi_borno_List.add("م")
        arbi_borno_List.add("ن")
        arbi_borno_List.add("و")
        arbi_borno_List.add("ه")
        arbi_borno_List.add("ء")
        arbi_borno_List.add("ي")


        arbi_Letters_Sound_list.add(R.raw.arbi_1)
        arbi_Letters_Sound_list.add(R.raw.arbi_2)
        arbi_Letters_Sound_list.add(R.raw.arbi_3)
        arbi_Letters_Sound_list.add(R.raw.arbi_4)
        arbi_Letters_Sound_list.add(R.raw.arbi_5)
        arbi_Letters_Sound_list.add(R.raw.arbi_6)
        arbi_Letters_Sound_list.add(R.raw.arbi_7)
        arbi_Letters_Sound_list.add(R.raw.arbi_8)
        arbi_Letters_Sound_list.add(R.raw.arbi_9)
        arbi_Letters_Sound_list.add(R.raw.arbi_10)
        arbi_Letters_Sound_list.add(R.raw.arbi_11)
        arbi_Letters_Sound_list.add(R.raw.arbi_12)
        arbi_Letters_Sound_list.add(R.raw.arbi_13)
        arbi_Letters_Sound_list.add(R.raw.arbi_14)
        arbi_Letters_Sound_list.add(R.raw.arbi_15)
        arbi_Letters_Sound_list.add(R.raw.arbi_16)
        arbi_Letters_Sound_list.add(R.raw.arbi_17)
        arbi_Letters_Sound_list.add(R.raw.arbi_18)
        arbi_Letters_Sound_list.add(R.raw.arbi_19)
        arbi_Letters_Sound_list.add(R.raw.arbi_20)
        arbi_Letters_Sound_list.add(R.raw.arbi_21)
        arbi_Letters_Sound_list.add(R.raw.arbi_22)
        arbi_Letters_Sound_list.add(R.raw.arbi_23)
        arbi_Letters_Sound_list.add(R.raw.arbi_24)
        arbi_Letters_Sound_list.add(R.raw.arbi_25)
        arbi_Letters_Sound_list.add(R.raw.arbi_26)
        arbi_Letters_Sound_list.add(R.raw.arbi_27)
        arbi_Letters_Sound_list.add(R.raw.arbi_28)
        arbi_Letters_Sound_list.add(R.raw.arbi_29)

        /*arbi_borno_List.add(R.drawable.arbi_borno_1)
        arbi_borno_List.add(R.drawable.arbi_borno_2)
        arbi_borno_List.add(R.drawable.arbi_borno_3)
        arbi_borno_List.add(R.drawable.arbi_borno_4)
        arbi_borno_List.add(R.drawable.arbi_borno_5)
        arbi_borno_List.add(R.drawable.arbi_borno_6)
        arbi_borno_List.add(R.drawable.arbi_borno_7)
        arbi_borno_List.add(R.drawable.arbi_borno_8)
        arbi_borno_List.add(R.drawable.arbi_borno_9)
        arbi_borno_List.add(R.drawable.arbi_borno_10)
        arbi_borno_List.add(R.drawable.arbi_borno_11)
        arbi_borno_List.add(R.drawable.arbi_borno_12)
        arbi_borno_List.add(R.drawable.arbi_borno_13)
        arbi_borno_List.add(R.drawable.arbi_borno_14)
        arbi_borno_List.add(R.drawable.arbi_borno_15)
        arbi_borno_List.add(R.drawable.arbi_borno_16)
        arbi_borno_List.add(R.drawable.arbi_borno_17)
        arbi_borno_List.add(R.drawable.arbi_borno_18)
        arbi_borno_List.add(R.drawable.arbi_borno_19)
        arbi_borno_List.add(R.drawable.arbi_borno_20)
        arbi_borno_List.add(R.drawable.arbi_borno_21)
        arbi_borno_List.add(R.drawable.arbi_borno_22)
        arbi_borno_List.add(R.drawable.arbi_borno_23)
        arbi_borno_List.add(R.drawable.arbi_borno_24)
        arbi_borno_List.add(R.drawable.arbi_borno_25)
        arbi_borno_List.add(R.drawable.arbi_borno_26)
        arbi_borno_List.add(R.drawable.arbi_borno_27)
        arbi_borno_List.add(R.drawable.arbi_borno_28)
        arbi_borno_List.add(R.drawable.arbi_borno_29)
        arbi_borno_List.add(R.drawable.arbi_borno_30)*/

        var layoutManager=LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.HORIZONTAL
        arbi_okkhor_recycler_ID.layoutManager=layoutManager

        var arbiBornoAdapter =Arbi_Borno_Adapter(arbi_borno_List)
        arbi_okkhor_recycler_ID.adapter=arbiBornoAdapter

        textview_details_arbi_borno.text = arbi_borno_List[0]

        mediaPlayer.stop()
        mediaPlayer.release()
        mediaPlayer= MediaPlayer.create(this@Arbi_Borno_Activity,arbi_Letters_Sound_list[0])
        mediaPlayer.start()


        arbi_okkhor_recycler_ID.addOnItemTouchListener(RecyclerItemClickListenr(this,arbi_okkhor_recycler_ID,object : RecyclerItemClickListenr.OnItemClickListener{
            override fun onItemClick(view: View, position: Int) {


                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer= MediaPlayer.create(this@Arbi_Borno_Activity,arbi_Letters_Sound_list[position])
                mediaPlayer.start()

                textview_details_arbi_borno.text = arbi_borno_List[position]


//animation for recycler item
                YoYo.with(Techniques.BounceInLeft)
                    .duration(500)
                    .repeat(0)
                    .playOn(view.findViewById(R.id.item_text_arbi_letter))

            }

            override fun onItemLongClick(view: View?, position: Int) {

                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer= MediaPlayer.create(this@Arbi_Borno_Activity,arbi_Letters_Sound_list[position])
                mediaPlayer.start()

                textview_details_arbi_borno.text = arbi_borno_List[position]


//animation for item
                YoYo.with(Techniques.BounceInLeft)
                    .duration(500)
                    .repeat(0)
                    .playOn(view!!.findViewById(R.id.item_text_arbi_letter))


            }

        }))

    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
        mediaPlayer.release()
    }
}
