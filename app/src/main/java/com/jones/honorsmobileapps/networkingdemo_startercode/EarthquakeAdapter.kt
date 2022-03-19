package com.jones.honorsmobileapps.networkingdemo_startercode

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jones.honorsmobileapps.networkingdemo_startercode.databinding.ListItemLayoutBinding


class EarthquakeAdapter(val earthquakes: List<Earthquake>) : RecyclerView.Adapter<EarthquakeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EarthquakeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
         val binding = ListItemLayoutBinding.inflate(layoutInflater, parent, false)
        return EarthquakeViewHolder(binding)

    }

    override fun onBindViewHolder(holder: EarthquakeViewHolder, position: Int) {
        val earthquake = earthquakes[position]
        holder.bindEarthquake(earthquake)
    }

    override fun getItemCount(): Int {
        return earthquakes.size
    }
}

