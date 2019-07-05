package imransk.ml.okkhorshikhi.Activity

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import imransk.ml.okkhorshikhi.AdapterClass.BanjonBorno_Adapter
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import kotlinx.android.synthetic.main.activity_banjon_borno.*
import kotlin.collections.ArrayList

class BanjonBorno_Activity : AppCompatActivity() {

    var banjon_borno_List = ArrayList<Int>()
    var banjon_borno_voice_list = ArrayList<Int>()
    var banjon_borno_image_details_list = ArrayList<Int>()

    var mPlayer2: MediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banjon_borno)

        banjon_borno_List.add(R.drawable.banjon_borno_1)
        banjon_borno_List.add(R.drawable.banjon_borno_2)
        banjon_borno_List.add(R.drawable.banjon_borno_3)
        banjon_borno_List.add(R.drawable.banjon_borno_4)
        banjon_borno_List.add(R.drawable.banjon_borno_5)
        banjon_borno_List.add(R.drawable.banjon_borno_6)
        banjon_borno_List.add(R.drawable.banjon_borno_7)
        banjon_borno_List.add(R.drawable.banjon_borno_8)
        banjon_borno_List.add(R.drawable.banjon_borno_9)
        banjon_borno_List.add(R.drawable.banjon_borno_10)
        banjon_borno_List.add(R.drawable.banjon_borno_11)
        banjon_borno_List.add(R.drawable.banjon_borno_12)
        banjon_borno_List.add(R.drawable.banjon_borno_13)
        banjon_borno_List.add(R.drawable.banjon_borno_14)
        banjon_borno_List.add(R.drawable.banjon_borno_15)
        banjon_borno_List.add(R.drawable.banjon_borno_16)
        banjon_borno_List.add(R.drawable.banjon_borno_17)
        banjon_borno_List.add(R.drawable.banjon_borno_18)
        banjon_borno_List.add(R.drawable.banjon_borno_19)
        banjon_borno_List.add(R.drawable.banjon_borno_20)
        banjon_borno_List.add(R.drawable.banjon_borno_21)
        banjon_borno_List.add(R.drawable.banjon_borno_22)
        banjon_borno_List.add(R.drawable.banjon_borno_23)
        banjon_borno_List.add(R.drawable.banjon_borno_24)
        banjon_borno_List.add(R.drawable.banjon_borno_25)
        banjon_borno_List.add(R.drawable.banjon_borno_26)
        banjon_borno_List.add(R.drawable.banjon_borno_27)
        banjon_borno_List.add(R.drawable.banjon_borno_28)
        banjon_borno_List.add(R.drawable.banjon_borno_29)
        banjon_borno_List.add(R.drawable.banjon_borno_30)
        banjon_borno_List.add(R.drawable.banjon_borno_31)
        banjon_borno_List.add(R.drawable.banjon_borno_32)
        banjon_borno_List.add(R.drawable.banjon_borno_33)
        banjon_borno_List.add(R.drawable.banjon_borno_34)
        banjon_borno_List.add(R.drawable.banjon_borno_35)
        banjon_borno_List.add(R.drawable.banjon_borno_36)
        banjon_borno_List.add(R.drawable.banjon_borno_37)
        banjon_borno_List.add(R.drawable.banjon_borno_38)
        banjon_borno_List.add(R.drawable.banjon_borno_39)
        banjon_borno_List.add(R.drawable.banjon_borno_40)

        banjon_borno_voice_list.add(R.raw.b01)
        banjon_borno_voice_list.add(R.raw.b02)
        banjon_borno_voice_list.add(R.raw.b03)
        banjon_borno_voice_list.add(R.raw.b04)
        banjon_borno_voice_list.add(R.raw.b05)
        banjon_borno_voice_list.add(R.raw.b06)
        banjon_borno_voice_list.add(R.raw.b07)
        banjon_borno_voice_list.add(R.raw.b08)
        banjon_borno_voice_list.add(R.raw.b09)
        banjon_borno_voice_list.add(R.raw.b10)

        banjon_borno_voice_list.add(R.raw.b11)
        banjon_borno_voice_list.add(R.raw.b12)
        banjon_borno_voice_list.add(R.raw.b13)
        banjon_borno_voice_list.add(R.raw.b14)
        banjon_borno_voice_list.add(R.raw.b15)
        banjon_borno_voice_list.add(R.raw.b16)
        banjon_borno_voice_list.add(R.raw.b17)
        banjon_borno_voice_list.add(R.raw.b18)
        banjon_borno_voice_list.add(R.raw.b19)
        banjon_borno_voice_list.add(R.raw.b20)

        banjon_borno_voice_list.add(R.raw.b21)
        banjon_borno_voice_list.add(R.raw.b22)
        banjon_borno_voice_list.add(R.raw.b23)
        banjon_borno_voice_list.add(R.raw.b24)
        banjon_borno_voice_list.add(R.raw.b25)
        banjon_borno_voice_list.add(R.raw.b26)
        banjon_borno_voice_list.add(R.raw.b27)
        banjon_borno_voice_list.add(R.raw.b28)
        banjon_borno_voice_list.add(R.raw.b29)
        banjon_borno_voice_list.add(R.raw.b30)

        banjon_borno_voice_list.add(R.raw.b31)
        banjon_borno_voice_list.add(R.raw.b32)
        banjon_borno_voice_list.add(R.raw.b33)
        banjon_borno_voice_list.add(R.raw.b34)
        banjon_borno_voice_list.add(R.raw.b35)
        banjon_borno_voice_list.add(R.raw.b36)
        banjon_borno_voice_list.add(R.raw.b37)
        banjon_borno_voice_list.add(R.raw.b38)
        banjon_borno_voice_list.add(R.raw.b39)

        banjon_borno_image_details_list.add(R.drawable.b01)
        banjon_borno_image_details_list.add(R.drawable.b02)
        banjon_borno_image_details_list.add(R.drawable.b03)
        banjon_borno_image_details_list.add(R.drawable.b04)
        banjon_borno_image_details_list.add(R.drawable.b05)
        banjon_borno_image_details_list.add(R.drawable.b06)
        banjon_borno_image_details_list.add(R.drawable.b07)
        banjon_borno_image_details_list.add(R.drawable.b08)
        banjon_borno_image_details_list.add(R.drawable.b09)
        banjon_borno_image_details_list.add(R.drawable.b10)
        banjon_borno_image_details_list.add(R.drawable.b11)
        banjon_borno_image_details_list.add(R.drawable.b12)
        banjon_borno_image_details_list.add(R.drawable.b13)
        banjon_borno_image_details_list.add(R.drawable.b14)
        banjon_borno_image_details_list.add(R.drawable.b15)
        banjon_borno_image_details_list.add(R.drawable.b16)
        banjon_borno_image_details_list.add(R.drawable.b17)
        banjon_borno_image_details_list.add(R.drawable.b18)
        banjon_borno_image_details_list.add(R.drawable.b19)
        banjon_borno_image_details_list.add(R.drawable.b20)
        banjon_borno_image_details_list.add(R.drawable.b21)
        banjon_borno_image_details_list.add(R.drawable.b22)
        banjon_borno_image_details_list.add(R.drawable.b23)
        banjon_borno_image_details_list.add(R.drawable.b24)
        banjon_borno_image_details_list.add(R.drawable.b25)
        banjon_borno_image_details_list.add(R.drawable.b26)
        banjon_borno_image_details_list.add(R.drawable.b27)
        banjon_borno_image_details_list.add(R.drawable.b28)
        banjon_borno_image_details_list.add(R.drawable.b29)
        banjon_borno_image_details_list.add(R.drawable.b30)
        banjon_borno_image_details_list.add(R.drawable.b31)
        banjon_borno_image_details_list.add(R.drawable.b32)
        banjon_borno_image_details_list.add(R.drawable.b33)
        banjon_borno_image_details_list.add(R.drawable.b34)
        banjon_borno_image_details_list.add(R.drawable.b35)
        banjon_borno_image_details_list.add(R.drawable.b36)
        banjon_borno_image_details_list.add(R.drawable.b37)
        banjon_borno_image_details_list.add(R.drawable.b38)
        banjon_borno_image_details_list.add(R.drawable.b39)


        //set layout manager
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        banjon_borno_okkhor_recycler_ID.layoutManager = linearLayoutManager
        //set layout manager END

//set adapter Start
        var banjonBorno_Adapter = BanjonBorno_Adapter(banjon_borno_List)
        banjon_borno_okkhor_recycler_ID.adapter = banjonBorno_Adapter
//set adapter END
        imageView_details_banjon_borno.setImageResource(banjon_borno_List[0])


//set onclick listener on recycler View
        banjon_borno_okkhor_recycler_ID.addOnItemTouchListener(
            RecyclerItemClickListenr(
                this,
                banjon_borno_okkhor_recycler_ID,
                object : RecyclerItemClickListenr.OnItemClickListener {
                    override fun onItemClick(view: View, position: Int) {


                        if (position != 39) {

                            imageView_details_banjon_borno.setImageResource(banjon_borno_image_details_list[position])
                            mPlayer2.stop()
                            mPlayer2 = MediaPlayer.create(
                                this@BanjonBorno_Activity,
                                banjon_borno_voice_list[position]
                            )
                            mPlayer2.start()
                        } else {
                            mPlayer2.stop()
                            imageView_details_banjon_borno.setImageResource(banjon_borno_List[position])
                        }
                    }

                    override fun onItemLongClick(view: View?, position: Int) {
                        if (position != 39) {
                            imageView_details_banjon_borno.setImageResource(banjon_borno_image_details_list[position])

                            mPlayer2.stop()

                            mPlayer2 = MediaPlayer.create(
                                this@BanjonBorno_Activity,
                                banjon_borno_voice_list[position]
                            )
                            mPlayer2.start()
                        } else {
                            mPlayer2.stop()
                            imageView_details_banjon_borno.setImageResource(banjon_borno_List[position])
                        }

                    }

                })
        )
        //set onclick listener on recycler View  END


    }
}
