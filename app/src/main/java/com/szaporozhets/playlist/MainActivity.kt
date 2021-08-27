package com.szaporozhets.playlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.szaporozhets.playlist.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list: MutableList<SongUiModel> = initList()

        binding.viewPager.setPageTransformer(DepthPageTransformer())

        binding.viewPager.adapter = ViewPagerAdapter(list.shuffled())
    }

    private fun initList(): MutableList<SongUiModel> {
        return mutableListOf(
            SongUiModel(R.drawable.bee_6518669_640, R.string.song1_name, R.string.song1_author),
            SongUiModel(R.drawable.boat_6561172_640, R.string.song2_name, R.string.song2_author),
            SongUiModel(R.drawable.castle_6566978_640, R.string.song3_name, R.string.song3_author),
            SongUiModel(R.drawable.cat_6568422_640, R.string.song4_name, R.string.song4_author),
            SongUiModel(
                R.drawable.daffodils_6523446_640,
                R.string.song5_name,
                R.string.song5_author
            ),
            SongUiModel(R.drawable.hill_5419527_640, R.string.song6_name, R.string.song6_author),
            SongUiModel(R.drawable.hop_6327065_640, R.string.song7_name, R.string.song7_author),
            SongUiModel(R.drawable.iris_5350997_640, R.string.song8_name, R.string.song8_author),
            SongUiModel(
                R.drawable.mountains_6564997_640,
                R.string.song9_name,
                R.string.song9_author
            ),
            SongUiModel(R.drawable.nature_6567542_640, R.string.song10_name, R.string.song10_author)
        )
    }
}