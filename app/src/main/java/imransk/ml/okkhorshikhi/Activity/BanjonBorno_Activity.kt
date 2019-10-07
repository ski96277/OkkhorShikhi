package imransk.ml.okkhorshikhi.Activity

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import imransk.ml.okkhorshikhi.AdapterClass.BanjonBorno_Adapter
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import kotlinx.android.synthetic.main.activity_banjon_borno.*
import kotlinx.android.synthetic.main.activity_shorborno.*
import kotlinx.android.synthetic.main.app_bar.*
import kotlin.collections.ArrayList

class BanjonBorno_Activity : AppCompatActivity() {

//    var banjon_borno_List = ArrayList<Int>()
    var banjon_borno_List = ArrayList<String>()
    var banjon_borno_voice_list = ArrayList<Int>()
    var banjon_borno_image_details_list = ArrayList<Int>()
    var banjonborno_example_text=ArrayList<String>()

    var mPlayer2: MediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banjon_borno)


        setSupportActionBar(toolbar_id)
        supportActionBar!!.title = "ব্যঞ্জনবর্ণ"

        banjon_borno_List.add("ক")
        banjon_borno_List.add("খ")
        banjon_borno_List.add("গ")
        banjon_borno_List.add("ঘ")
        banjon_borno_List.add("ঙ")
        banjon_borno_List.add("চ")
        banjon_borno_List.add("ছ")
        banjon_borno_List.add("জ")
        banjon_borno_List.add("ঝ")
        banjon_borno_List.add("ঞ")
        banjon_borno_List.add("ট")
        banjon_borno_List.add("ঠ")
        banjon_borno_List.add("ড")
        banjon_borno_List.add("ঢ")
        banjon_borno_List.add("ণ")
        banjon_borno_List.add("ত")
        banjon_borno_List.add("থ")
        banjon_borno_List.add("দ")
        banjon_borno_List.add("ধ")
        banjon_borno_List.add("ন")
        banjon_borno_List.add("প")
        banjon_borno_List.add("ফ")
        banjon_borno_List.add("ব")
        banjon_borno_List.add("ভ")
        banjon_borno_List.add("ম")
        banjon_borno_List.add("য")
        banjon_borno_List.add("র")
        banjon_borno_List.add("ল")
        banjon_borno_List.add("শ")
        banjon_borno_List.add("ষ")
        banjon_borno_List.add("স")
        banjon_borno_List.add("হ")
        banjon_borno_List.add("ড়")
        banjon_borno_List.add("ঢ়")
        banjon_borno_List.add("য়")
        banjon_borno_List.add("ৎ")
        banjon_borno_List.add("ং")
        banjon_borno_List.add("ঃ")
        banjon_borno_List.add("ঁ")
        banjon_borno_List.add("ক্ষ")


        banjonborno_example_text.add("কাকাতুয়া")
        banjonborno_example_text.add("খেঁকশিয়াল")
        banjonborno_example_text.add("গরু")
        banjonborno_example_text.add("ঘড়ি")
        banjonborno_example_text.add("রঙ")
        banjonborno_example_text.add("চশমা")
        banjonborno_example_text.add("ছাতা")
        banjonborno_example_text.add("জাহাজ")
        banjonborno_example_text.add("ঝিনুক")
        banjonborno_example_text.add("মিঞাও")
        banjonborno_example_text.add("টিয়া")
        banjonborno_example_text.add("ঠেলাগাড়ি")
        banjonborno_example_text.add("ডিম")
        banjonborno_example_text.add("ঢোল")
        banjonborno_example_text.add("হরিণ")
        banjonborno_example_text.add("তরমুজ")
        banjonborno_example_text.add("থালা")
        banjonborno_example_text.add("দোয়েল")
        banjonborno_example_text.add("ধান")
        banjonborno_example_text.add("নদী")
        banjonborno_example_text.add("পাখি")
        banjonborno_example_text.add("ফুল")
        banjonborno_example_text.add("বই")
        banjonborno_example_text.add("ভাল্লুক")
        banjonborno_example_text.add("ময়ূর")
        banjonborno_example_text.add("যব")
        banjonborno_example_text.add("রাজহাঁস")
        banjonborno_example_text.add("লেবু")
        banjonborno_example_text.add("শাপলা")
        banjonborno_example_text.add("ষাঁড়")
        banjonborno_example_text.add("সিংহ")
        banjonborno_example_text.add("হাতি")
        banjonborno_example_text.add("গাড়ি")
        banjonborno_example_text.add("আষাঢ়")
        banjonborno_example_text.add("পায়রা")
        banjonborno_example_text.add("মৎস্য")
        banjonborno_example_text.add("চিংড়ি")
        banjonborno_example_text.add("দুঃখ")
        banjonborno_example_text.add("চাঁদ")
        banjonborno_example_text.add("ক্ষমা")

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
        banjon_borno_voice_list.add(R.raw.b40)

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
        banjon_borno_image_details_list.add(R.drawable.b40)



        //set layout manager
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        banjon_borno_okkhor_recycler_ID.layoutManager = linearLayoutManager
        //set layout manager END

//set adapter Start
        var banjonBorno_Adapter = BanjonBorno_Adapter(banjon_borno_List)
        banjon_borno_okkhor_recycler_ID.adapter = banjonBorno_Adapter
//set adapter END
        imageView_details_banjon_borno.setImageResource(banjon_borno_image_details_list[0])
        bangonorno_example_details_TV_ID.text=banjonborno_example_text[0]
        banjonorno_text_show_TV_ID.text=banjon_borno_List[0]
//set first open start sound
        mPlayer2.stop()
        mPlayer2.release()
        mPlayer2 = MediaPlayer.create(
            this@BanjonBorno_Activity,
            banjon_borno_voice_list[0]
        )
        mPlayer2.start()

//set first animation

        YoYo.with(Techniques.ZoomInUp)
            .duration(1000)
            .repeat(0)
            .playOn(banjonorno_text_show_TV_ID)


        YoYo.with(Techniques.DropOut)
            .duration(700)
            .repeat(0)
            .playOn(imageView_details_banjon_borno)


        YoYo.with(Techniques.RollIn)
            .duration(1000)
            .repeat(0)
            .playOn(bangonorno_example_details_TV_ID)




//set onclick listener on recycler View
        banjon_borno_okkhor_recycler_ID.addOnItemTouchListener(
            RecyclerItemClickListenr(
                this,
                banjon_borno_okkhor_recycler_ID,
                object : RecyclerItemClickListenr.OnItemClickListener {
                    override fun onItemClick(view: View, position: Int) {

                        //animation of item click
                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view.findViewById(R.id.item_text_banjon_borno))


                            banjonorno_text_show_TV_ID.text=banjon_borno_List[position]
                            imageView_details_banjon_borno.setImageResource(banjon_borno_image_details_list[position])
                            bangonorno_example_details_TV_ID.text=banjonborno_example_text[position]

                            mPlayer2.stop()
                            mPlayer2.release()
                            mPlayer2 = MediaPlayer.create(
                                this@BanjonBorno_Activity,
                                banjon_borno_voice_list[position]
                            )
                            mPlayer2.start()



                        if (position%2==0){

                            YoYo.with(Techniques.ZoomInUp)
                                .duration(1000)
                                .repeat(0)
                                .playOn(banjonorno_text_show_TV_ID)


                            YoYo.with(Techniques.DropOut)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_banjon_borno)


                            YoYo.with(Techniques.RollIn)
                                .duration(1000)
                                .repeat(0)
                                .playOn(bangonorno_example_details_TV_ID)

                        }else{


                            YoYo.with(Techniques.BounceInLeft)
                                .duration(1000)
                                .repeat(0)
                                .playOn(banjonorno_text_show_TV_ID)


                            YoYo.with(Techniques.ZoomInUp)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_banjon_borno)


                            YoYo.with(Techniques.BounceInRight)
                                .duration(1000)
                                .repeat(0)
                                .playOn(bangonorno_example_details_TV_ID)
                        }

                    }

                    override fun onItemLongClick(view: View?, position: Int) {



                        if (position%2==0){

                            YoYo.with(Techniques.ZoomInUp)
                                .duration(1000)
                                .repeat(0)
                                .playOn(banjonorno_text_show_TV_ID)


                            YoYo.with(Techniques.DropOut)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_banjon_borno)


                            YoYo.with(Techniques.RollIn)
                                .duration(1000)
                                .repeat(0)
                                .playOn(bangonorno_example_details_TV_ID)

                        }else{


                            YoYo.with(Techniques.BounceInLeft)
                                .duration(1000)
                                .repeat(0)
                                .playOn(banjonorno_text_show_TV_ID)


                            YoYo.with(Techniques.ZoomInUp)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_banjon_borno)


                            YoYo.with(Techniques.BounceInRight)
                                .duration(1000)
                                .repeat(0)
                                .playOn(bangonorno_example_details_TV_ID)
                        }


                            //animation of item click
                            YoYo.with(Techniques.BounceInLeft)
                                .duration(500)
                                .repeat(0)
                                .playOn(view!!.findViewById(R.id.item_text_banjon_borno))

                            banjonorno_text_show_TV_ID.text=banjon_borno_List[position]

                            imageView_details_banjon_borno.setImageResource(banjon_borno_image_details_list[position])
                            bangonorno_example_details_TV_ID.text=banjonborno_example_text[position]

                            mPlayer2.stop()
                            mPlayer2.release()
                            mPlayer2 = MediaPlayer.create(
                                this@BanjonBorno_Activity,
                                banjon_borno_voice_list[position]
                            )
                            mPlayer2.start()

                    }

                })
        )
        //set onclick listener on recycler View  END


    }


    override fun onDestroy() {
        super.onDestroy()
        mPlayer2.stop()
        mPlayer2.release()
    }
/*
    //hide bottom and notification bar START
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){ hideSystemUI()}
    }
    private fun hideSystemUI() {

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }
//hide bottom and notification bar END

    */
}
