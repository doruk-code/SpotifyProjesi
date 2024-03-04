package com.example.spotifyprojesi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.spotifyprojesi.data.entity.EnCokDinleMix
import com.example.spotifyprojesi.data.entity.Playlist
import com.example.spotifyprojesi.databinding.FragmentAnasayfaBinding
import com.example.spotifyprojesi.ui.adapter.EnCokDinleMixAdapter
import com.example.spotifyprojesi.ui.adapter.PlaylistAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        val Playlist = ArrayList<Playlist>()
        val p1 = Playlist(1,"GYM Playlist","resim1")
        val p2 = Playlist(2,"Gece Playlist","resim2")
        val p3 = Playlist(3,"Chill Playlist","resim3")
        val p4 = Playlist(4,"Party Playlist","resim4")
        val p5 = Playlist(5,"Uyku Playlist","resim5")
        val p6 = Playlist(6,"Mixy Playlist","resim6")
        val p7 = Playlist(7,"Yola Playlist","resim7")
        val p8 = Playlist(8,"Koşu Playlist","resim8")
        Playlist.add(p1)
        Playlist.add(p2)
        Playlist.add(p3)
        Playlist.add(p4)
        Playlist.add(p5)
        Playlist.add(p6)
        Playlist.add(p7)
        Playlist.add(p8)


        var EnCokDinleMix = ArrayList<EnCokDinleMix>()
        var e1 = EnCokDinleMix(1,"En Çok Dinlenenler","resim1","En Çok Dinlenenler")
        var e2 = EnCokDinleMix(2,"Türkçe Pop","resim2","Türkçe Pop")
        var e3 = EnCokDinleMix(3,"Rap","resim3","Rap")
        var e4 = EnCokDinleMix(4,"Rock","resim4","Rock")
        var e5 = EnCokDinleMix(5,"Jazz","resim5","Jazz")
        var e6 = EnCokDinleMix(6,"Klasik","resim6","Klasik")
        var e7 = EnCokDinleMix(7,"Yabancı Pop","resim7","Yabancı Pop")

        EnCokDinleMix.add(e1)
        EnCokDinleMix.add(e2)
        EnCokDinleMix.add(e3)
        EnCokDinleMix.add(e4)
        EnCokDinleMix.add(e5)
        EnCokDinleMix.add(e6)
        EnCokDinleMix.add(e7)



        val PlaylistAdapter = PlaylistAdapter(requireContext(),Playlist)
        binding.playlistRv.adapter = PlaylistAdapter
        binding.playlistRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val EnCokDinleMixAdapter = EnCokDinleMixAdapter(requireContext(),EnCokDinleMix)
        binding.encokdinleRv.adapter = EnCokDinleMixAdapter
        binding.encokdinleRv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)













        return binding.root
    }


}