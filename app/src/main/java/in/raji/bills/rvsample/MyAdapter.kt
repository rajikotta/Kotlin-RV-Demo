package `in`.raji.bills.rvsample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

class MyAdapter(val context: Context, val nameList: List<DataClass>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        p0.tvAnimalType.text = nameList.get(p1).name

    }

    override fun getItemCount(): Int {

        return nameList.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {

        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, p0, false))
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvAnimalType = itemView.textView2

    }
}