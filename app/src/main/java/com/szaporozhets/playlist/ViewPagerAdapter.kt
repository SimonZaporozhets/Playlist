package com.szaporozhets.playlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.szaporozhets.playlist.databinding.ViewPagerItemBinding

class ViewPagerAdapter(private val mList: List<SongUiModel>) :
    RecyclerView.Adapter<SongViewHolder>() {

    private val songs = mList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val itemBinding =
            ViewPagerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SongViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = songs.size

    override fun onBindViewHolder(holderSong: SongViewHolder, position: Int) {
        val song = songs[position]

        with(holderSong.binding) {
            songImage.setImageDrawable(
                ContextCompat.getDrawable(
                    holderSong.itemView.context,
                    song.songImage
                )
            )
            songTitle.text = holderSong.itemView.context.resources.getString(song.songName)
            songAuthor.text = holderSong.itemView.context.resources.getString(song.songAuthor)
        }

    }
}

class SongViewHolder(val binding: ViewPagerItemBinding) : RecyclerView.ViewHolder(binding.root)