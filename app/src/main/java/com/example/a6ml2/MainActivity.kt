package com.example.a6ml2

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.widget.Toast
import com.example.a6ml2.databinding.ActivityMainBinding
import com.example.a6ml2.extension.load
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var arrayList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firstMethod()
        secondMethod()
        thirdMethod()
    }

    private fun thirdMethod() {
        binding.btnRandom.setOnClickListener {
            binding.ivImage.load(arrayList[Random.nextInt(10)])
        }
    }

    private fun secondMethod() {
        binding.btn.setOnClickListener {
            val url = Uri.parse(binding.etMain.text.toString())
            if (URLUtil.isValidUrl(url.toString())){
                binding.ivImage.load(url.toString())
                arrayList.add(Uri.parse(binding.etMain.text.toString()).toString())
                Toast.makeText(this,getString(R.string.Success),Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,getString(R.string.Failed),Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun firstMethod() {
        arrayList.add("https://images7.alphacoders.com/453/453962.jpg")
        arrayList.add("https://images.alphacoders.com/454/454756.jpg")
        arrayList.add("https://images8.alphacoders.com/428/428847.jpg")
        arrayList.add("https://images.alphacoders.com/656/656070.png")
        arrayList.add("https://images4.alphacoders.com/962/962682.png")
        arrayList.add("https://images2.alphacoders.com/972/972420.png")
        arrayList.add("https://images7.alphacoders.com/929/929324.jpg")
        arrayList.add("https://images2.alphacoders.com/962/962690.png")
        arrayList.add("https://images.alphacoders.com/110/1105914.jpg")
        arrayList.add("https://images5.alphacoders.com/656/656080.png")
    }

}

