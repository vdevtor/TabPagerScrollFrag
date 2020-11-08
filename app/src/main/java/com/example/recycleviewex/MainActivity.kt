package com.example.recycleviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TableLayout
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.recycleviewex.Adapters.FragmentViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


// NÃO SEI SE É CORRETO DIZER QUE ESTAMOS INSTANCIANDO O TABLAYOUT E O VIEW PAGER AQUI
//MAS ESTAMOS FAZENDO COM QUE OS DOIS TRABALHEM JUNTOS....


        val tableLayout = findViewById<TabLayout>(R.id.tab_layoutID)
        val viewPager =findViewById<ViewPager>(R.id.view_PagerID)
        var adapter = FragmentViewPagerAdapter( this, this.supportFragmentManager)
        viewPager.adapter = adapter
        tableLayout.setupWithViewPager(viewPager)

    }





    }
