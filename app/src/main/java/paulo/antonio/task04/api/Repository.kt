package paulo.antonio.task04.api

import paulo.antonio.task04.model.Categoria
import paulo.antonio.task04.model.Produtos
import retrofit2.Response

class Repository {

        suspend fun listCategoria(): Response<List<Categoria>> {
                return RetrofitInstance.api.listCategoria()
        }

        suspend fun addProduto(produtos: Produtos): Response<Produtos>{
                return RetrofitInstance.api.addProduto(produtos)
        }
}