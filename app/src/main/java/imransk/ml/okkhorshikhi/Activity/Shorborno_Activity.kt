package imransk.ml.okkhorshikhi.Activity

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import imransk.ml.okkhorshikhi.R
import imransk.ml.okkhorshikhi.RecyclerView_click.RecyclerItemClickListenr
import imransk.ml.okkhorshikhi.AdapterClass.Shorborno_Adapter
import kotlinx.android.synthetic.main.activity_banjon_borno.*
import kotlinx.android.synthetic.main.activity_shorborno.*

class Shorborno_Activity : AppCompatActivity() {

    var shorbborno_okkhor = ArrayList<String>()
    var shorbborno_okkhor_images = ArrayList<Int>()
    var shorbborno_okkhor_sound = ArrayList<Int>()
    var shororno_example = ArrayList<String>()
     var mPlayer2:MediaPlayer = MediaPlayer()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shorborno)

        shorbborno_okkhor.add("অ")
        shorbborno_okkhor.add("আ")
        shorbborno_okkhor.add("ই")
        shorbborno_okkhor.add("ঈ")
        shorbborno_okkhor.add("উ")
        shorbborno_okkhor.add("ঊ")
        shorbborno_okkhor.add("ঋ")
        shorbborno_okkhor.add("এ")
        shorbborno_okkhor.add("ঐ")
        shorbborno_okkhor.add("ও")
        shorbborno_okkhor.add("ঔ")

        shororno_example.add("অজগর")
        shororno_example.add("আম")
        shororno_example.add("ইঁদুর")
        shororno_example.add("ঈগল")
        shororno_example.add("উট")
        shororno_example.add("ঊষা")
        shororno_example.add("ঋতু")
        shororno_example.add("একতারা")
        shororno_example.add("ঐক্য")
        shororno_example.add("ওজন")
        shororno_example.add("ঔষধ")

        shorbborno_okkhor_images.add(R.drawable.a01)
        shorbborno_okkhor_images.add(R.drawable.a02)
        shorbborno_okkhor_images.add(R.drawable.a03)
        shorbborno_okkhor_images.add(R.drawable.a04)
        shorbborno_okkhor_images.add(R.drawable.a05)
        shorbborno_okkhor_images.add(R.drawable.a06)
        shorbborno_okkhor_images.add(R.drawable.a07)
        shorbborno_okkhor_images.add(R.drawable.a08)
        shorbborno_okkhor_images.add(R.drawable.a09)
        shorbborno_okkhor_images.add(R.drawable.a10)
        shorbborno_okkhor_images.add(R.drawable.a11)

        shorbborno_okkhor_sound.add(R.raw.a01)
        shorbborno_okkhor_sound.add(R.raw.a02)
        shorbborno_okkhor_sound.add(R.raw.a03)
        shorbborno_okkhor_sound.add(R.raw.a04)
        shorbborno_okkhor_sound.add(R.raw.a05)
        shorbborno_okkhor_sound.add(R.raw.a06)
        shorbborno_okkhor_sound.add(R.raw.a07)
        shorbborno_okkhor_sound.add(R.raw.a08)
        shorbborno_okkhor_sound.add(R.raw.a09)
        shorbborno_okkhor_sound.add(R.raw.a10)
        shorbborno_okkhor_sound.add(R.raw.a11)

        //set layout manager
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        shororno_okkhor_recycler_ID.layoutManager = linearLayoutManager
        //set layout manager END


        var shorborno_Adapter = Shorborno_Adapter(this, shorbborno_okkhor)
        shororno_okkhor_recycler_ID.adapter = shorborno_Adapter

        imageView_details.setImageResource(R.drawable.a01)
        shorborno_view_TV_ID.text=shorbborno_okkhor[0]
        shorborno_exampale_name_TV_ID.text=shororno_example[0]

        mPlayer2.stop()
        mPlayer2=MediaPlayer.create(this@Shorborno_Activity,shorbborno_okkhor_sound[0])
        mPlayer2.start()

 //set first animation
        YoYo.with(Techniques.ZoomInUp)
            .duration(1000)
            .repeat(0)
            .playOn(shorborno_view_TV_ID)


        YoYo.with(Techniques.DropOut)
            .duration(700)
            .repeat(0)
            .playOn(imageView_details)


        YoYo.with(Techniques.RollIn)
            .duration(1000)
            .repeat(0)
            .playOn(shorborno_exampale_name_TV_ID)


        shororno_okkhor_recycler_ID.addOnItemTouchListener(
            RecyclerItemClickListenr(
                this,
                shororno_okkhor_recycler_ID,
                object : RecyclerItemClickListenr.OnItemClickListener {

                    override fun onItemClick(view: View, position: Int) {


                        //animation of item click
                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view.findViewById(R.id.item_text_shorborno))

                        shorborno_view_TV_ID.text=shorbborno_okkhor[position]
                        imageView_details.setImageResource(shorbborno_okkhor_images[position])
                        shorborno_exampale_name_TV_ID.text=shororno_example[position]

                        mPlayer2.stop()
                        mPlayer2=MediaPlayer.create(this@Shorborno_Activity,shorbborno_okkhor_sound[position])
                        mPlayer2.start()

                        if (position%2==0){

                            YoYo.with(Techniques.ZoomInUp)
                                .duration(1000)
                                .repeat(0)
                                .playOn(shorborno_view_TV_ID)


                            YoYo.with(Techniques.DropOut)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details)


                            YoYo.with(Techniques.RollIn)
                                .duration(1000)
                                .repeat(0)
                                .playOn(shorborno_exampale_name_TV_ID)
                        }else{

                            YoYo.with(Techniques.BounceInLeft)
                                .duration(1000)
                                .repeat(0)
                                .playOn(shorborno_view_TV_ID)


                            YoYo.with(Techniques.ZoomInUp)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details)


                            YoYo.with(Techniques.BounceInRight)
                                .duration(1000)
                                .repeat(0)
                                .playOn(shorborno_exampale_name_TV_ID)
                        }


                    }

                    override fun onItemLongClick(view: View?, position: Int) {


                        //animation of item click
                        YoYo.with(Techniques.BounceInLeft)
                            .duration(500)
                            .repeat(0)
                            .playOn(view!!.findViewById(R.id.item_text_shorborno))

                        imageView_details.setImageResource(shorbborno_okkhor_images[position])
                        shorborno_exampale_name_TV_ID.text=shororno_example[position]

                        mPlayer2.stop()
                        mPlayer2=MediaPlayer.create(this@Shorborno_Activity,shorbborno_okkhor_sound[position])
                        mPlayer2.start()

                        if (position%2==0){

                            YoYo.with(Techniques.ZoomInUp)
                                .duration(1000)
                                .repeat(0)
                                .playOn(shorborno_view_TV_ID)


                            YoYo.with(Techniques.DropOut)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details)


                            YoYo.with(Techniques.RollIn)
                                .duration(1000)
                                .repeat(0)
                                .playOn(shorborno_exampale_name_TV_ID)
                        }else{

                            YoYo.with(Techniques.BounceInLeft)
                                .duration(1000)
                                .repeat(0)
                                .playOn(shorborno_view_TV_ID)


                            YoYo.with(Techniques.ZoomInUp)
                                .duration(700)
                                .repeat(0)
                                .playOn(imageView_details)


                            YoYo.with(Techniques.BounceInRight)
                                .duration(1000)
                                .repeat(0)
                                .playOn(shorborno_exampale_name_TV_ID)
                        }
                    }

                })
        )


    }


    override fun onDestroy() {
        super.onDestroy()
        mPlayer2.stop()
        mPlayer2.release()
    }
}
