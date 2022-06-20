package paulo.antonio.task04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import paulo.antonio.task04.adapter.ProdutosAdapter
import paulo.antonio.task04.databinding.FragmentListagemProdutosBinding
import paulo.antonio.task04.model.Produtos


class ListagemProdutosFragment : Fragment() {

    private lateinit var binding: FragmentListagemProdutosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentListagemProdutosBinding.inflate(layoutInflater, container, false)

        val adapter = ProdutosAdapter()

        binding.recyclerProdutos.adapter = adapter
        binding.recyclerProdutos.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerProdutos.setHasFixedSize(true)

        // Navegar para o próximo fragment
        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listagemProdutosFragment_to_cadastrarProdutosFragment)
        }
        return binding.root
    }


}