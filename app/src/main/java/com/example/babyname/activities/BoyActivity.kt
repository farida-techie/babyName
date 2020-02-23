package com.example.babyname.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.babyname.*
import com.example.babyname.boynamesFragment.*
import kotlinx.android.synthetic.main.activity_boy.*

class BoyActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boy)





        loadA1(A1Fragment())
        btnA1.setOnClickListener {
            loadA1(A1Fragment())

        }
        btnB1.setOnClickListener {
            loadB1(B1Fragment())
        }

        btnC1.setOnClickListener {
            loadC1(C1Fragment())
        }

        btnD1.setOnClickListener {
            loadD1(D1Fragment())
        }

        btnE1.setOnClickListener {
            loadE1(E1Fragment())
        }

        btnF1.setOnClickListener {
            loadF1(F1Fragment())
        }
        btnG1.setOnClickListener {
            loadG1(G1Fragment())

        }
        btnH1.setOnClickListener {
            loadH1(H1Fragment())
        }

        btnI1.setOnClickListener {
            loadI1(I1Fragment())
        }

        btnJ1.setOnClickListener {
            loadJ1(J1Fragment())
        }

        btnK1.setOnClickListener {
            loadK1(K1Fragment())
        }

        btnL1.setOnClickListener {
            loadL1(L1Fragment())
        }
        btnM1.setOnClickListener {
            loadM1(M1Fragment())

        }
        btnN1.setOnClickListener {
            loadN1(N1Fragment())
        }

        btnO1.setOnClickListener {
            loadO1(O1Fragment())
        }

        btnP1.setOnClickListener {
            loadP1(P1Fragment())
        }

        btnQ1.setOnClickListener {
            loadQ1(Q1Fragment())
        }

        btnR1.setOnClickListener {
            loadR1(R1Fragment())
        }

        btnS1.setOnClickListener {
            loadS1(S1Fragment())

        }
        btnT1.setOnClickListener {
            loadT1(T1Fragment())
        }

        btnU1.setOnClickListener {
            loadU1(U1Fragment())
        }

        btnV1.setOnClickListener {
            loadV1(V1Fragment())
        }

        btnW1.setOnClickListener {
            loadW1(W1Fragment())
        }

        btnX1.setOnClickListener {
            loadX1(X1Fragment())
        }
        btnY1.setOnClickListener {
            loadY1(Y1Fragment())
        }

        btnZ1.setOnClickListener {
            loadZ1(Z1Fragment())
        }






    }


    private fun loadA1(frag1 : A1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag1)
        ft.commit()
    }


    private fun loadB1(frag2 : B1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag2)
        ft.commit()
    }


    private fun loadC1(frag3 : C1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag3)
        ft.commit()
    }


    private fun loadD1(frag4 : D1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag4)
        ft.commit()
    }

    private fun loadE1(frag5 : E1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag5)
        ft.commit()
    }


    private fun loadF1(frag6 : F1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag6)
        ft.commit()
    }


    private fun loadG1(frag7 : G1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag7)
        ft.commit()
    }


    private fun loadH1(frag8 : H1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag8)
        ft.commit()
    }

    private fun loadI1(frag9 : I1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag9)
        ft.commit()
    }


    private fun loadJ1(frag10 : J1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag10)
        ft.commit()
    }


    private fun loadK1(frag11 : K1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag11)
        ft.commit()
    }


    private fun loadL1(frag12 : L1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag12)
        ft.commit()
    }

    private fun loadM1(frag13 : M1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag13)
        ft.commit()
    }


    private fun loadN1(frag14 : N1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag14)
        ft.commit()
    }


    private fun loadO1(frag15 : O1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag15)
        ft.commit()
    }


    private fun loadP1(frag16 : P1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag16)
        ft.commit()
    }
    private fun loadQ1(frag17 : Q1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag17)
        ft.commit()
    }


    private fun loadR1(frag18 : R1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag18)
        ft.commit()
    }


    private fun loadS1(frag19 : S1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag19)
        ft.commit()
    }


    private fun loadT1(frag20 : T1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag20)
        ft.commit()
    }

    private fun loadU1(frag21 : U1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag21)
        ft.commit()
    }


    private fun loadV1(frag22 : V1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag22)
        ft.commit()
    }


    private fun loadW1(frag23 : W1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag23)
        ft.commit()
    }


    private fun loadX1(frag24 : X1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag24)
        ft.commit()
    }

    private fun loadY1(frag25 : Y1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag25)
        ft.commit()
    }


    private fun loadZ1(frag26 : Z1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag26)
        ft.commit()
    }






    }






