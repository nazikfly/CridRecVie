package com.geektech.cridrecview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.geektech.cridrecview.adapter.PictureAdapter
import com.geektech.cridrecview.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding
    private val list= arrayListOf<Picture>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivSec.layoutManager=GridLayoutManager(this,3)
        val list=intent.getStringArrayListExtra("KEY")

         val adapter = PictureAdapter(this,list){

         }
        binding.ivSec.adapter=adapter


    }
}