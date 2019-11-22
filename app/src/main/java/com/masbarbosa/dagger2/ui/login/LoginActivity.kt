package com.masbarbosa.dagger2.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.masbarbosa.dagger2.R
import com.masbarbosa.dagger2.models.User
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : ILoginView, AppCompatActivity() {

    val mILoginPresenter = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val user = User.User(1, "Marco", "marcobarbosa")

        editText_email.setText("ola")


    }
}
