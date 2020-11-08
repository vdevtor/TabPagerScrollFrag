package com.example.recycleviewex.Fragments

import android.os.Bundle
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

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SalgadoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SalgadoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

            val recebe = initComponents()

            view?.findViewById<RecyclerView>(R.id.rv_frag)?.apply {

                layoutManager = LinearLayoutManager(activity)
                adapter = MainAdapter(recebe)


            }
        }
    }


        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val recebe = initComponents()



            view?.findViewById<RecyclerView>(R.id.rv_frag)?.apply {
                val view = inflater.inflate(R.layout.modelo_de_tela, container, false)
                layoutManager = LinearLayoutManager(activity)
                adapter = MainAdapter(recebe)

            }


            //return inflater.inflate(R.layout.fragment_salgado, container, false)

            return view
        }

        fun initComponents(): MutableList<Produto> {
            val produtos = mutableListOf<Produto>()

            val produto1 = Produto(
                "https://randomuser.me/api/portraits/men/38.jpg",
                "@cesar.rodrigues",
                "Me manda os arquivos",
                10
            )
            val produto2 =
                Produto(
                    "https://randomuser.me/api/portraits/men/37.jpg",
                    "@edu.misina",
                    "Boa noite"
                )
            val produto3 = Produto(
                "https://randomuser.me/api/portraits/men/2.jpg",
                "@vinicius.trapia",
                "Vinicius Trápia"
            )
            val produto4 =
                Produto("https://randomuser.me/api/portraits/men/90.jpg", "@jonatas", "Jonatas")

            produtos.addAll(listOf(produto1, produto2, produto3, produto4))

            return produtos

        }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SalgadoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SalgadoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

    private fun initComponents(): List<Produto> {
        val produtos = mutableListOf<Produto>()

        val produto1 = Produto(
            "https://randomuser.me/api/portraits/men/38.jpg",
            "@cesar.rodrigues",
            "Me manda os arquivos",
            10
        )
        val produto2 =
            Produto("https://randomuser.me/api/portraits/men/37.jpg", "@edu.misina", "Boa noite")
        val produto3 = Produto(
            "https://randomuser.me/api/portraits/men/2.jpg",
            "@vinicius.trapia",
            "Vinicius Trápia"
        )
        val produto4 =
            Produto("https://randomuser.me/api/portraits/men/90.jpg", "@jonatas", "Jonatas")

        produtos.addAll(listOf(produto1, produto2, produto3, produto4))

        return produtos

    }




