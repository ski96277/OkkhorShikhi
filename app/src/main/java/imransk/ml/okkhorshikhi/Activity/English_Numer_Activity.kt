package imransk.ml.okkhorshikhi.Activity

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import imransk.ml.okkhorshikhi.AdapterClass.English_Numer_Adapter
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import kotlinx.android.synthetic.main.activity_english__numer.*
import java.util.*
import kotlin.collections.ArrayList

class English_Numer_Activity : AppCompatActivity() {

    var number_english_speeling = ArrayList<String>()
    lateinit var textToSpeak: TextToSpeech

    var number_sound=ArrayList<Int>()
    var mediaPlayer=MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english__numer)

        number_english_speeling.add("Zero")
        number_english_speeling.add("One")
        number_english_speeling.add("Two")
        number_english_speeling.add("Three")
        number_english_speeling.add("Four")
        number_english_speeling.add("Five")
        number_english_speeling.add("Six")
        number_english_speeling.add("Seven")
        number_english_speeling.add("Eight")
        number_english_speeling.add("Nine")
        number_english_speeling.add("Ten")


        number_english_speeling.add("Eleven")
        number_english_speeling.add("Twelve")
        number_english_speeling.add("Thirteen")
        number_english_speeling.add("Fourteen")
        number_english_speeling.add("Fifteen")
        number_english_speeling.add("Sixteen")
        number_english_speeling.add("Seventeen")
        number_english_speeling.add("Eighteen")
        number_english_speeling.add("Nineteen")
        number_english_speeling.add("Twenty")

        number_english_speeling.add("Twenty-one")
        number_english_speeling.add("Twenty-two")
        number_english_speeling.add("Twenty-three")
        number_english_speeling.add("Twenty-four")
        number_english_speeling.add("Twenty-five")
        number_english_speeling.add("Twenty-six")
        number_english_speeling.add("Twenty-seven")
        number_english_speeling.add("Twenty-eight")
        number_english_speeling.add("Twenty-nine")
        number_english_speeling.add("Thirty")

        number_english_speeling.add("Thirty-one")
        number_english_speeling.add("Thirty-two")
        number_english_speeling.add("Thirty-three")
        number_english_speeling.add("Thirty-four")
        number_english_speeling.add("Thirty-five")
        number_english_speeling.add("Thirty-six")
        number_english_speeling.add("Thirty-seven")
        number_english_speeling.add("Thirty-eight")
        number_english_speeling.add("Thirty-nine")
        number_english_speeling.add("Forty")

        number_english_speeling.add("Forty-one")
        number_english_speeling.add("Forty-two")
        number_english_speeling.add("Forty-three")
        number_english_speeling.add("Forty-four")
        number_english_speeling.add("Forty-five")
        number_english_speeling.add("Forty-six")
        number_english_speeling.add("Forty-seven")
        number_english_speeling.add("Forty-eight")
        number_english_speeling.add("Forty-nine")
        number_english_speeling.add("Fifty")

        number_english_speeling.add("Fifty-one")
        number_english_speeling.add("Fifty-two")
        number_english_speeling.add("Fifty-three")
        number_english_speeling.add("Fifty-four")
        number_english_speeling.add("Fifty-five")
        number_english_speeling.add("Fifty-six")
        number_english_speeling.add("Fifty-seven")
        number_english_speeling.add("Fifty-eight")
        number_english_speeling.add("Fifty-nine")
        number_english_speeling.add("Sixty")

        number_english_speeling.add("Sixty-one")
        number_english_speeling.add("Sixty-two")
        number_english_speeling.add("Sixty-three")
        number_english_speeling.add("Sixty-four")
        number_english_speeling.add("Sixty-five")
        number_english_speeling.add("Sixty-six")
        number_english_speeling.add("Sixty-seven")
        number_english_speeling.add("Sixty-eight")
        number_english_speeling.add("Sixty-nine")
        number_english_speeling.add("Seventy")

        number_english_speeling.add("Seventy-one")
        number_english_speeling.add("Seventy-two")
        number_english_speeling.add("Seventy-three")
        number_english_speeling.add("Seventy-four")
        number_english_speeling.add("Seventy-five")
        number_english_speeling.add("Seventy-six")
        number_english_speeling.add("Seventy-seven")
        number_english_speeling.add("Seventy-eight")
        number_english_speeling.add("Seventy-nine")
        number_english_speeling.add("Eighty")

        number_english_speeling.add("Eighty-one")
        number_english_speeling.add("Eighty-two")
        number_english_speeling.add("Eighty-three")
        number_english_speeling.add("Eighty-four")
        number_english_speeling.add("Eighty-five")
        number_english_speeling.add("Eighty-six")
        number_english_speeling.add("Eighty-seven")
        number_english_speeling.add("Eighty-eight")
        number_english_speeling.add("Eighty-nine")
        number_english_speeling.add("Ninety")

        number_english_speeling.add("Ninety-one")
        number_english_speeling.add("Ninety-two")
        number_english_speeling.add("Ninety-three")
        number_english_speeling.add("Ninety-four")
        number_english_speeling.add("Ninety-five")
        number_english_speeling.add("Ninety-six")
        number_english_speeling.add("Ninety-seven")
        number_english_speeling.add("Ninety-eight")
        number_english_speeling.add("Ninety-Nine")
        number_english_speeling.add("Hundred")

        number_sound.add(R.raw.english_0)
        number_sound.add(R.raw.english_1)
        number_sound.add(R.raw.english_2)
        number_sound.add(R.raw.english_3)
        number_sound.add(R.raw.english_4)
        number_sound.add(R.raw.english_5)
        number_sound.add(R.raw.english_6)
        number_sound.add(R.raw.english_7)
        number_sound.add(R.raw.english_8)
        number_sound.add(R.raw.english_9)
        number_sound.add(R.raw.english_10)
        number_sound.add(R.raw.english_11)
        number_sound.add(R.raw.english_12)
        number_sound.add(R.raw.english_13)
        number_sound.add(R.raw.english_14)
        number_sound.add(R.raw.english_15)
        number_sound.add(R.raw.english_16)
        number_sound.add(R.raw.english_17)
        number_sound.add(R.raw.english_18)
        number_sound.add(R.raw.english_19)
        number_sound.add(R.raw.english_20)
        number_sound.add(R.raw.english_21)
        number_sound.add(R.raw.english_22)
        number_sound.add(R.raw.english_23)
        number_sound.add(R.raw.english_24)
        number_sound.add(R.raw.english_25)
        number_sound.add(R.raw.english_26)
        number_sound.add(R.raw.english_27)
        number_sound.add(R.raw.english_28)
        number_sound.add(R.raw.english_29)
        number_sound.add(R.raw.english_30)
        number_sound.add(R.raw.english_31)
        number_sound.add(R.raw.english_32)
        number_sound.add(R.raw.english_33)
        number_sound.add(R.raw.english_34)
        number_sound.add(R.raw.english_35)
        number_sound.add(R.raw.english_36)
        number_sound.add(R.raw.english_37)
        number_sound.add(R.raw.english_38)
        number_sound.add(R.raw.english_39)
        number_sound.add(R.raw.english_40)
        number_sound.add(R.raw.english_41)
        number_sound.add(R.raw.english_42)
        number_sound.add(R.raw.english_43)
        number_sound.add(R.raw.english_44)
        number_sound.add(R.raw.english_45)
        number_sound.add(R.raw.english_46)
        number_sound.add(R.raw.english_47)
        number_sound.add(R.raw.english_48)
        number_sound.add(R.raw.english_49)
        number_sound.add(R.raw.english_50)
        number_sound.add(R.raw.english_51)
        number_sound.add(R.raw.english_52)
        number_sound.add(R.raw.english_53)
        number_sound.add(R.raw.english_54)
        number_sound.add(R.raw.english_55)
        number_sound.add(R.raw.english_56)
        number_sound.add(R.raw.english_57)
        number_sound.add(R.raw.english_58)
        number_sound.add(R.raw.english_59)
        number_sound.add(R.raw.english_60)
        number_sound.add(R.raw.english_61)
        number_sound.add(R.raw.english_62)
        number_sound.add(R.raw.english_63)
        number_sound.add(R.raw.english_64)
        number_sound.add(R.raw.english_65)
        number_sound.add(R.raw.english_66)
        number_sound.add(R.raw.english_67)
        number_sound.add(R.raw.english_68)
        number_sound.add(R.raw.english_69)
        number_sound.add(R.raw.english_70)
        number_sound.add(R.raw.english_71)
        number_sound.add(R.raw.english_72)
        number_sound.add(R.raw.english_73)
        number_sound.add(R.raw.english_74)
        number_sound.add(R.raw.english_75)
        number_sound.add(R.raw.english_76)
        number_sound.add(R.raw.english_77)
        number_sound.add(R.raw.english_78)
        number_sound.add(R.raw.english_79)
        number_sound.add(R.raw.english_80)
        number_sound.add(R.raw.english_81)
        number_sound.add(R.raw.english_82)
        number_sound.add(R.raw.english_83)
        number_sound.add(R.raw.english_84)
        number_sound.add(R.raw.english_85)
        number_sound.add(R.raw.english_86)
        number_sound.add(R.raw.english_87)
        number_sound.add(R.raw.english_88)
        number_sound.add(R.raw.english_89)
        number_sound.add(R.raw.english_90)
        number_sound.add(R.raw.english_91)
        number_sound.add(R.raw.english_92)
        number_sound.add(R.raw.english_93)
        number_sound.add(R.raw.english_94)
        number_sound.add(R.raw.english_95)
        number_sound.add(R.raw.english_96)
        number_sound.add(R.raw.english_97)
        number_sound.add(R.raw.english_98)
        number_sound.add(R.raw.english_99)
        number_sound.add(R.raw.english_100)

        var layoutManager = GridLayoutManager(this, 2)
        english_number_recyclerView_ID.layoutManager = layoutManager

        var english_Numer_Adapter = English_Numer_Adapter(number_english_speeling)
        english_number_recyclerView_ID.adapter = english_Numer_Adapter


        //set default speak Start
        mediaPlayer.stop()
        mediaPlayer= MediaPlayer.create(this@English_Numer_Activity,number_sound[0])
        mediaPlayer.start()

        //set default speak END


        english_number_recyclerView_ID.addOnItemTouchListener(
            RecyclerItemClickListenr(
                this,
                english_number_recyclerView_ID,
                object : RecyclerItemClickListenr.OnItemClickListener {
                    override fun onItemClick(view: View, position: Int) {


                        mediaPlayer.stop()
                        mediaPlayer= MediaPlayer.create(this@English_Numer_Activity,number_sound[position])
                        mediaPlayer.start()

                        //animation of item click
                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view.findViewById(R.id.linearLayout_English_number_Item))


                    }
                    override fun onItemLongClick(view: View?, position: Int) {
                        mediaPlayer.stop()
                        mediaPlayer= MediaPlayer.create(this@English_Numer_Activity,number_sound[position])
                        mediaPlayer.start()

                        //animation of item click

                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view!!.findViewById(R.id.linearLayout_English_number_Item))



                    }

                })
        )

    }


    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
        mediaPlayer.release()
    }

}
