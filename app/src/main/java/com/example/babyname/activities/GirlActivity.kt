package com.example.babyname.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.babyname.R
import com.example.babyname.boynamesFragment.*
import com.example.babyname.girlsFragment.*
import kotlinx.android.synthetic.main.activity_boy.*
import kotlinx.android.synthetic.main.activity_girl.*

class GirlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_girl)


        loadA3(A3Fragment())
        btnA3.setOnClickListener {
            loadA3(A3Fragment())

        }
        btnB3.setOnClickListener {
            loadB3(B3Fragment())
        }

        btnC3.setOnClickListener {
            loadC3(C3Fragment())
        }

        btnD3.setOnClickListener {
            loadD3(D3Fragment())
        }

        btnE3.setOnClickListener {
            loadE3(E3Fragment())
        }

        btnF3.setOnClickListener {
            loadF3(F3Fragment())
        }
        btnG3.setOnClickListener {
            loadG3(G3Fragment())

        }
        btnH3.setOnClickListener {
            loadH3(H3Fragment())
        }

        btnI3.setOnClickListener {
            loadI3(I3Fragment())
        }

        btnJ3.setOnClickListener {
            loadJ3(J3Fragment())
        }

        btnK3.setOnClickListener {
            loadK3(K3Fragment())
        }

        btnL3.setOnClickListener {
            loadL3(L3Fragment())
        }
        btnM3.setOnClickListener {
            loadM3(M3Fragment())

        }
        btnN3.setOnClickListener {
            loadN3(N3Fragment())
        }

        btnO3.setOnClickListener {
            loadO3(O3Fragment())
        }

        btnP3.setOnClickListener {
            loadP3(P3Fragment())
        }

        btnQ3.setOnClickListener {
            loadQ3(Q3Fragment())
        }

        btnR3.setOnClickListener {
            loadR3(R3Fragment())
        }

        btnS3.setOnClickListener {
            loadS3(S3Fragment())

        }
        btnT3.setOnClickListener {
            loadT3(T3Fragment())
        }

        btnU3.setOnClickListener {
            loadU3(U3Fragment())
        }

        btnV3.setOnClickListener {
            loadV3(V3Fragment())
        }

        btnW3.setOnClickListener {
            loadW3(W3Fragment())
        }

        btnX3.setOnClickListener {
            loadX3(X3Fragment())
        }
        btnY3.setOnClickListener {
            loadY3(Y3Fragment())
        }

        btnZ3.setOnClickListener {
            loadZ3(Z3Fragment())
        }






    }





    private fun loadA3(frag1 : A3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag1)
        ft.commit()
    }


    private fun loadB3(frag2 : B3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag2)
        ft.commit()
    }


    private fun loadC3(frag3 : C3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag3)
        ft.commit()
    }


    private fun loadD3(frag4 : D3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag4)
        ft.commit()
    }

    private fun loadE3(frag5 : E3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag5)
        ft.commit()
    }


    private fun loadF3(frag6 : F3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag6)
        ft.commit()
    }


    private fun loadG3(frag7 : G3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag7)
        ft.commit()
    }


    private fun loadH3(frag8 : H3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag8)
        ft.commit()
    }

    private fun loadI3(frag9 : I3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag9)
        ft.commit()
    }


    private fun loadJ3(frag10 : J3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag10)
        ft.commit()
    }


    private fun loadK3(frag11 : K3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag11)
        ft.commit()
    }


    private fun loadL3(frag12 : L3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag12)
        ft.commit()
    }

    private fun loadM3(frag13 : M3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag13)
        ft.commit()
    }


    private fun loadN3(frag14 : N3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag14)
        ft.commit()
    }


    private fun loadO3(frag15 : O3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag15)
        ft.commit()
    }


    private fun loadP3(frag16 : P3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag16)
        ft.commit()
    }
    private fun loadQ3(frag17 : Q3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag17)
        ft.commit()
    }


    private fun loadR3(frag18 : R3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag18)
        ft.commit()
    }


    private fun loadS3(frag19 : S3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag19)
        ft.commit()
    }


    private fun loadT3(frag20 : T3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag20)
        ft.commit()
    }

    private fun loadU3(frag21 : U3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag21)
        ft.commit()
    }


    private fun loadV3(frag22 : V3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag22)
        ft.commit()
    }


    private fun loadW3(frag23 : W3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag23)
        ft.commit()
    }


    private fun loadX3(frag24 : X3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag24)
        ft.commit()
    }

    private fun loadY3(frag25 : Y3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag25)
        ft.commit()
    }


    private fun loadZ3(frag26 : Z3Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment2,frag26)
        ft.commit()
    }



}