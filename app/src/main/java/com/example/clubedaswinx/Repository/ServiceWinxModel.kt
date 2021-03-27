package com.example.clubedaswinx.Repository

import com.example.clubedaswinx.UI.WinxPresentation
import com.google.gson.annotations.SerializedName

data class ServiceWinxModel(
        private val aisha: WinxResponse? = null,
        private val bloom: WinxResponse? = null,
        private val flora: WinxResponse? = null,
        private val stella: WinxResponse? = null,
        private val techna: WinxResponse? = null,
        private val musa: WinxResponse? = null)

class WinxResponse(
        private val abilities: List<String>,
        private val afiliation: List<String>,
        @SerializedName("class") private val type: List<String>,
        private val Age: String = ""){
}

