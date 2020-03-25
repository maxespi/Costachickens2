package com.e.costachickens2.ui.home

import ahmed.easyslider.EasySlider
import ahmed.easyslider.SliderItem
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.e.costachickens2.R
import com.e.costachickens2.ui.web.WebFragment
import com.e.costachickens2.ui.web.WebViewModel


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel




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


        val btnWeb: Button = root.findViewById(R.id.goweb)
        val btnHome: Button = root.findViewById(R.id.gohome)
        val btnMenu: Button = root.findViewById(R.id.gomenu)
        val btnQRcode: Button = root.findViewById(R.id.goqrcode)

        btnWeb.setOnClickListener (View.OnClickListener {
            Toast.makeText(activity,"Pagina WEB!",Toast.LENGTH_SHORT).show()
        })

        btnHome.setOnClickListener (View.OnClickListener {
            Toast.makeText(activity,"Home!",Toast.LENGTH_SHORT).show();
            //val intent = Intent(activity, WebActivity::class.java)
            //activity!!.startActivity(intent)
        })

        btnMenu.setOnClickListener (View.OnClickListener {
            Toast.makeText(activity,"Menu!",Toast.LENGTH_SHORT).show();
            //val intent = Intent(activity, WebActivity::class.java)
            //activity!!.startActivity(intent)
        })

        btnQRcode.setOnClickListener (View.OnClickListener {
            Toast.makeText(activity,"QR Code!",Toast.LENGTH_SHORT).show();
            //val intent = Intent(activity, WebActivity::class.java)
            //activity!!.startActivity(intent)
        })





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
