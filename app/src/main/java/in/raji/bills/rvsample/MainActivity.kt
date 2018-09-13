package `in`.raji.bills.rvsample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setOnClickListener(View.OnClickListener {
            val intent : Intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        })
    }
}
