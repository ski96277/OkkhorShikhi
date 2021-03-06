package imransk.ml.okkhorshikhi.Activity

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import imransk.ml.okkhorshikhi.AdapterClass.Bangla_Number_Adapter
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import kotlinx.android.synthetic.main.activity_bangla__number.*
import kotlinx.android.synthetic.main.app_bar.*

class Bangla_Number_Activity : AppCompatActivity() {
    var bangla_Number_list = ArrayList<String>()
    var bangla_Number_kothay_list = ArrayList<String>()
    var bangla_Number_Sound = ArrayList<Int>()

    var mediaPlayer=MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bangla__number)


        setSupportActionBar(toolbar_id)
        supportActionBar!!.title = "সংখ্যা গণনা"

        bangla_Number_list.add("০")
        bangla_Number_list.add("১")
        bangla_Number_list.add("২")
        bangla_Number_list.add("৩")
        bangla_Number_list.add("৪")
        bangla_Number_list.add("৫")
        bangla_Number_list.add("৬")
        bangla_Number_list.add("৭")
        bangla_Number_list.add("৮")
        bangla_Number_list.add("৯")
        bangla_Number_list.add("১০")


        bangla_Number_list.add("১১")
        bangla_Number_list.add("১২")
        bangla_Number_list.add("১৩")
        bangla_Number_list.add("১৪")
        bangla_Number_list.add("১৫")
        bangla_Number_list.add("১৬")
        bangla_Number_list.add("১৭")
        bangla_Number_list.add("১৮")
        bangla_Number_list.add("১৯")
        bangla_Number_list.add("২০")

        bangla_Number_list.add("২১")
        bangla_Number_list.add("২২")
        bangla_Number_list.add("২৩")
        bangla_Number_list.add("২৪")
        bangla_Number_list.add("২৫")
        bangla_Number_list.add("২৬")
        bangla_Number_list.add("২৭")
        bangla_Number_list.add("২৮")
        bangla_Number_list.add("২৯")
        bangla_Number_list.add("৩০")

        bangla_Number_list.add("৩১")
        bangla_Number_list.add("৩২")
        bangla_Number_list.add("৩৩")
        bangla_Number_list.add("৩৪")
        bangla_Number_list.add("৩৫")
        bangla_Number_list.add("৩৬")
        bangla_Number_list.add("৩৭")
        bangla_Number_list.add("৩৮")
        bangla_Number_list.add("৩৯")
        bangla_Number_list.add("৪০")

        bangla_Number_list.add("৪১")
        bangla_Number_list.add("৪২")
        bangla_Number_list.add("৪৩")
        bangla_Number_list.add("৪৪")
        bangla_Number_list.add("৪৫")
        bangla_Number_list.add("৪৬")
        bangla_Number_list.add("৪৭")
        bangla_Number_list.add("৪৮")
        bangla_Number_list.add("৪৯")
        bangla_Number_list.add("৫০")

        bangla_Number_list.add("৫১")
        bangla_Number_list.add("৫২")
        bangla_Number_list.add("৫৩")
        bangla_Number_list.add("৫৪")
        bangla_Number_list.add("৫৫")
        bangla_Number_list.add("৫৬")
        bangla_Number_list.add("৫৭")
        bangla_Number_list.add("৫৮")
        bangla_Number_list.add("৫৯")
        bangla_Number_list.add("৬০")

        bangla_Number_list.add("৬১")
        bangla_Number_list.add("৬২")
        bangla_Number_list.add("৬৩")
        bangla_Number_list.add("৬৪")
        bangla_Number_list.add("৬৫")
        bangla_Number_list.add("৬৬")
        bangla_Number_list.add("৬৭")
        bangla_Number_list.add("৬৮")
        bangla_Number_list.add("৬৯")
        bangla_Number_list.add("৭০")

        bangla_Number_list.add("৭১")
        bangla_Number_list.add("৭২")
        bangla_Number_list.add("৭৩")
        bangla_Number_list.add("৭৪")
        bangla_Number_list.add("৭৫")
        bangla_Number_list.add("৭৬")
        bangla_Number_list.add("৭৭")
        bangla_Number_list.add("৭৮")
        bangla_Number_list.add("৭৯")
        bangla_Number_list.add("৮০")

        bangla_Number_list.add("৮১")
        bangla_Number_list.add("৮২")
        bangla_Number_list.add("৮৩")
        bangla_Number_list.add("৮৪")
        bangla_Number_list.add("৮৫")
        bangla_Number_list.add("৮৬")
        bangla_Number_list.add("৮৭")
        bangla_Number_list.add("৮৮")
        bangla_Number_list.add("৮৯")
        bangla_Number_list.add("৯০")

        bangla_Number_list.add("৯১")
        bangla_Number_list.add("৯২")
        bangla_Number_list.add("৯৩")
        bangla_Number_list.add("৯৪")
        bangla_Number_list.add("৯৫")
        bangla_Number_list.add("৯৬")
        bangla_Number_list.add("৯৭")
        bangla_Number_list.add("৯৮")
        bangla_Number_list.add("৯৯")
        bangla_Number_list.add("১০০")

        bangla_Number_kothay_list.add("শূন্য")
        bangla_Number_kothay_list.add("এক")
        bangla_Number_kothay_list.add("দুই")
        bangla_Number_kothay_list.add("তিন")
        bangla_Number_kothay_list.add("চার")
        bangla_Number_kothay_list.add("পাঁচ")
        bangla_Number_kothay_list.add("ছয়")
        bangla_Number_kothay_list.add("সাত")
        bangla_Number_kothay_list.add("আট")
        bangla_Number_kothay_list.add("নয়")
        bangla_Number_kothay_list.add("দশ")

        bangla_Number_kothay_list.add("এগার")
        bangla_Number_kothay_list.add("বার")
        bangla_Number_kothay_list.add("তের")
        bangla_Number_kothay_list.add("চৌদ্দ")
        bangla_Number_kothay_list.add("পনের")
        bangla_Number_kothay_list.add("ষোল")
        bangla_Number_kothay_list.add("সতের")
        bangla_Number_kothay_list.add("আঠার")
        bangla_Number_kothay_list.add("ঊনিশ")
        bangla_Number_kothay_list.add("বিশ")

        bangla_Number_kothay_list.add("একুশ")
        bangla_Number_kothay_list.add("বাইশ")
        bangla_Number_kothay_list.add("তেইশ")
        bangla_Number_kothay_list.add("চব্বিশ")
        bangla_Number_kothay_list.add("পঁচিশ")
        bangla_Number_kothay_list.add("ছাব্বিশ")
        bangla_Number_kothay_list.add("সাতাশ")
        bangla_Number_kothay_list.add("আঠাশ")
        bangla_Number_kothay_list.add("ঊনত্রিশ")
        bangla_Number_kothay_list.add("ত্রিশ")

        bangla_Number_kothay_list.add("একত্রিশ")
        bangla_Number_kothay_list.add("বত্রিশ")
        bangla_Number_kothay_list.add("তেত্রিশ")
        bangla_Number_kothay_list.add("চৌত্রিশ")
        bangla_Number_kothay_list.add("পঁয়ত্রিশ")
        bangla_Number_kothay_list.add("ছত্রিশ")
        bangla_Number_kothay_list.add("সাঁইত্রিশ")
        bangla_Number_kothay_list.add("আটত্রিশ")
        bangla_Number_kothay_list.add("ঊনচল্লিশ")
        bangla_Number_kothay_list.add("চল্লিশ")

        bangla_Number_kothay_list.add("একচল্লিশ")
        bangla_Number_kothay_list.add("বিয়াল্লিশ")
        bangla_Number_kothay_list.add("তেতাল্লিশ")
        bangla_Number_kothay_list.add("চুয়াল্লিশ")
        bangla_Number_kothay_list.add("পঁয়তাল্লিশ")
        bangla_Number_kothay_list.add("ছেচল্লিশ")
        bangla_Number_kothay_list.add("সাতচল্লিশ")
        bangla_Number_kothay_list.add("আটচল্লিশ")
        bangla_Number_kothay_list.add("ঊনপঞ্চাশ")
        bangla_Number_kothay_list.add("পঞ্চাশ")

        bangla_Number_kothay_list.add("একান্ন")
        bangla_Number_kothay_list.add("বায়ান্ন")
        bangla_Number_kothay_list.add("তিপ্পান্ন")
        bangla_Number_kothay_list.add("চুয়ান্ন")
        bangla_Number_kothay_list.add("পঞ্চান্ন")
        bangla_Number_kothay_list.add("ছাপ্পান্ন")
        bangla_Number_kothay_list.add("সাতান্ন")
        bangla_Number_kothay_list.add("আটান্ন")
        bangla_Number_kothay_list.add("ঊনষাট")
        bangla_Number_kothay_list.add("ষাট")

        bangla_Number_kothay_list.add("একষট্টি")
        bangla_Number_kothay_list.add("বাষট্টি")
        bangla_Number_kothay_list.add("তেষট্টি")
        bangla_Number_kothay_list.add("চৌষট্টি")
        bangla_Number_kothay_list.add("পঁয়ষট্টি")
        bangla_Number_kothay_list.add("ছেষট্টি")
        bangla_Number_kothay_list.add("সাতষট্টি")
        bangla_Number_kothay_list.add("আটষট্টি")
        bangla_Number_kothay_list.add("ঊনসত্তর")
        bangla_Number_kothay_list.add("সত্তর")

        bangla_Number_kothay_list.add("একাত্তর")
        bangla_Number_kothay_list.add("বাহাত্তর")
        bangla_Number_kothay_list.add("তিয়াত্তর")
        bangla_Number_kothay_list.add("চুয়াত্তর")
        bangla_Number_kothay_list.add("পঁচাত্তর")
        bangla_Number_kothay_list.add("ছিয়াত্তর")
        bangla_Number_kothay_list.add("সাতাত্তর")
        bangla_Number_kothay_list.add("আটাত্তর")
        bangla_Number_kothay_list.add("ঊনআশি")
        bangla_Number_kothay_list.add("আশি")

        bangla_Number_kothay_list.add("একাশি")
        bangla_Number_kothay_list.add("বিরাশি")
        bangla_Number_kothay_list.add("তিরাশি")
        bangla_Number_kothay_list.add("চুরাশি")
        bangla_Number_kothay_list.add("পঁচাশি")
        bangla_Number_kothay_list.add("ছিয়াশি")
        bangla_Number_kothay_list.add("সাতাশি")
        bangla_Number_kothay_list.add("আটাশি")
        bangla_Number_kothay_list.add("ঊননব্বই")
        bangla_Number_kothay_list.add("নব্বই")

        bangla_Number_kothay_list.add("একানব্বই")
        bangla_Number_kothay_list.add("বিরানব্বই")
        bangla_Number_kothay_list.add("তিরানব্বই")
        bangla_Number_kothay_list.add("চুরানব্বই")
        bangla_Number_kothay_list.add("পঁচানব্বই")
        bangla_Number_kothay_list.add("ছিয়ানব্বই")
        bangla_Number_kothay_list.add("সাতানব্বই")
        bangla_Number_kothay_list.add("আটানব্বই")
        bangla_Number_kothay_list.add("নিরানব্বই")
        bangla_Number_kothay_list.add("এক শো")


        bangla_Number_Sound.add(R.raw.bangla_0)
        bangla_Number_Sound.add(R.raw.bangla_1)
        bangla_Number_Sound.add(R.raw.bangla_2)
        bangla_Number_Sound.add(R.raw.bangla_3)
        bangla_Number_Sound.add(R.raw.bangla_4)
        bangla_Number_Sound.add(R.raw.bangla_5)
        bangla_Number_Sound.add(R.raw.bangla_6)
        bangla_Number_Sound.add(R.raw.bangla_7)
        bangla_Number_Sound.add(R.raw.bangla_8)
        bangla_Number_Sound.add(R.raw.bangla_9)
        bangla_Number_Sound.add(R.raw.bangla_10)
        bangla_Number_Sound.add(R.raw.bangla_11)
        bangla_Number_Sound.add(R.raw.bangla_12)
        bangla_Number_Sound.add(R.raw.bangla_13)
        bangla_Number_Sound.add(R.raw.bangla_14)
        bangla_Number_Sound.add(R.raw.bangla_15)
        bangla_Number_Sound.add(R.raw.bangla_16)
        bangla_Number_Sound.add(R.raw.bangla_17)
        bangla_Number_Sound.add(R.raw.bangla_18)
        bangla_Number_Sound.add(R.raw.bangla_19)
        bangla_Number_Sound.add(R.raw.bangla_20)
        bangla_Number_Sound.add(R.raw.bangla_21)
        bangla_Number_Sound.add(R.raw.bangla_22)
        bangla_Number_Sound.add(R.raw.bangla_23)
        bangla_Number_Sound.add(R.raw.bangla_24)
        bangla_Number_Sound.add(R.raw.bangla_25)
        bangla_Number_Sound.add(R.raw.bangla_26)
        bangla_Number_Sound.add(R.raw.bangla_27)
        bangla_Number_Sound.add(R.raw.bangla_28)
        bangla_Number_Sound.add(R.raw.bangla_29)
        bangla_Number_Sound.add(R.raw.bangla_30)
        bangla_Number_Sound.add(R.raw.bangla_31)
        bangla_Number_Sound.add(R.raw.bangla_32)
        bangla_Number_Sound.add(R.raw.bangla_33)
        bangla_Number_Sound.add(R.raw.bangla_34)
        bangla_Number_Sound.add(R.raw.bangla_35)
        bangla_Number_Sound.add(R.raw.bangla_36)
        bangla_Number_Sound.add(R.raw.bangla_37)
        bangla_Number_Sound.add(R.raw.bangla_38)
        bangla_Number_Sound.add(R.raw.bangla_39)
        bangla_Number_Sound.add(R.raw.bangla_40)
        bangla_Number_Sound.add(R.raw.bangla_41)
        bangla_Number_Sound.add(R.raw.bangla_42)
        bangla_Number_Sound.add(R.raw.bangla_43)
        bangla_Number_Sound.add(R.raw.bangla_44)
        bangla_Number_Sound.add(R.raw.bangla_45)
        bangla_Number_Sound.add(R.raw.bangla_46)
        bangla_Number_Sound.add(R.raw.bangla_47)
        bangla_Number_Sound.add(R.raw.bangla_48)
        bangla_Number_Sound.add(R.raw.bangla_49)
        bangla_Number_Sound.add(R.raw.bangla_50)
        bangla_Number_Sound.add(R.raw.bangla_51)
        bangla_Number_Sound.add(R.raw.bangla_52)
        bangla_Number_Sound.add(R.raw.bangla_53)
        bangla_Number_Sound.add(R.raw.bangla_54)
        bangla_Number_Sound.add(R.raw.bangla_55)
        bangla_Number_Sound.add(R.raw.bangla_56)
        bangla_Number_Sound.add(R.raw.bangla_57)
        bangla_Number_Sound.add(R.raw.bangla_58)
        bangla_Number_Sound.add(R.raw.bangla_59)
        bangla_Number_Sound.add(R.raw.bangla_60)
        bangla_Number_Sound.add(R.raw.bangla_61)
        bangla_Number_Sound.add(R.raw.bangla_62)
        bangla_Number_Sound.add(R.raw.bangla_63)
        bangla_Number_Sound.add(R.raw.bangla_64)
        bangla_Number_Sound.add(R.raw.bangla_65)
        bangla_Number_Sound.add(R.raw.bangla_66)
        bangla_Number_Sound.add(R.raw.bangla_67)
        bangla_Number_Sound.add(R.raw.bangla_68)
        bangla_Number_Sound.add(R.raw.bangla_69)
        bangla_Number_Sound.add(R.raw.bangla_70)
        bangla_Number_Sound.add(R.raw.bangla_71)
        bangla_Number_Sound.add(R.raw.bangla_72)
        bangla_Number_Sound.add(R.raw.bangla_73)
        bangla_Number_Sound.add(R.raw.bangla_74)
        bangla_Number_Sound.add(R.raw.bangla_75)
        bangla_Number_Sound.add(R.raw.bangla_76)
        bangla_Number_Sound.add(R.raw.bangla_77)
        bangla_Number_Sound.add(R.raw.bangla_78)
        bangla_Number_Sound.add(R.raw.bangla_79)
        bangla_Number_Sound.add(R.raw.bangla_80)
        bangla_Number_Sound.add(R.raw.bangla_81)
        bangla_Number_Sound.add(R.raw.bangla_82)
        bangla_Number_Sound.add(R.raw.bangla_83)
        bangla_Number_Sound.add(R.raw.bangla_84)
        bangla_Number_Sound.add(R.raw.bangla_85)
        bangla_Number_Sound.add(R.raw.bangla_86)
        bangla_Number_Sound.add(R.raw.bangla_87)
        bangla_Number_Sound.add(R.raw.bangla_88)
        bangla_Number_Sound.add(R.raw.bangla_89)
        bangla_Number_Sound.add(R.raw.bangla_90)
        bangla_Number_Sound.add(R.raw.bangla_91)
        bangla_Number_Sound.add(R.raw.bangla_92)
        bangla_Number_Sound.add(R.raw.bangla_93)
        bangla_Number_Sound.add(R.raw.bangla_94)
        bangla_Number_Sound.add(R.raw.bangla_95)
        bangla_Number_Sound.add(R.raw.bangla_96)
        bangla_Number_Sound.add(R.raw.bangla_97)
        bangla_Number_Sound.add(R.raw.bangla_98)
        bangla_Number_Sound.add(R.raw.bangla_99)
        bangla_Number_Sound.add(R.raw.bangla_100)

        mediaPlayer.stop()
        mediaPlayer.release()
        mediaPlayer= MediaPlayer.create(this@Bangla_Number_Activity,bangla_Number_Sound[0])
        mediaPlayer.start()


        var gridLayoutManager = GridLayoutManager(this, 2)
        bangla_number_recyclerView_ID.layoutManager = gridLayoutManager

        var banglaNumberAdapter = Bangla_Number_Adapter(bangla_Number_list, bangla_Number_kothay_list)
        bangla_number_recyclerView_ID.adapter = banglaNumberAdapter

        bangla_number_recyclerView_ID.addOnItemTouchListener(
            RecyclerItemClickListenr(
                this,
                bangla_number_recyclerView_ID,
                object : RecyclerItemClickListenr.OnItemClickListener {
                    override fun onItemClick(view: View, position: Int) {


                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view.findViewById(R.id.linearLayout_Bangla_number_Item))


                        mediaPlayer.stop()
                        mediaPlayer.release()
                        mediaPlayer= MediaPlayer.create(this@Bangla_Number_Activity,bangla_Number_Sound[position])
                        mediaPlayer.start()

                    }

                    override fun onItemLongClick(view: View?, position: Int) {


                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view!!.findViewById(R.id.linearLayout_Bangla_number_Item))

                        mediaPlayer.stop()
                        mediaPlayer.release()
                        mediaPlayer= MediaPlayer.create(this@Bangla_Number_Activity,bangla_Number_Sound[position])
                        mediaPlayer.start()
                    }

                })
        )


    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
        mediaPlayer.release()
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
