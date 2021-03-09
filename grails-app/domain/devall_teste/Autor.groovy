package devall_teste

class Autor {

    Boolean admin
    String facebook
    String facebookid
    // String hasSenha
    String miniBiografia
    String nome
    String email
    String twitter
    Date dataCadastro

    static hasMany = [site:Site]

    static mapping = {
        table 'autor'
        miniBiografia column: 'mini_biografia'
        // hasSenha column: 'has_senha'
        dataCadastro column: 'data_cadastro'
    }

    static constraints = {
        admin nullable:true
        facebook nullable:true, blank:true, unique:true
        facebookid nullable:true, blank:true, maxSize:64
        // hasSenha nullable:false, blank:false, maxSize:64
        miniBiografia nullable:true, blank:true, maxSize:1024
        nome nullable:false, blank:false, maxSize:128
        email nullable:false, blank:false, maxSize:128, unique:true
        twitter nullable:true, blank:true, maxSize:64
        dataCadastro nullable:false, blank:false
    }

}
