package devall_teste

class VotoBlogPost {

    Boolean positivo = false
    Date dataCadastro

    static mapping = {
        table 'voto_blog_post'
        dataCadastro column: 'data_cadastro'
    }

    static belongsTo = [autor:Autor, blog:BlogPost]

    static constraints = {
        positivo nullable:false
        dataCadastro nullable:false
    }

}
