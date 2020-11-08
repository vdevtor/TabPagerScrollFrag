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

// PASSANDO LISTA DE PRODUTOS, QUE SERÁ A LISTA QUE VAI FUNCIONAR COMO A RECYCLE VIEW
// PASSANDO UMA FUNÇÃO COMO PARAMETRO, QUE SE PRECISO NO FUTURO SERA RESPONSAVEL POR AUXILIAR OS CLIKS

class MainAdapter(


    private val produtoList : List<Produto>,
private val onItemClicked: (Int) -> Unit

): RecyclerView.Adapter<MainAdapter.ViewHolder>() {

//PASSAMOS O LAYOUT ONDE FOI FEITO O DESIGN DA TELA DAI ELE SERA INFLADO
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.modelo_de_tela,parent,false)
        return  ViewHolder(view)
    }
 // PEGA A QUANTIDADE DE ITENS DA LISTA

    override fun getItemCount(): Int {
        return produtoList.size
    }

  //  NÃO SEI O TERMO CORRETO MAS AQUI PEGA O NUMERO DA POSIÇÃO QUE CLICAMOS
    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {

        holder.bind(produtoList[position],onItemClicked)

    }

    // TERMO TECNICO DESSE TRECHO TAMBEM NÃO SEI, MAS NESSA PARTE CARREGAMOS A IMAGEM
    // E CONFIGURAMOS O LAYOUT PARA RECEBER AS INFORMAÇÕES QUE ESCOLHEMOS COMO NOME, PREÇO ETC


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(produto: Produto, onItemClicked: (Int) -> Unit) = with(itemView) {
            //todo carregar imagem
            Glide.with(itemView.context).load(produto.userProfileAvatar).into(ivAvatar)

            // PODEMOS CHAMAR OS VIEWS E PASSAR OS DADOS AQUI

            tvUsuario.text = produto.produtoNome
            tvMensagem.text = produto.produtoDescricao
            tvNot.text = "${produto.produtoPreco}"

        }
    }
}


