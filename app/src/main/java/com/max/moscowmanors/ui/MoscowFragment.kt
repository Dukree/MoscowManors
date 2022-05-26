package com.max.moscowmanors.ui

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.max.moscowmanors.domain.Manors
import com.max.moscowmanors.domain.ManorsDetails
import com.max.moscowmanors.data.MoscowAdapter
import com.max.moscowmanors.R

class MoscowFragment : Fragment() {

    //private lateinit var allManors: Manors
    companion object {
        val INTENT_PARCELABLE = "OBJ_INTENT"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        val viewModel : ItemViewModel by viewModels({requireParentFragment()})
//        viewModel.selectedItem.observe(viewLifecycleOwner, Observer { it ->
//            allManors.nameManors.lowercase()
//        })
        //al searchViewModel = ViewModelProvider(this).get(ViewModel::class.java)
        //searchViewModel.getQuery().observe(viewLifecycleOwner, Observer {
//            fun onChanged(s: String?){
//                if (s != null){
//
//                    allManors.nameManors.lowercase(Locale(s))
//                }
//            }
//
//        })
        // Inflate the layout for this fragment
       val  view = inflater.inflate(R.layout.fragment_moscow, container, false)
       val recyclerView = view.findViewById<RecyclerView>(R.id._recyclerview_moscow)

        if (recyclerView != null) recyclerView.layoutManager = GridLayoutManager(this.context, 2)
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true)
        }
        setHasOptionsMenu(true)
        val allManors = arrayOf(
            Manors(
                getString(R.string.altufievo),
                getString(R.string.address_altufievo),
                R.drawable.altufievo,
                getText(R.string.history_altufievo)
            ),
            Manors(
                getString(R.string.bratsevo),
                getString(R.string.adress_bratsevo),
                R.drawable.bratsevo,
                getText(R.string.history_bratsevo)
            ),
            Manors(
                getString(R.string.vasilievskoe),
                getString(R.string.address_vasilievskoe),
                R.drawable.mamonova_dacha,
                getText(R.string.history_vasilievskoe)
            ),
            Manors(
                getString(R.string.vinogradovo),
                getString(R.string.address_vinogradovo),
                R.drawable.vinogradovo,
                getText(R.string.history_vinogradovo)
            ),
            Manors(
                getString(R.string.vorontsovo),
                getString(R.string.address_vorontsovo),
                R.drawable.vorontsovo,
                getText(R.string.history_vorontsovo)
            ),
            Manors(
                getString(R.string.grachevka),
                getString(R.string.address_grachevka),
                R.drawable.grachevka,
                getText(R.string.history_grachevka)
            ),
            Manors(
                getString(R.string.znamenskoe_sadki),
                getString(R.string.address_znamenskoe_sadki),
                R.drawable.znamenskoe_sadki,
                getText(R.string.history_znamenskoe_sadki)
            ),
            Manors(
                getString(R.string.kuntsevo),
                getString(R.string.address_kuntsevo),
                R.drawable.kuntsevo,
                getText(R.string.history_kuntsevo)
            ),
            Manors(
                getString(R.string.kuzminki),
                getString(R.string.address_kuzminki),
                R.drawable.kuzminki,
                getText(R.string.history_kuzminki)
            ),
            Manors(
                getString(R.string.kuskovo),
                getString(R.string.address_kuskovo),
                R.drawable.kuskovo,
                getText(R.string.hystory_kuskovo)
            ),
            Manors(
                getString(R.string.lublino),
                getString(R.string.address_lublino),
                R.drawable.lublino,
                getText(R.string.history_lublino)
            ),
            Manors(
                getString(R.string.mihalkovo),
                getString(R.string.address_mihalkovo),
                R.drawable.mihalkovo,
                getText(R.string.history_mihalkovo)
            ),
            Manors(
                getString(R.string.neskuchnoe),
                getString(R.string.address_neskuchnoe),
                R.drawable.neskuchnoe,
                getText(R.string.history_neskuchnoe)
            ),
            Manors(
                getString(R.string.ostankino),
                getString(R.string.address_ostankino),
                R.drawable.ostankino,
                getText(R.string.history_ostankino)
            ),
            Manors(
                getString(R.string.petrovsko_razumovskoe),
                getString(R.string.address_petrovsko_razumovskoe),
                R.drawable.petrovsko_razumovskoe,
                getText(R.string.history_petrovsko_razumovskoe)
            ),
            Manors(
                getString(R.string.pokrovskoe_streshnevo),
                getString(R.string.address_pokrovskoe_streshnevo),
                R.drawable.pokrovskoe_streshnevo,
                getText(R.string.history_pokrovskoe_streshnevo)
            ),
            Manors(
                getString(R.string.sviblovo),
                getString(R.string.address_sviblovo),
                R.drawable.sviblovo,
                getText(R.string.history_sviblovo)
            ),
            Manors(
                getString(R.string.dacha_stroganova),
                getString(R.string.address_dacha_stroganova),
                R.drawable.dacha_stroganova,
                getText(R.string.history_dacha_stroganova)
            ),
            Manors(
                getString(R.string.uzkoe),
                getString(R.string.address_uzkoe),
                R.drawable.uzkoe,
                getText(R.string.history_uzkoe)
            ),
            Manors(
                getString(R.string.usachevo_naidenovo),
                getString(R.string.address_usachevo_naidenovo),
                R.drawable.usachevo_naidenovo,
                getText(R.string.history_usachevo_naidenovo)
            ),
            Manors(
                getString(R.string.cheremushki_znamenskoe),
                getString(R.string.address_cheremushki_znamenskoe),
                R.drawable.cheremushki_znamenskoe,
                getText(R.string.history_cheremushki_znamenskoe)
            ),
            Manors(
                getString(R.string.yasenevo),
                getString(R.string.address_yasenevo),
                R.drawable.yasenevo,
                getText(R.string.history_yasenevo)
            ),
        )

//        val searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
//        val userAdapter: ArrayAdapter<Manors> = ArrayAdapter(
//            requireContext(), android.R.layout.simple_list_item_1,allManors)
//        searchViewModel.getQuery().observe(viewLifecycleOwner, Observer {
//            userAdapter.filter.filter(allManors.toString())
//        })

        if (recyclerView != null) {

            recyclerView.adapter = MoscowAdapter(this, allManors) {
                val intent = Intent(this.context, ManorsDetails::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)
            }

        }


        return view

    }



}
