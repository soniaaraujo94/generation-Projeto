package paulo.antonio.task04.model

data class Produtos(
    var id: Long,
    var imagem: String,
    var nomeProduto: String,
    var pesoGrama: String,
    var valorGrama: String,
    var descricao: String,
    var categoria: Categoria){

}