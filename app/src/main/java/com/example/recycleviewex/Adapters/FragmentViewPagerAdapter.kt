package com.example.recycleviewex.Adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.ListFragment
import com.example.recycleviewex.Fragments.BebidasFragment
import com.example.recycleviewex.Fragments.SalgadoFragment

//CRIANDO O ADAPTADOR, ASSIM NÃO PRECISAMOS SETAR OS ITENS DO TAB NO LAYOUT
//PASSAMOS UM CONTEXTO E UM GERENCIADOR DE FFRAGMENTO O FM, E EXTENDEMOS PARA O PAGERADAPTER
//QUE FAZ AQUELE LANCE DE DESLIZAR A TELA

class FragmentViewPagerAdapter (ctx: Context, fm: FragmentManager): FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            //PEGANDO A POSIÇÃO, NA VERDADE GERANDO ELAS COMEÇANDO PELA 0
            //AQUI PODEMOS NOMEAR AS TABS

            0 -> return "Salgados"
            else -> return "Bebidas"
        }
    }

    override fun getItem(position: Int): Fragment {

        //NESSA PARTE CHAMAMOS O FRAGMENT EM SI, BASEADO NA POSIÇÃO QUE QUEREMOS QUE ELES
        // SEJAM EXIBIDOS

       when(position){
           0 -> return SalgadoFragment()
           else -> return BebidasFragment()
       }
    }
    // AQUI INFORMO NUMERO DE TABS QUE PRETENDO CRIAR UTILIZAR
    override fun getCount(): Int {
       return 2
    }
}
