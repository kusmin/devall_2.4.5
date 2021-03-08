package devall_teste

class BlogPostFavorito {

    static belongsTo = [autor:Autor, post:BlogPost]

    Date dataCadastro

    static mapping = {
        table 'blog_post_favorito'
        dataCadastro column: 'data_cadastro'
    }

    static constraints = {
        dataCadastro nullable:false
    }

}
