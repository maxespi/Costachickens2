package com.e.costachickens2.ui.qrcode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.e.costachickens2.R

class QRcodeFragment : Fragment() {

    private lateinit var qrcodeViewModel: QRcodeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        qrcodeViewModel =
                ViewModelProviders.of(this).get(QRcodeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_qrcode, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        qrcodeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
