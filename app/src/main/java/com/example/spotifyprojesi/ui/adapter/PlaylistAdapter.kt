package com.example.spotifyprojesi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spotifyprojesi.data.entity.Playlist
import com.example.spotifyprojesi.databinding.CardTasarimBinding

class PlaylistAdapter (var mContext: Context, var playlistListesi:List<Playlist>)
    : RecyclerView.Adapter<PlaylistAdapter.CardTasarimTutucu>() {
        inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
            val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
            return CardTasarimTutucu(binding)
        }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {//0,1,2
            val playlist = playlistListesi.get(position)
            val t = holder.tasarim

            t.imageViewPlaylist.setImageResource(mContext.resources.getIdentifier(playlist.resim, "drawable", mContext.packageName))
            t.textViewPlaylist.text = "${playlist.ad}"

        }


    override fun getItemCount(): Int {
            return playlistListesi.size

    }
}