package com.example.recycleviewex.Fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleviewex.Adapters.MainAdapter
import com.example.recycleviewex.Models.Produto
import com.example.recycleviewex.R
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_salgado.*
import kotlinx.android.synthetic.main.modelo_de_tela.*


class SalgadoFragment : Fragment() {

private fun obterProdutos(): List<Produto>{

    // criando variavel para receber todos os produtos criados

    val produtos = mutableListOf<Produto>()

    val produto1 = Produto(
        "https://images.unsplash.com/photo-1499028344343-cd173ffc68a9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
        "X-Burguer",
        "Picanha 180g, cebola, queijo e bacon",
        45
    )
    val produto8 = Produto(
        "https://scontent.fymy1-1.fna.fbcdn.net/v/t1.0-9/16508334_397238383943167_938207115822371229_n.jpg?_nc_cat=107&ccb=2&_nc_sid=7aed08&_nc_ohc=1g-pIgmVNTwAX_IAqTa&_nc_ht=scontent.fymy1-1.fna&oh=54fb11395cd68a55dcdd6f4f448557c6&oe=5FB907BE",
        "X-Burguer",
        "Picanha 180g, cebola, queijo e bacon",
        45
    )
    val produto2 = Produto(
        "https://scontent.fymy1-1.fna.fbcdn.net/v/t1.0-9/16508334_397238383943167_938207115822371229_n.jpg?_nc_cat=107&ccb=2&_nc_sid=7aed08&_nc_ohc=1g-pIgmVNTwAX_IAqTa&_nc_ht=scontent.fymy1-1.fna&oh=54fb11395cd68a55dcdd6f4f448557c6&oe=5FB907BE",
        "X-Burguer",
        "Picanha 180g, cebola, queijo e bacon",
        45
    )
    val produto3 = Produto(
        "https://scontent.fymy1-1.fna.fbcdn.net/v/t1.0-9/16508334_397238383943167_938207115822371229_n.jpg?_nc_cat=107&ccb=2&_nc_sid=7aed08&_nc_ohc=1g-pIgmVNTwAX_IAqTa&_nc_ht=scontent.fymy1-1.fna&oh=54fb11395cd68a55dcdd6f4f448557c6&oe=5FB907BE",
        "X-Burguer",
        "Picanha 180g, cebola, queijo e bacon",
        45
    )
    val produto7 = Produto(
        "https://scontent.fymy1-1.fna.fbcdn.net/v/t1.0-9/16508334_397238383943167_938207115822371229_n.jpg?_nc_cat=107&ccb=2&_nc_sid=7aed08&_nc_ohc=1g-pIgmVNTwAX_IAqTa&_nc_ht=scontent.fymy1-1.fna&oh=54fb11395cd68a55dcdd6f4f448557c6&oe=5FB907BE",
        "X-Burguer",
        "Picanha 180g, cebola, queijo e bacon",
        45
    )
    val produto4 = Produto(
        "https://scontent.fymy1-1.fna.fbcdn.net/v/t1.0-9/16508334_397238383943167_938207115822371229_n.jpg?_nc_cat=107&ccb=2&_nc_sid=7aed08&_nc_ohc=1g-pIgmVNTwAX_IAqTa&_nc_ht=scontent.fymy1-1.fna&oh=54fb11395cd68a55dcdd6f4f448557c6&oe=5FB907BE",
        "X-Burguer",
        "Picanha 180g, cebola, queijo e bacon",
        45
    )
    val produto5 = Produto(
        "https://scontent.fymy1-1.fna.fbcdn.net/v/t1.0-9/16508334_397238383943167_938207115822371229_n.jpg?_nc_cat=107&ccb=2&_nc_sid=7aed08&_nc_ohc=1g-pIgmVNTwAX_IAqTa&_nc_ht=scontent.fymy1-1.fna&oh=54fb11395cd68a55dcdd6f4f448557c6&oe=5FB907BE",
        "X-Burguer",
        "Picanha 180g, cebola, queijo e bacon",
        45
    )
    val produto6 = Produto(
        "https://scontent.fymy1-1.fna.fbcdn.net/v/t1.0-9/16508334_397238383943167_938207115822371229_n.jpg?_nc_cat=107&ccb=2&_nc_sid=7aed08&_nc_ohc=1g-pIgmVNTwAX_IAqTa&_nc_ht=scontent.fymy1-1.fna&oh=54fb11395cd68a55dcdd6f4f448557c6&oe=5FB907BE",
        "X-Burguer",
        "Picanha 180g, cebola, queijo e bacon",
        45
    )

    produtos.addAll(listOf(produto1,produto2,produto3,produto4,produto5,produto6,produto7,produto8))

    return produtos

}

    // AQUI USAMOS O CONCEITO DE INFLAR NOVAMENTE EU ENTENDO COMO SE FOSSE ALGO QUE ESTEJA MUCHO
    // DAI ENCHEMOS DE AR KKK OU SEJA LEVANTAMOS ALGO ASSIM DESSA VEZ PASSAMOS O LAYOUT DO PROPRIO FRAGMENT

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_salgado,container,false)
    }



    //PASSANDO NOSSA RECYCLE VIU COMO ADPATER DENTRO DO FRAGMENT
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val produtos = obterProdutos() // peguei todos os itens que criamos acima


        rv_frag.apply {
            setHasFixedSize(true)
            //layoutManeger é uma função que vem junto ao recycle view elas nos ajuda
            //a mexer nele, e aqui escolhemos a exbição em modo linear e passamos o contexto da view

            layoutManager = LinearLayoutManager(view.context)
            adapter = MainAdapter(produtos){

                //Aqui podemos codar pra chamar algo através do clique

                Log.i("SalgadoFragment","onViewCreated: clicando no item da pos. $it")
            }
        }
    }








}








