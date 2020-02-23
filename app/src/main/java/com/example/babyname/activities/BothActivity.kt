package com.example.babyname.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.babyname.R
import com.example.babyname.bothfragment.*
import com.example.babyname.girlsFragment.*
import kotlinx.android.synthetic.main.activity_both.*
import kotlinx.android.synthetic.main.activity_girl.*

class BothActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_both)


        loadA2(A2Fragment())
        btnA2.setOnClickListener {
            loadA2(A2Fragment())

        }
        btnB2.setOnClickListener {
            loadB2(B2Fragment())
        }

        btnC2.setOnClickListener {
            loadC2(C2Fragment())
        }

        btnD2.setOnClickListener {
            loadD2(D2Fragment())
        }

        btnE2.setOnClickListener {
            loadE2(E2Fragment())
        }

        btnF2.setOnClickListener {
            loadF2(F2Fragment())
        }
        btnG2.setOnClickListener {
            loadG2(G2Fragment())

        }
        btnH2.setOnClickListener {
            loadH2(H2Fragment())
        }

        btnI2.setOnClickListener {
            loadI2(I2Fragment())
        }

        btnJ2.setOnClickListener {
            loadJ2(J2Fragment())
        }

        btnK2.setOnClickListener {
            loadK2(K2Fragment())
        }

        btnL2.setOnClickListener {
            loadL2(L2Fragment())
        }
        btnM2.setOnClickListener {
            loadM2(M2Fragment())

        }
        btnN2.setOnClickListener {
            loadN2(N2Fragment())
        }

        btnO2.setOnClickListener {
            loadO2(O2Fragment())
        }

        btnP2.setOnClickListener {
            loadP2(P2Fragment())
        }

        btnQ2.setOnClickListener {
            loadQ2(Q2Fragment())
        }

        btnR2.setOnClickListener {
            loadR2(R2Fragment())
        }

        btnS2.setOnClickListener {
            loadS2(S2Fragment())

        }
        btnT2.setOnClickListener {
            loadT2(T2Fragment())
        }

        btnU2.setOnClickListener {
            loadU2(U2Fragment())
        }

        btnV2.setOnClickListener {
            loadV2(V2Fragment())
        }

        btnW2.setOnClickListener {
            loadW2(W2Fragment())
        }

        btnX2.setOnClickListener {
            loadX2(X2Fragment())
        }
        btnY2.setOnClickListener {
            loadY2(Y2Fragment())
        }

        btnZ2.setOnClickListener {
            loadZ2(Z2Fragment())
        }






    }





    private fun loadA2(frag1 : A2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag1)
        ft.commit()
    }


    private fun loadB2(frag2 : B2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag2)
        ft.commit()
    }


    private fun loadC2(frag3 : C2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag3)
        ft.commit()
    }


    private fun loadD2(frag4 : D2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag4)
        ft.commit()
    }

    private fun loadE2(frag5 : E2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag5)
        ft.commit()
    }


    private fun loadF2(frag6 : F2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag6)
        ft.commit()
    }


    private fun loadG2(frag7 : G2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag7)
        ft.commit()
    }


    private fun loadH2(frag8 : H2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag8)
        ft.commit()
    }

    private fun loadI2(frag9 : I2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag9)
        ft.commit()
    }


    private fun loadJ2(frag10 : J2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag10)
        ft.commit()
    }


    private fun loadK2(frag11 : K2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag11)
        ft.commit()
    }


    private fun loadL2(frag12 : L2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag12)
        ft.commit()
    }

    private fun loadM2(frag13 : M2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag13)
        ft.commit()
    }


    private fun loadN2(frag14 : N2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag14)
        ft.commit()
    }


    private fun loadO2(frag15 : O2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag15)
        ft.commit()
    }


    private fun loadP2(frag16 : P2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag16)
        ft.commit()
    }
    private fun loadQ2(frag17 : Q2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag17)
        ft.commit()
    }


    private fun loadR2(frag18 : R2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag18)
        ft.commit()
    }


    private fun loadS2(frag19 : S2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag19)
        ft.commit()
    }


    private fun loadT2(frag20 : T2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag20)
        ft.commit()
    }

    private fun loadU2(frag21 : U2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag21)
        ft.commit()
    }


    private fun loadV2(frag22 : V2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag22)
        ft.commit()
    }


    private fun loadW2(frag23 : W2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag23)
        ft.commit()
    }


    private fun loadX2(frag24 : X2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag24)
        ft.commit()
    }

    private fun loadY2(frag25 : Y2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag25)
        ft.commit()
    }


    private fun loadZ2(frag26 : Z2Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment1,frag26)
        ft.commit()
    }
}