package imransk.ml.okkhorshikhi.Activity

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import imransk.ml.okkhorshikhi.AdapterClass.CapitalLetters_Adapter
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import kotlinx.android.synthetic.main.activity_capital_letters.*
import kotlinx.android.synthetic.main.activity_small_letters.*
import kotlin.collections.ArrayList


class CapitalLetters_Activity : AppCompatActivity() {

    var capitalLetters_list = ArrayList<String>()
    var capitalLetters_Sound_list = ArrayList<Int>()
    var mediaPlayer = MediaPlayer()

    var capitalLetters_Images_list = ArrayList<Int>()
    var capitalletters_image_text_details=ArrayList<String>()

    lateinit var textToSpeak: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capital_letters)


        capitalLetters_list.add("A")
        capitalLetters_list.add("B")
        capitalLetters_list.add("C")
        capitalLetters_list.add("D")
        capitalLetters_list.add("E")
        capitalLetters_list.add("F")
        capitalLetters_list.add("G")
        capitalLetters_list.add("H")
        capitalLetters_list.add("I")
        capitalLetters_list.add("J")

        capitalLetters_list.add("K")
        capitalLetters_list.add("L")
        capitalLetters_list.add("M")
        capitalLetters_list.add("N")
        capitalLetters_list.add("O")
        capitalLetters_list.add("P")
        capitalLetters_list.add("Q")
        capitalLetters_list.add("R")
        capitalLetters_list.add("S")
        capitalLetters_list.add("T")

        capitalLetters_list.add("U")
        capitalLetters_list.add("V")
        capitalLetters_list.add("W")
        capitalLetters_list.add("X")
        capitalLetters_list.add("Y")
        capitalLetters_list.add("Z")

        capitalletters_image_text_details.add("Apple")
        capitalletters_image_text_details.add("Ball")
        capitalletters_image_text_details.add("Cat")
        capitalletters_image_text_details.add("Dog")
        capitalletters_image_text_details.add("Elephant")
        capitalletters_image_text_details.add("Fish")
        capitalletters_image_text_details.add("Goat")
        capitalletters_image_text_details.add("Hen")
        capitalletters_image_text_details.add("Ice Cream")
        capitalletters_image_text_details.add("Juicy")
        capitalletters_image_text_details.add("kangaroo")
        capitalletters_image_text_details.add("Lion")
        capitalletters_image_text_details.add("Mango")
        capitalletters_image_text_details.add("Nest")
        capitalletters_image_text_details.add("Orange")
        capitalletters_image_text_details.add("Parrot")
        capitalletters_image_text_details.add("Question")
        capitalletters_image_text_details.add("Rocket")
        capitalletters_image_text_details.add("Ship")
        capitalletters_image_text_details.add("Tree")
        capitalletters_image_text_details.add("Umbrella")
        capitalletters_image_text_details.add("Van")
        capitalletters_image_text_details.add("Watch")
        capitalletters_image_text_details.add("Box")
        capitalletters_image_text_details.add("yyy")
        capitalletters_image_text_details.add("Zebra")

        capitalLetters_Sound_list.add(R.raw.a)
        capitalLetters_Sound_list.add(R.raw.b)
        capitalLetters_Sound_list.add(R.raw.c)
        capitalLetters_Sound_list.add(R.raw.d)
        capitalLetters_Sound_list.add(R.raw.e)
        capitalLetters_Sound_list.add(R.raw.f)
        capitalLetters_Sound_list.add(R.raw.g)
        capitalLetters_Sound_list.add(R.raw.h)
        capitalLetters_Sound_list.add(R.raw.i)
        capitalLetters_Sound_list.add(R.raw.j)
        capitalLetters_Sound_list.add(R.raw.k)
        capitalLetters_Sound_list.add(R.raw.l)
        capitalLetters_Sound_list.add(R.raw.m)
        capitalLetters_Sound_list.add(R.raw.n)
        capitalLetters_Sound_list.add(R.raw.o)
        capitalLetters_Sound_list.add(R.raw.p)
        capitalLetters_Sound_list.add(R.raw.q)
        capitalLetters_Sound_list.add(R.raw.r)
        capitalLetters_Sound_list.add(R.raw.s)
        capitalLetters_Sound_list.add(R.raw.t)
        capitalLetters_Sound_list.add(R.raw.u)
        capitalLetters_Sound_list.add(R.raw.v)
        capitalLetters_Sound_list.add(R.raw.w)
        capitalLetters_Sound_list.add(R.raw.x)
        capitalLetters_Sound_list.add(R.raw.y)
        capitalLetters_Sound_list.add(R.raw.z)

        capitalLetters_Images_list.add(R.drawable.a_image)
        capitalLetters_Images_list.add(R.drawable.b_image)
        capitalLetters_Images_list.add(R.drawable.c_image)
        capitalLetters_Images_list.add(R.drawable.d_image)
        capitalLetters_Images_list.add(R.drawable.e_image)
        capitalLetters_Images_list.add(R.drawable.f_image)
        capitalLetters_Images_list.add(R.drawable.g_image)
        capitalLetters_Images_list.add(R.drawable.h_image)
        capitalLetters_Images_list.add(R.drawable.i_image)

        capitalLetters_Images_list.add(R.drawable.j_image)
        capitalLetters_Images_list.add(R.drawable.k_image)
        capitalLetters_Images_list.add(R.drawable.l_image)
        capitalLetters_Images_list.add(R.drawable.m_image)
        capitalLetters_Images_list.add(R.drawable.n_image)
        capitalLetters_Images_list.add(R.drawable.o_image)
        capitalLetters_Images_list.add(R.drawable.p_image)
        capitalLetters_Images_list.add(R.drawable.q_image)
        capitalLetters_Images_list.add(R.drawable.r_image)
        capitalLetters_Images_list.add(R.drawable.s_image)

        capitalLetters_Images_list.add(R.drawable.t_image)
        capitalLetters_Images_list.add(R.drawable.u_image)
        capitalLetters_Images_list.add(R.drawable.v_image)
        capitalLetters_Images_list.add(R.drawable.w_image)
        capitalLetters_Images_list.add(R.drawable.x_image)
        capitalLetters_Images_list.add(R.drawable.y_image)
        capitalLetters_Images_list.add(R.drawable.z_image)


        //set layout manager
        var linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        capital_letters_recycler_ID.layoutManager = linearLayoutManager
        //set layout manager

        //set Adapter
        var capitalLetters_Adapter = CapitalLetters_Adapter(capitalLetters_list)
        capital_letters_recycler_ID.adapter = capitalLetters_Adapter
        //set Adapter END

        capital_text_show_TV_ID.text = capitalLetters_list[0]
        imageView_details_capital_letters.setImageResource(capitalLetters_Images_list[0])
        capital_letter_image_nameTV_ID.text=capitalletters_image_text_details[0]
//set first time sound
        mediaPlayer.stop()
        mediaPlayer=MediaPlayer.create(this@CapitalLetters_Activity,capitalLetters_Sound_list[0])
        mediaPlayer.start()


       //set first time animation
            YoYo.with(Techniques.ZoomInUp)
                .duration(1000)
                .repeat(0)
                .playOn(capital_text_show_TV_ID)


            YoYo.with(Techniques.DropOut)
                .duration(700)
                .repeat(0)
                .playOn(imageView_details_capital_letters)


            YoYo.with(Techniques.RollIn)
                .duration(1000)
                .repeat(0)
                .playOn(capital_letter_image_nameTV_ID)



        capital_letters_recycler_ID.addOnItemTouchListener(
            RecyclerItemClickListenr(
                this,
                capital_letters_recycler_ID,
                object : RecyclerItemClickListenr.OnItemClickListener {
                    override fun onItemClick(view: View, position: Int) {

                        //animation of item click
                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view.findViewById(R.id.item_Text_capital_letter))

                        mediaPlayer.stop()
                        mediaPlayer=MediaPlayer.create(this@CapitalLetters_Activity,capitalLetters_Sound_list[position])
                        mediaPlayer.start()

                        capital_text_show_TV_ID.text = capitalLetters_list[position]
                        capital_letter_image_nameTV_ID.text=capitalletters_image_text_details[position]

                        imageView_details_capital_letters.setImageResource(capitalLetters_Images_list[position])


                        //set animation
                        if (position%2==0){
                            YoYo.with(Techniques.ZoomInUp)
                                .duration(1000)
                                .repeat(0)
                                .playOn(capital_text_show_TV_ID)


                            YoYo.with(Techniques.DropOut)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_capital_letters)


                            YoYo.with(Techniques.RollIn)
                                .duration(1000)
                                .repeat(0)
                                .playOn(capital_letter_image_nameTV_ID)
                        }else{

                            YoYo.with(Techniques.BounceInLeft)
                                .duration(1000)
                                .repeat(0)
                                .playOn(capital_text_show_TV_ID)


                            YoYo.with(Techniques.ZoomInUp)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_capital_letters)


                            YoYo.with(Techniques.BounceInRight)
                                .duration(1000)
                                .repeat(0)
                                .playOn(capital_letter_image_nameTV_ID)
                        }


                    }

                    override fun onItemLongClick(view: View?, position: Int) {

                        //animation of item click
                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view!!.findViewById(R.id.item_Text_capital_letter))

                        mediaPlayer.stop()
                        mediaPlayer=MediaPlayer.create(this@CapitalLetters_Activity,capitalLetters_Sound_list[position])
                        mediaPlayer.start()

                        capital_text_show_TV_ID.text = capitalLetters_list[position]
                        capital_letter_image_nameTV_ID.text=capitalletters_image_text_details[position]

                        imageView_details_capital_letters.setImageResource(capitalLetters_Images_list[position])

   //set animation
                        if (position%2==0){
                            YoYo.with(Techniques.ZoomInUp)
                                .duration(1000)
                                .repeat(0)
                                .playOn(capital_text_show_TV_ID)


                            YoYo.with(Techniques.DropOut)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_capital_letters)


                            YoYo.with(Techniques.RollIn)
                                .duration(1000)
                                .repeat(0)
                                .playOn(capital_letter_image_nameTV_ID)
                        }else{

                            YoYo.with(Techniques.BounceInLeft)
                                .duration(1000)
                                .repeat(0)
                                .playOn(capital_text_show_TV_ID)


                            YoYo.with(Techniques.ZoomInUp)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_capital_letters)


                            YoYo.with(Techniques.BounceInRight)
                                .duration(1000)
                                .repeat(0)
                                .playOn(capital_letter_image_nameTV_ID)
                        }

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
