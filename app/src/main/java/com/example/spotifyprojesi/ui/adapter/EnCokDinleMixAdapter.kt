package com.example.spotifyprojesi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spotifyprojesi.data.entity.EnCokDinleMix
import com.example.spotifyprojesi.data.entity.Playlist
import com.example.spotifyprojesi.databinding.CardTasarimBinding
import com.example.spotifyprojesi.databinding.EncokTasarimBinding


class EnCokDinleMixAdapter (var mContext: Context, var EnCokDinleMixListesi:List<EnCokDinleMix>)
    : RecyclerView.Adapter<EnCokDinleMixAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim: EncokTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu{
        val binding = EncokTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val encokdinle = EnCokDinleMixListesi.get(position)
        val y = holder.tasarim


        y.imageViewEnCokDinle.setImageResource(mContext.resources.getIdentifier(encokdinle.resim, "drawable", mContext.packageName))
        y.textViewEnCokDinleBaslik.text = encokdinle.baslik
        y.textViewEnCokDinleAciklama.text = encokdinle.aciklama

    }




    override fun getItemCount(): Int {
        return EnCokDinleMixListesi.size

    }
}