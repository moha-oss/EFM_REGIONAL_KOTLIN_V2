class Entree(var moten: String, var motfr: String) {

    fun setMotEn(mot:String){
        if (mot.isBlank() || mot.isEmpty()){
            var e = Exception()
            throw e
        }else{
            this.moten=mot
        }
    }

    fun setMotFr(mot:String){
        if (mot.isBlank() || mot.isEmpty()){
            var e = Exception()
            throw e
        }else{
            this.motfr=mot
        }
    }

    override fun toString(): String {
        return "$moten':'$motfr"
    }

    fun equals(other: Entree): Boolean {
        var res=false
        if (this.moten==other.moten)
            res=true

        return res
    }

}