package devall_teste

class BlogPost {

    // static belongsTo = [clique:Clique] //site:Site

    long favoritos
    long comentarios
    int  cliques
    int votosNegativos
    int votosPositivos
    int tentativas
    Date dataPublicacao
    Date dataInclusao
    Date dataExposicao
    String resumo
    String url
    String titulo
    String thumbnail
    Boolean ativo

    static mapping = {
        table 'blog_post'
        votosNegativos column: 'votos_negativos'
        votosPositivos column: 'votos_positivos'
        dataPublicacao column: 'data_publicacao'
        dataInclusao column: 'data_inclusao'
        dataExposicao column: 'data_exposicao'
    }

    static constraints = {
        cliques nullable:false
        comentarios nullable:true
        votosNegativos nullable:false
        votosPositivos nullable:false
        tentativas nullable:true
        dataPublicacao nullable:false
        dataExposicao nullable:false
        dataInclusao nullable:false
        resumo nullable:false, blank:false, maxSize:200
        url nullable:false, maxSize:1024
        titulo nullable:false, blank:false, maxSize:1024
        thumbnail nullable:true, maxSize:1024
        ativo nullable:false
    }

}
