tokopackage id.ad.unpas.sab.profileku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    lateinit var buttonProfile: Button
    lateinit var buttonGallery: Button
    lateinit var buttonContact: Button
    lateinit var buttonSetting: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        memanggil profile saat aplikasi pertama dicreate
        changeContent(ProfileFragment.newInstance(this))
        buttonProfile = findViewById<View>(R.id.btn_profile) as Button
        buttonGallery = findViewById<View>(R.id.btn_gallery) as Button
        buttonContact = findViewById<View>(R.id.btn_contact) as Button
        buttonSetting = findViewById<View>(R.id.btn_setting) as Button

//        action pada tombol profile
        buttonProfile.setOnClickListener { changeContent(ProfileFragment.newInstance( this@MainActivity)) }

//        action pada tombol gallery
        buttonGallery.setOnClickListener { changeContent(GalleryFragment.newInstance( this@MainActivity)) }

//        action pada tombol contact
        buttonContact.setOnClickListener { changeContent(ContactFragment.newInstance( this@MainActivity)) }

//        action pada tombol setting
        buttonSetting.setOnClickListener { changeContent(SettingFragment.newInstance( this@MainActivity)) }
    }

    fun changeContent(fragment: Fragment?) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment!!).commitAllowingStateLoss()
    }
}