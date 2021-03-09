package devall_teste

class Clique {

    Date hora
    String ip

    static belongsTo = [post:BlogPost]

    static mapping = {
        table 'clique'
    }

    static constraints = {
        ip maxSize:64
    }

}
