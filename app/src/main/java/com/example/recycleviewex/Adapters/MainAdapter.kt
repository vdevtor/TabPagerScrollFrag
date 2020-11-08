package com.example.recycleviewex.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import android.view.View
import com.bumptech.glide.Glide
import com.example.recycleviewex.Models.Produto
import com.example.recycleviewex.R
import kotlinx.android.synthetic.main.fragment_salgado.view.*
import kotlinx.android.synthetic.main.modelo_de_tela.view.*

class MainAdapter(
    private val produtoList : List<Produto>

): RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.modelo_de_tela,parent,false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return produtoList.size
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {

        /**ooo*/

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(produto: Produto, onItemClicked: (Int) -> Unit) = with(itemView) {
            //todo carregar imagem
            Glide.with(itemView.context).load(produto.userProfileAvatar).into(ivAvatar)

        }
    }
}


