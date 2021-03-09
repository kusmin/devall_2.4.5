package devall_teste

class TokenNovaSenha {

    String codigo
    Date dataCadastro
    Date dataProcessamento

    static mapping = {
        table 'token_nova_senha'
        dataCadastro column: 'data_cadastro'
        dataProcessamento column: 'data_processamento'
    }

    static belongsTo = [autor:Autor]

    static constraints = {
        codigo nullable:false, blank:false, unique:true, maxSize:64
        dataCadastro nullable:false
        dataProcessamento nullable:false
    }

}
