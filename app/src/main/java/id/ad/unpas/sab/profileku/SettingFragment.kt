package id.ad.unpas.sab.profileku

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SettingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(mainActivity).inflate(R.layout.fragment_setting, container, false)
    }

    companion object {
        lateinit var mainActivity: MainActivity
        fun newInstance(activity: MainActivity): SettingFragment {
            mainActivity = activity
            return SettingFragment()
        }
    }
}