package com.example.ejercicioadapterbasico

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicioadapterbasico.databinding.ItemTextoBinding

class TextoAdapter :RecyclerView.Adapter<TextoAdapter.TextoViewHolder>(){

    class TextoViewHolder(var itemBinding : ItemTextoBinding) : RecyclerView.ViewHolder(itemBinding.root)

    override fun getItemCount(): Int {  //Aqui se indica el numero de cosas que queremos mostrar
        return 50
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextoViewHolder {  //Como crear cada cosa que queremos
        var binding = ItemTextoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TextoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TextoViewHolder, position: Int) { //indicamos el contenido

        if(position%2==0){
            holder.itemBinding.layoutPrincipal.setBackgroundColor(ContextCompat.getColor(holder.itemBinding.root.context,R.color.purple_500))
            holder.itemBinding.text.text = "Soy par y estoy en la pos : $position"
        }
        else{
            holder.itemBinding.layoutPrincipal.setBackgroundColor(ContextCompat.getColor(holder.itemBinding.root.context,R.color.design_default_color_error))
            holder.itemBinding.text.text = "Soy impar y estoy en la pos : $position"
        }

    }


}