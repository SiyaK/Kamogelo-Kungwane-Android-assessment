package com.glucode.about_you.profileViews

import android.content.Context
import android.net.Uri
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.glucode.about_you.R

class ProfileView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val profileImageView: ImageView
    private val developerNameTextView: TextView
    private val developerRoleTextView: TextView
    private val developerBioTextView: TextView
    var listener: ProfileViewListener? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.view_profile, this, true)
        profileImageView = findViewById(R.id.profile_image)
        developerNameTextView = findViewById(R.id.name)
        developerRoleTextView = findViewById(R.id.role)
        developerBioTextView = findViewById(R.id.bio)

        profileImageView.setOnClickListener {
            listener?.onProfileImageClick()
        }
    }

    fun setProfileImage(uri: Uri) {
        profileImageView.setImageURI(uri)
    }

    fun setDeveloperName(name: String) {
        developerNameTextView.text = name
    }

    fun setDeveloperRole(role: String) {
        developerRoleTextView.text = role
    }

    fun setProfileViewListener(listener: ProfileViewListener) {
        this.listener = listener
    }

    interface ProfileViewListener {
        fun onProfileImageClick()
        fun onImageSelected(imageUri: Uri)
    }

    fun updateProfileImage(imageUri: Uri) {
        profileImageView.setImageURI(imageUri)
    }
}