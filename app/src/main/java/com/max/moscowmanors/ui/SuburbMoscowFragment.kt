package com.max.moscowmanors.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.max.moscowmanors.domain.Manors
import com.max.moscowmanors.domain.ManorsDetails
import com.max.moscowmanors.R
import com.max.moscowmanors.data.SuburbMoscowAdapter

class SuburbMoscowFragment : Fragment() {
        companion object{
        val INTENT_PARCELABLE = "OBJ_INTENT"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_suburb_moscow, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id._recyclerview_suburb_moscow)

        if (recyclerView != null) recyclerView.layoutManager = GridLayoutManager(this.context, 2)
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true)
        }
        setHasOptionsMenu(true)
        val allManors = listOf(
            Manors(getString(R.string.abramtsevo),getString(R.string.address_abramtsevo),
                R.drawable.abramtsevo,getText(R.string.history_abramtsevo)),
            Manors(getString(R.string.aleksandrovo_shapovo),getString(R.string.address_aleksandrovo_shapovo),
                R.drawable.aleksandrovo_shapovo,getText(R.string.history_aleksandrovo_shapovo)),
            Manors(getString(R.string.almazovo),getString(R.string.address_almazovo),
                R.drawable.almazovo,getText(R.string.history_almazovo)),
            Manors(getString(R.string.arhangelskoe),getString(R.string.address_arhangelskoe),
                R.drawable.arhangelskoe,getText(R.string.history_arhangelskoe)),
            Manors(getString(R.string.ahtirka),getString(R.string.address_ahtirka),
                R.drawable.ahtirka,getText(R.string.history_ahtirka)),
            Manors(getString(R.string.boblovo),getString(R.string.address_boblovo),
                R.drawable.boblovo,getText(R.string.history_boblovo)),
            Manors(getString(R.string.bikovo),getString(R.string.address_bikovo),
                R.drawable.bikovo,getText(R.string.history_bikovo)),
            Manors(getString(R.string.valuevo),getString(R.string.address_valuevo),
                R.drawable.valuevo,getText(R.string.history_valuevo)),
            Manors(getString(R.string.sherbatovih),getString(R.string.address_sherbatovih),
                R.drawable.vasilievskoe,getText(R.string.history_sherbatovih)),
            Manors(getString(R.string.vvedenskoe),getString(R.string.address_vvedenskoe),
                R.drawable.vvedenskoe,getText(R.string.history_vvedenskoe)),
            Manors(getString(R.string.volinshina),getString(R.string.address_volinshina),
                R.drawable.volinshina,getText(R.string.history_volinshina)),
            Manors(getString(R.string.vorobievo),getString(R.string.address_vorobievo),
                R.drawable.vorobievo,getText(R.string.history_vorobievo)),
            Manors(getString(R.string.voronovo),getString(R.string.address_voronovo),
                R.drawable.voronovo,getText(R.string.history_voronovo)),
            Manors(getString(R.string.viazemi),getString(R.string.address_viazemi),
                R.drawable.viazemi,getText(R.string.history_viazemi)),
            Manors(getString(R.string.glinki),getString(R.string.address_glinki),
                R.drawable.glinki,getText(R.string.history_glinki)),
            Manors(getString(R.string.gorenki),getString(R.string.address_gorenki),
                R.drawable.gorenki,getText(R.string.history_gorenki)),
            Manors(getString(R.string.gorki),getString(R.string.address_gorki),
                R.drawable.gorki,getText(R.string.history_gorki)),
            Manors(getString(R.string.grebnevo),getString(R.string.address_grebnevo),
                R.drawable.grebnevo,getText(R.string.history_grebnevo)),
            Manors(getString(R.string.darovoe),getString(R.string.address_darovoe),
                R.drawable.darovoe,getText(R.string.history_darovoe)),
            Manors(getString(R.string.dubrovici),getString(R.string.address_dubrovici),
                R.drawable.dubrovici,getText(R.string.history_dubrovici)),
            Manors(getString(R.string.ershovo),getString(R.string.address_ershovo),
                R.drawable.ershovo,getText(R.string.history_ershovo)),
            Manors(getString(R.string.zaharovo),getString(R.string.address_zaharovo),
                R.drawable.zaharovo,getText(R.string.history_zaharovo)),
            Manors(getString(R.string.znamenskoe_gubailovo),getString(R.string.address_zaharovo),
                R.drawable.znamenskoe_gubailovo,getText(R.string.history_znamenskoe_gubailovo)),
            Manors(getString(R.string.ivanovskoe),getString(R.string.address_ivanovskoe),
                R.drawable.ivanovskoe,getText(R.string.history_ivanovskoe)),
            Manors(getString(R.string.izvarino),getString(R.string.address_izvarino),
                R.drawable.izvarino,getText(R.string.history_izvarino)),
            Manors(getString(R.string.krivakino),getString(R.string.address_krivakino),
                R.drawable.krivakino,getText(R.string.history_krivakino)),
            Manors(getString(R.string.lopasnia_zachatievskoe),getString(R.string.address_lopasnia_zachatievskoe),
                R.drawable.lopasnia_zachatievskoe,getText(R.string.history_lopasnia_zachatievskoe)),
            Manors(getString(R.string.litkarino),getString(R.string.address_litkarino),
                R.drawable.litkarino,getText(R.string.history_litkarino)),
            Manors(getString(R.string.lubimovka),getString(R.string.address_lubimovka),
                R.drawable.lubimovka,getText(R.string.history_lubimovka)),
            Manors(getString(R.string.melihovo),getString(R.string.address_melihovo),
                R.drawable.melihovo,getText(R.string.history_melihovo)),
            Manors(getString(R.string.marfino),getString(R.string.address_marfino),
                R.drawable.marfino,getText(R.string.history_marfino)),
            Manors(getString(R.string.mesherskoe),getString(R.string.address_mesherskoe),
                R.drawable.mesherskoe,getText(R.string.history_mesherskoe)),
            Manors(getString(R.string.muranovo),getString(R.string.address_muranovo),
                R.drawable.muranovo,getText(R.string.history_muranovo)),
            Manors(getString(R.string.nikolskoe_gagarino),getString(R.string.address_nikolskoe_gagarino),
                R.drawable.nikolskoe_gagarino,getText(R.string.history_nikolskoe_gagarino)),
            Manors(getString(R.string.ostafievo),getString(R.string.address_ostafievo),
                R.drawable.ostafievo,getText(R.string.history_ostafievo)),
            Manors(getString(R.string.petrovo_dalnee),getString(R.string.address_petrovo_dalnee),
                R.drawable.petrovo_dalnee,getText(R.string.history_petrovo_dalnee)),
            Manors(getString(R.string.pehra_yakovlevskoe),getString(R.string.address_pehra_yakovlevskoe),
                R.drawable.pehra_yakovlevskoe,getText(R.string.history_pehra_yakovlevskoe)),
            Manors(getString(R.string.podlipichie),getString(R.string.address_podlipichie),
                R.drawable.podlipichie,getText(R.string.history_podlipichie)),
            Manors(getString(R.string.meiendorf),getString(R.string.address_meiendorf),
                R.drawable.meiendorf,getText(R.string.history_meiendorf)),
            Manors(getString(R.string.serednikovo),getString(R.string.address_serednikovo),
                R.drawable.serednikovo,getText(R.string.history_serednikovo)),
            Manors(getString(R.string.suhanovo),getString(R.string.address_suhanovo),
                R.drawable.suhanovo,getText(R.string.history_suhanovo)),
            Manors(getString(R.string.fryanovo),getString(R.string.address_fryanovo),
                R.drawable.fryanovo,getText(R.string.history_fryanovo)),
            Manors(getString(R.string.shahmatovo),getString(R.string.address_shahmatovo),
                R.drawable.shahmatovo,getText(R.string.history_shahmatovo)),
            Manors(getString(R.string.yaropolets),getString(R.string.address_yaropolets),
                R.drawable.yaropolets,getText(R.string.history_yaropolets))
        )

        if (recyclerView != null) {

            recyclerView.adapter = SuburbMoscowAdapter(this, allManors) {
                val intent = Intent(this.context, ManorsDetails::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)
            }
        }
        return view
    }

}