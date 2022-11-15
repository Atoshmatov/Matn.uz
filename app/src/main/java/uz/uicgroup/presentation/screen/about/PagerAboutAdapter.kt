package uz.uicgroup.presentation.screen.about

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.uicgroup.presentation.screen.about.pager.InfoPager
import uz.uicgroup.presentation.screen.about.pager.ParticipantsPager
import uz.uicgroup.presentation.screen.edit.pager.DictionaryPager
import uz.uicgroup.presentation.screen.edit.pager.EditorPage

class PagerAboutAdapter(fm: FragmentManager, lf: Lifecycle) : FragmentStateAdapter(fm, lf) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> InfoPager()
            else -> ParticipantsPager()
        }
    }
}