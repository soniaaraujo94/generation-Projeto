package paulo.antonio.task04

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import paulo.antonio.task04.api.Repository
import paulo.antonio.task04.model.Categoria
import paulo.antonio.task04.model.Produtos
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
): ViewModel() {

    var _myCategoriaResponse = MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
        _myCategoriaResponse

    init {
        //listCategoria()
    }

    fun listCategoria(){
        viewModelScope.launch {
            try {
                val response = repository.listCategoria()
                _myCategoriaResponse.value = response
            } catch (e: Exception){
                Log.d("ErroRequisição", e.message.toString())
            }
        }
    }

    fun addProduto(produtos: Produtos){
        viewModelScope.launch {
            try{
                repository.addProduto(produtos)
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }
}