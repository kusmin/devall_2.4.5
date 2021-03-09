package devall_teste

class Autor {

    Boolean admin
    String facebook
    String facebookid
    String hasSenha
    String miniBiografia
    String nome
    String email
    String twitter
    BigInteger version
    Date dataCadastro

    static hasMany = [blogPostFavorito:BlogPostFavorito, comentarioBlogPost:ComentarioBlogPost, votoBlogPost: VotoBlogPost]

    static mapping = {
        table 'autor'
        miniBiografia column: 'mini_biografia'
        hasSenha column: 'has_senha'
        dataCadastro column: 'data_cadastro'
    }

    static constraints = {
        admin nullable:true
        facebook nullable:true, blank:true, unique:true
        facebookid nullable:true, blank:true, maxSize:64
        hasSenha nullable:false, blank:false, maxSize:64
        miniBiografia nullable:true, blank:true, maxSize:1024
        nome nullable:false, blank:false, maxSize:128
        email nullable:false, blank:false, maxSize:128, unique:true
        twitter nullable:true, blank:true, maxSize:64
        version nullable:false, blank:false
        dataCadastro nullable:false, blank:false
    }

}
