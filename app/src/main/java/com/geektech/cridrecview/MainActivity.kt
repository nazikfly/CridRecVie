package com.geektech.cridrecview

import android.content.Intent
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.geektech.cridrecview.adapter.PictureAdapter
import com.geektech.cridrecview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val data= arrayListOf<String>()
    private val list= arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addUrl()
        binding.recyclerView.layoutManager=GridLayoutManager(this,3)
        val adapter = PictureAdapter(this,data,){position->
            intent = Intent(this,SecondActivity::class.java)
            intent.putStringArrayListExtra("KEY",list)
            list.add(data[position].toString())
        }
        binding.fab.setOnClickListener {
            startActivity(intent)
        }
        binding.recyclerView.adapter = adapter
    }

    private fun addUrl() {
        data.add("https://otvet.imgsmail.ru/download/u_00feccb0751d44ca1941a481893960c3_800.jpg")
        data.add("https://i.pinimg.com/736x/79/d9/49/79d9499df757e7d59addad83184f12a7.jpg")
        data.add("https://mirpozitiva.ru/wp-content/uploads/2019/11/1478873097_leto_gory_priroda_ozero_reka-1568x882.jpg ")
        data.add("https://mirpozitiva.ru/wp-content/uploads/2019/11/1478873177_travinka-1024x576.jpg ")
        data.add("https://i.pinimg.com/originals/0e/02/e3/0e02e3a30536ba93de6a32fb0556d3ac.jpg"
            )

        data.add(
                "https://i.pinimg.com/originals/5f/0c/a2/5f0ca29df5528c07b4a2fb30b13abab4.jpg"
            )

        data.add(

                "https://i.ytimg.com/vi/iqdRh9IpJ6I/maxresdefault.jpg"
            )

        data.add(
                "https://i.pinimg.com/originals/5f/0c/a2/5f0ca29df5528c07b4a2fb30b13abab4.jpg"
            )

        data.add(

                "https://live.staticflickr.com/4848/46076989841_1884471e18_n.jpg "
            )

        data.add(

                "https://fullhdoboi.ru/wp-content/uploads/_ph/6/735811463.jpg"
            )
        data.add(
                "https://mirpozitiva.ru/wp-content/uploads/2019/11/1478873091_bogii_korovki-na_cvetke-768x576.jpg "
            )

        data.add(

                "https://www.ecobeneficial.com/wp-content/uploads/2014/04/Bee-on-Baptisia_chipmunk_1-768x576.jpg "
            )

        data.add(

                "https://otvet.imgsmail.ru/download/u_00feccb0751d44ca1941a481893960c3_800.jpg"
            )

        data.add(

                "https://i.pinimg.com/736x/79/d9/49/79d9499df757e7d59addad83184f12a7.jpg"
            )

        data.add(

                "https://fullhdoboi.ru/wp-content/uploads/_ph/6/735811463.jpg"
            )

        data.add(

                "https://otvet.imgsmail.ru/download/u_00feccb0751d44ca1941a481893960c3_800.jpg"
            )

        data.add(

                "https://i.pinimg.com/736x/79/d9/49/79d9499df757e7d59addad83184f12a7.jpg"
            )

        data.add(

                "https://mirpozitiva.ru/wp-content/uploads/2019/11/1478873097_leto_gory_priroda_ozero_reka-1568x882.jpg "
            )
        data.add(

                "https://mirpozitiva.ru/wp-content/uploads/2019/11/1478873177_travinka-1024x576.jpg "

        )
        data.add(

                "https://i.pinimg.com/originals/0e/02/e3/0e02e3a30536ba93de6a32fb0556d3ac.jpg"
            )

        data.add(

                "https://i.pinimg.com/originals/5f/0c/a2/5f0ca29df5528c07b4a2fb30b13abab4.jpg"
            )

        data.add(

                "https://i.ytimg.com/vi/iqdRh9IpJ6I/maxresdefault.jpg"
            )

        data.add(
                "https://i.pinimg.com/originals/5f/0c/a2/5f0ca29df5528c07b4a2fb30b13abab4.jpg"
            )

        data.add(

                "https://live.staticflickr.com/4848/46076989841_1884471e18_n.jpg "
            )

        data.add(

                "https://fullhdoboi.ru/wp-content/uploads/_ph/6/735811463.jpg"
            )

        data.add(

                "https://mirpozitiva.ru/wp-content/uploads/2019/11/1478873091_bogii_korovki-na_cvetke-768x576.jpg "
            )

        data.add(

                "https://www.ecobeneficial.com/wp-content/uploads/2014/04/Bee-on-Baptisia_chipmunk_1-768x576.jpg "
            )

        data.add(

                "https://otvet.imgsmail.ru/download/u_00feccb0751d44ca1941a481893960c3_800.jpg"
            )

        data.add(

                "https://i.pinimg.com/736x/79/d9/49/79d9499df757e7d59addad83184f12a7.jpg"
            )

        data.add(
                "https://fullhdoboi.ru/wp-content/uploads/_ph/6/735811463.jpg"
            )

    }
}

