package `in`.raji.bills.rvsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.second.*

class SecondActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)
        val linearLayoutManager : LinearLayoutManager= LinearLayoutManager(this)
        linearLayoutManager.orientation=LinearLayoutManager.VERTICAL
        rv.layoutManager=linearLayoutManager
        rv.adapter=MyAdapter(this,nameList.list)

    }
}