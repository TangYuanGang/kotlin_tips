package com.sw.kotlin.tip6

import android.app.Activity
import android.os.Bundle
import com.sw.kotlin.tips.R
/*
* 导入插件生成的View
* */
import kotlinx.android.synthetic.main.activity_tip6.*


class KotlinTip6 : Activity(){

    /*
    * 自动根据layout的id生成对应的view
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip6)
        tip6_tv.setText("Auto find view for TextView")
        tip6_img.setImageBitmap(null)
        tip6_btn.setOnClickListener{
            //todo sth
        }
    }

}
