package com.ute.cuuhotulanh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.ute.cuuhotulanh.databinding.ActivityMainBinding
import com.ute.cuuhotulanh.ui.FavoritesFragment
import com.ute.cuuhotulanh.ui.FridgeFragment
import com.ute.cuuhotulanh.ui.home.HomeFragment
import com.ute.cuuhotulanh.ui.RecipeDetailFragment
import com.ute.cuuhotulanh.ui.RecipeListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(bars.left, bars.top, bars.right, bars.bottom)
            insets
        }

        if (savedInstanceState == null) showFragment(HomeFragment())

        binding.bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> showFragment(HomeFragment())
                R.id.nav_fridge -> showFragment(FridgeFragment())
                R.id.nav_favorite -> showFragment(FavoritesFragment())
                else -> return@setOnItemSelectedListener false
            }
            true
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
    private fun navigateToRecipeDetail(id : Int){
        val fragment = RecipeDetailFragment()

        val bundle = Bundle()
        bundle.putInt("id", id)
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
    private fun navigateToRecipeList(ingredients : List<String>){
        val fragment = RecipeListFragment()

        val bundle = Bundle()
        bundle.putStringArrayList("ingredients", ArrayList(ingredients))
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}