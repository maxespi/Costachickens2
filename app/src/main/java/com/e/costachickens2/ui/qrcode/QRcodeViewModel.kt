package com.e.costachickens2.ui.qrcode

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QRcodeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is qrcode Fragment"
    }
    val text: LiveData<String> = _text
}