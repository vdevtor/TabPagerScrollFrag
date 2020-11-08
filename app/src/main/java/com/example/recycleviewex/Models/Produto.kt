package com.example.recycleviewex.Models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

// MODELANDO NOSSOS ITEM A SER EXIBIDO NA RECYCLE VIEW

@Parcelize
data class Produto(
    val userProfileAvatar: String,
    val produtoNome: String,
    val produtoDescricao: String,
    var produtoPreco: Int = 0
): Parcelable
