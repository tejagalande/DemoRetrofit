package com.example.demoretrofit.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.demoretrofit.Model.Question
import com.example.demoretrofit.R
import kotlinx.android.synthetic.main.question_item.view.*

class ListAdapter(private val context : Context, private val mQuestion : List<Question>, private val mRow : Int) : RecyclerView.Adapter<ListAdapter.QuestionHolder>(){
    class QuestionHolder(private var view : View): RecyclerView.ViewHolder(view) {

        var positionNumber = view.positionNumber
        var title = view.title
        var link = view.link
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.QuestionHolder {
        val view = LayoutInflater.from(parent.context).inflate(mRow, parent, false)
        return QuestionHolder(view)
    }


    override fun onBindViewHolder(holder: QuestionHolder, position: Int) {
        holder.positionNumber?.text = context.resources.getString(R.string.questionNum)
        holder.title?.text = context.resources.getString(R.string.questionTitle, mQuestion[position].title)
        holder.link?.text = context.resources.getString(R.string.questionLink,mQuestion[position].link)

        holder.itemView.setOnClickListener {
            Toast.makeText(this,holder.title ,Toast.LENGTH_SHORT)
        }
    }

    override fun getItemCount(): Int {
        return mQuestion.size

    }



}

