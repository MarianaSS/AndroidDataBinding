package br.com.alura.ceep.ui.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import br.com.alura.ceep.ui.extensions.carregaImagem

@BindingAdapter("carregaImagem")
fun ImageView.carregaImagemViaUrl(url: String) {
    carregaImagem(url)
}