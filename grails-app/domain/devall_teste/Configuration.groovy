package devall_teste

class Configuration {

    String valor
    String chave

    static mapping = {
        table 'config'
    }

    static constraints = {
        valor nullable:false, maxSize:1024
        chave nullable:false, maxSize:128, unique:true
    }

}
