package com.e.costachickens2.ui.home

import ahmed.easyslider.EasySlider
import ahmed.easyslider.SliderItem
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.e.costachickens2.R


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    Button

    /*private val URLbase = "https://www.costachickens.cl/wp-content/uploads/2020/02/IMG-20200227-WA0049.jpg"*/


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)



        val easySlider: EasySlider = root.findViewById(R.id.sliderId)
        val easySliders = ArrayList<SliderItem>()
        easySliders.add(SliderItem("Promo", R.drawable.promo1))
        easySliders.add(SliderItem("Promo", R.drawable.promo2))
        easySliders.add(SliderItem("Promo", R.drawable.promo3))
        easySlider.setPages(easySliders)



        /*var imageView: ImageView = root.findViewById(R.id.imageView)

        Glide.with(this)
            .load(URLbase)
            .override(600, 400)
            .into(imageView)*/


        /*val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root


    }


}
