package devall_teste

class ComentarioBlogPost {

    Date data
    String mensagem
    String resposta

    static mapping = {
        table 'comentario_blog_post'
        resposta column: 'parent_id'
    }

    static belongsTo = [autor:Autor, post:BlogPost]

    static constraints = {
        data nullable:false
        mensagem nullable:false, blank:false, maxSize:1024
        resposta nullable:true
    }

}
