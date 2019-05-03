package com.dguardado19.evlabo2_00184217

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_fragmento1.*
import kotlinx.android.synthetic.main.fragment_fragmento2.*

class MainActivity : AppCompatActivity(), Fragmento1.OnFragmentInteractionListener, Fragmento2.OnFragmentInteractionListener {
    override fun next(i: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun back(i: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_atras.setOnClickListener {
            initFragmento2()
        }
        btn_siguiente.setOnClickListener {
            initFragmento()
        }

        initFragmento()
    }
    var cont : Int = 0


    fun initFragmento(){
        var colores = ArrayList<Int>()
        colores.add(R.color.colorUno)
        colores.add(R.color.colorDos)
        colores.add(R.color.colorTres)

        var bundle = Bundle()
        bundle.putInt("i", colores[cont])

        var fragment2 = Fragmento2()
        fragment2.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.secundario, fragment2).commit()
        ++cont
        if (cont == colores.size){
            cont = 0
        }


    }
    fun initFragmento2(){
        tv_colorponer.setBackgroundResource(R.color.colorDos)
        var coloress = ArrayList<Int>()
        coloress.add(R.color.colorUno)
        coloress.add(R.color.colorDos)
        coloress.add(R.color.colorTres)


        var bundle = Bundle()
        bundle.putInt("i", coloress[cont])

        var fragment2 = Fragmento2()
        fragment2.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.secundario, fragment2).commit()

        --cont
        if (cont == -1){
            cont = coloress.size-1
        }
    }

}
