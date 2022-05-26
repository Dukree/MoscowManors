package com.max.moscowmanors.ui


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.max.moscowmanors.*
import com.max.moscowmanors.domain.PrivacyPolicyMenu
import com.max.moscowmanors.data.ViewPagerAdapter


class MainActivity : AppCompatActivity() {

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var bar: androidx.appcompat.widget.Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("AAA","Activity created")

        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabes)
        bar = findViewById(R.id.toolbars)

        setSupportActionBar(bar)



        val adapter = ViewPagerAdapter(supportFragmentManager)

        title = "Усадьбы"
        adapter.addFragment(MoscowFragment())
        adapter.addFragment(SuburbMoscowFragment())
        tab.addTab(tab.newTab().setText("Москва"))

        tab.addTab(tab.newTab().setText("Подмосковье"))

        tab.tabGravity = TabLayout.GRAVITY_FILL


        pager.adapter = adapter


        //tab.setupWithViewPager(pager)

        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab))
        tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                pager.currentItem = tab.position


            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.nav_menu, menu)

        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.privacy_policy -> {
                val intent = Intent(this, PrivacyPolicyMenu::class.java)
                startActivity(intent)
            }
            R.id.feedback -> {
                val intent = Intent(this, Feedback::class.java)
                startActivity(intent)
            }
        }
                return super.onOptionsItemSelected(item)
        }




//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        //val viewModel: ItemViewModel by viewModels()
//        //val searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
//        menuInflater.inflate(R.menu.nav_menu,menu)
//
//
//
//        val search:MenuItem? = menu?.findItem(R.id.nav_search)
//        val searchView: SearchView = search?.actionView as SearchView
//        searchView.queryHint = "Введите название усадьбы"
//
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//
//                searchViewModel.filter.filter(newText)
//
//                return false
//            }
//
//        })
//
//        return super.onCreateOptionsMenu(menu)
//    }

    }







