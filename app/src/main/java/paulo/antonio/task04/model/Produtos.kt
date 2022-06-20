package paulo.antonio.task04.model

data class Produtos(
    var id: Long,
    var nomeProduto: String,
    var descricao: String,
    var imagem: String,
    var pesoGrama: String,
    var valorGrama: String,
    var categoria: Categoria){

}