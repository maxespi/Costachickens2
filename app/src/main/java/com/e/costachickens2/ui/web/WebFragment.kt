package com.e.costachickens2.ui.web

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.e.costachickens2.R

class WebFragment : Fragment() {

    companion object {
        fun newInstance() = WebFragment()
    }

    private lateinit var webViewModel: WebViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        webViewModel =
            ViewModelProviders.of(this).get(WebViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_qrcode, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        webViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        webViewModel = ViewModelProviders.of(this).get(WebViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
