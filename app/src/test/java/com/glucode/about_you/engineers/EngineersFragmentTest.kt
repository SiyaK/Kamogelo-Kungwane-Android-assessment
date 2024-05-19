package com.glucode.about_you.engineers

import android.view.MenuItem
import com.glucode.about_you.mockdata.MockData
import org.junit.Assert.*
import org.junit.Test

import org.mockito.Mockito


class EngineersFragmentTest {
//
//    @Test
//    fun testOnOptionsItemSelected() {
//        val fragment = EngineersFragment()
//        val itemYears = Mockito.mock(MenuItem::class.java)
//        val itemCoffees = Mockito.mock(MenuItem::class.java)
//        val itemBugs = Mockito.mock(MenuItem::class.java)
//
//        // Mock the list of engineers
//        val engineers = MockData.engineers
//
//        // Set up the engineers list in the fragment
//        fragment.setUpEngineersList(engineers)
//
//        // Test sorting by years
//        fragment.onOptionsItemSelected(itemYears)
//        val sortedByYears = engineers.sortedBy { it.quickStats.years }
//        val sortedEngineersYears = (fragment.binding.list.adapter as EngineersRecyclerViewAdapter).engineers
//        assertEquals(sortedByYears, sortedEngineersYears)
//
//        // Test sorting by coffees
//        fragment.onOptionsItemSelected(itemCoffees)
//        val sortedByCoffees = engineers.sortedBy { it.quickStats.coffees }
//        val sortedEngineersCoffees = (fragment.binding.list.adapter as EngineersRecyclerViewAdapter).engineers
//        assertEquals(sortedByCoffees, sortedEngineersCoffees)
//
//        // Test sorting by bugs
//        fragment.onOptionsItemSelected(itemBugs)
//        val sortedByBugs = engineers.sortedBy { it.quickStats.bugs }
//        val sortedEngineersBugs = (fragment.binding.list.adapter as EngineersRecyclerViewAdapter).engineers
//        assertEquals(sortedByBugs, sortedEngineersBugs)
//    }

    @Test
    fun onCreateView() {
    }

    @Test
    fun onCreateOptionsMenu() {
    }

    @Test
    fun onOptionsItemSelected() {
    }



}