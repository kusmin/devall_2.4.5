package devall_teste

class Site {

    Boolean ativo = true
    int tentativas = 0

    Date ultimaVerificacao
    String endereco
    String nome
    String rss
    String sobre

    static belongsTo = [autor:Autor]

    static mapping = {
        table 'site'

        ultimaVerificacao column: 'ultima_verificacao'
    }

    static constraints = {
        ativo nullable:false

        tentativas nullable:false

        ultimaVerificacao nullable:true
        endereco nullable:false, blank:false, unique:true, maxSize:128
        nome nullable:false, unique:true, maxSize:128
        rss nullable:false, unique:true, maxSize:128
        sobre nullable:false, maxSize:255
    }

}
