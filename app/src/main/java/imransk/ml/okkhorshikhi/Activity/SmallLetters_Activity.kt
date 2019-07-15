package imransk.ml.okkhorshikhi.Activity

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import imransk.ml.okkhorshikhi.AdapterClass.Small_Letter_Adapter
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import kotlinx.android.synthetic.main.activity_small_letters.*
import kotlin.collections.ArrayList

class SmallLetters_Activity : AppCompatActivity() {

    var small_Litter_List = ArrayList<String>()
    var small_leter_Seaking = ArrayList<Int>()
    var smallLetters_Images_details_list = ArrayList<Int>()
    var smallLetters_details_text = ArrayList<String>()

    var mediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_small_letters)

        small_Litter_List.add("a")
        small_Litter_List.add("b")
        small_Litter_List.add("c")
        small_Litter_List.add("d")
        small_Litter_List.add("e")
        small_Litter_List.add("f")
        small_Litter_List.add("g")
        small_Litter_List.add("h")
        small_Litter_List.add("i")
        small_Litter_List.add("j")
        small_Litter_List.add("k")
        small_Litter_List.add("l")
        small_Litter_List.add("m")
        small_Litter_List.add("n")
        small_Litter_List.add("o")
        small_Litter_List.add("p")
        small_Litter_List.add("q")
        small_Litter_List.add("r")
        small_Litter_List.add("s")
        small_Litter_List.add("t")
        small_Litter_List.add("u")
        small_Litter_List.add("v")
        small_Litter_List.add("w")
        small_Litter_List.add("x")
        small_Litter_List.add("y")
        small_Litter_List.add("z")

        smallLetters_details_text.add("Apple")
        smallLetters_details_text.add("Ball")
        smallLetters_details_text.add("Cat")
        smallLetters_details_text.add("Dog")
        smallLetters_details_text.add("Elephant")
        smallLetters_details_text.add("Fish")
        smallLetters_details_text.add("Goat")
        smallLetters_details_text.add("Hen")
        smallLetters_details_text.add("Ice Cream")
        smallLetters_details_text.add("Juicy")
        smallLetters_details_text.add("kangaroo")
        smallLetters_details_text.add("Lion")
        smallLetters_details_text.add("Mango")
        smallLetters_details_text.add("Nest")
        smallLetters_details_text.add("Orange")
        smallLetters_details_text.add("Parrot")
        smallLetters_details_text.add("Question")
        smallLetters_details_text.add("Rocket")
        smallLetters_details_text.add("Ship")
        smallLetters_details_text.add("Tree")
        smallLetters_details_text.add("Umbrella")
        smallLetters_details_text.add("Van")
        smallLetters_details_text.add("Watch")
        smallLetters_details_text.add("Box")
        smallLetters_details_text.add("yyy")
        smallLetters_details_text.add("Zebra")

        smallLetters_Images_details_list.add(R.drawable.a_image)
        smallLetters_Images_details_list.add(R.drawable.b_image)
        smallLetters_Images_details_list.add(R.drawable.c_image)
        smallLetters_Images_details_list.add(R.drawable.d_image)
        smallLetters_Images_details_list.add(R.drawable.e_image)
        smallLetters_Images_details_list.add(R.drawable.f_image)
        smallLetters_Images_details_list.add(R.drawable.g_image)
        smallLetters_Images_details_list.add(R.drawable.h_image)
        smallLetters_Images_details_list.add(R.drawable.i_image)

        smallLetters_Images_details_list.add(R.drawable.j_image)
        smallLetters_Images_details_list.add(R.drawable.k_image)
        smallLetters_Images_details_list.add(R.drawable.l_image)
        smallLetters_Images_details_list.add(R.drawable.m_image)
        smallLetters_Images_details_list.add(R.drawable.n_image)
        smallLetters_Images_details_list.add(R.drawable.o_image)
        smallLetters_Images_details_list.add(R.drawable.p_image)
        smallLetters_Images_details_list.add(R.drawable.q_image)
        smallLetters_Images_details_list.add(R.drawable.r_image)
        smallLetters_Images_details_list.add(R.drawable.s_image)

        smallLetters_Images_details_list.add(R.drawable.t_image)
        smallLetters_Images_details_list.add(R.drawable.u_image)
        smallLetters_Images_details_list.add(R.drawable.v_image)
        smallLetters_Images_details_list.add(R.drawable.w_image)
        smallLetters_Images_details_list.add(R.drawable.x_image)
        smallLetters_Images_details_list.add(R.drawable.y_image)
        smallLetters_Images_details_list.add(R.drawable.z_image)


        small_leter_Seaking.add(R.raw.a)
        small_leter_Seaking.add(R.raw.b)
        small_leter_Seaking.add(R.raw.c)
        small_leter_Seaking.add(R.raw.d)
        small_leter_Seaking.add(R.raw.e)
        small_leter_Seaking.add(R.raw.f)
        small_leter_Seaking.add(R.raw.g)
        small_leter_Seaking.add(R.raw.h)
        small_leter_Seaking.add(R.raw.i)
        small_leter_Seaking.add(R.raw.j)
        small_leter_Seaking.add(R.raw.k)
        small_leter_Seaking.add(R.raw.l)
        small_leter_Seaking.add(R.raw.m)
        small_leter_Seaking.add(R.raw.n)
        small_leter_Seaking.add(R.raw.o)
        small_leter_Seaking.add(R.raw.p)
        small_leter_Seaking.add(R.raw.q)
        small_leter_Seaking.add(R.raw.r)
        small_leter_Seaking.add(R.raw.s)
        small_leter_Seaking.add(R.raw.t)
        small_leter_Seaking.add(R.raw.u)
        small_leter_Seaking.add(R.raw.v)
        small_leter_Seaking.add(R.raw.w)
        small_leter_Seaking.add(R.raw.x)
        small_leter_Seaking.add(R.raw.y)
        small_leter_Seaking.add(R.raw.z)


        //set layout manager start
        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        small_letters_recycler_ID.layoutManager = layoutManager
        //set layout manager END

        // set adapter
        var small_Letter_Adapter = Small_Letter_Adapter(small_Litter_List)
        small_letters_recycler_ID.adapter = small_Letter_Adapter

        small_letter_text_view_ID.text = small_Litter_List[0]
        imageView_details_small_letters.setImageResource(smallLetters_Images_details_list[0])
        small_letter_image_Details_TV_ID.text = smallLetters_details_text[0]

//set first time sound
        mediaPlayer.stop()
        mediaPlayer = MediaPlayer.create(this@SmallLetters_Activity, small_leter_Seaking[0])
        mediaPlayer.start()

//set first open animation
        YoYo.with(Techniques.ZoomInUp)
            .duration(1000)
            .repeat(0)
            .playOn(small_letter_text_view_ID)


        YoYo.with(Techniques.DropOut)
            .duration(700)
            .repeat(0)
            .playOn(small_letter_text_view_ID)


        YoYo.with(Techniques.RollIn)
            .duration(1000)
            .repeat(0)
            .playOn(small_letter_image_Details_TV_ID)


        //set On click
        small_letters_recycler_ID.addOnItemTouchListener(
            RecyclerItemClickListenr(
                this,
                small_letters_recycler_ID,
                object : RecyclerItemClickListenr.OnItemClickListener {
                    override fun onItemClick(view: View, position: Int) {


                        //animation of item click
                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view.findViewById(R.id.item_text_small_letter))

                        small_letter_text_view_ID.text = small_Litter_List[position]

                        imageView_details_small_letters.setImageResource(smallLetters_Images_details_list[position])
                        small_letter_image_Details_TV_ID.text = smallLetters_details_text[position]

                        mediaPlayer.stop()
                        mediaPlayer = MediaPlayer.create(this@SmallLetters_Activity, small_leter_Seaking[position])
                        mediaPlayer.start()
//set animation
                        if (position%2==0){
                            YoYo.with(Techniques.ZoomInUp)
                                .duration(1000)
                                .repeat(0)
                                .playOn(small_letter_text_view_ID)


                            YoYo.with(Techniques.DropOut)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_small_letters)


                            YoYo.with(Techniques.RollIn)
                                .duration(1000)
                                .repeat(0)
                                .playOn(small_letter_image_Details_TV_ID)
                        }else{


                            YoYo.with(Techniques.BounceInLeft)
                                .duration(1000)
                                .repeat(0)
                                .playOn(small_letter_text_view_ID)


                            YoYo.with(Techniques.ZoomInUp)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_small_letters)


                            YoYo.with(Techniques.BounceInRight)
                                .duration(1000)
                                .repeat(0)
                                .playOn(small_letter_image_Details_TV_ID)
                        }

                    }

                    override fun onItemLongClick(view: View?, position: Int) {


                        //animation of item click
                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view!!.findViewById(R.id.item_text_small_letter))



                        small_letter_text_view_ID.text = small_Litter_List[position]

                        imageView_details_small_letters.setImageResource(smallLetters_Images_details_list[position])
                        small_letter_image_Details_TV_ID.text = smallLetters_details_text[position]

                        mediaPlayer.stop()
                        mediaPlayer = MediaPlayer.create(this@SmallLetters_Activity, small_leter_Seaking[position])
                        mediaPlayer.start()

//set animation
                        if (position%2==0){
                            YoYo.with(Techniques.ZoomInUp)
                                .duration(1000)
                                .repeat(0)
                                .playOn(small_letter_text_view_ID)


                            YoYo.with(Techniques.DropOut)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_small_letters)


                            YoYo.with(Techniques.RollIn)
                                .duration(1000)
                                .repeat(0)
                                .playOn(small_letter_image_Details_TV_ID)
                        }else{


                            YoYo.with(Techniques.BounceInLeft)
                                .duration(1000)
                                .repeat(0)
                                .playOn(small_letter_text_view_ID)


                            YoYo.with(Techniques.ZoomInUp)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details_small_letters)


                            YoYo.with(Techniques.BounceInRight)
                                .duration(1000)
                                .repeat(0)
                                .playOn(small_letter_image_Details_TV_ID)
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
