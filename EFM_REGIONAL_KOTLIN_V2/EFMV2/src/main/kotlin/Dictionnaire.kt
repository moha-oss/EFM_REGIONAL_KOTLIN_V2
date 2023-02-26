class Dictionnaire(var dictionaire :ArrayList<Entree>) {

    fun nombreEntree():Int{
        return dictionaire.size
    }

    fun ajourter(e:Entree){
        for (en in dictionaire){
            if (en.equals(e)){
                var e=Exception(" l'entee existe deja")
                throw e
            }else{
                dictionaire.add(e)
            }
        }
    }

    fun suprimmer(e:Entree):Boolean{
        var res=true
        for (en in dictionaire){
            if (en.equals(e)){
                dictionaire.remove(e)
            }else{
                res=false
            }
        }
        return res
    }

    fun suprimmer(motAnglais:String):Boolean{
        var res=true
        for (en in dictionaire){
            if (en.moten==motAnglais){
                dictionaire.remove(en)
            }else{
                res=false
            }
        }
        return res
    }
    fun frAn(motFrancais:String):ArrayList<String>{
        var str = ArrayList<String>()
        for (en in dictionaire){
            if (en.motfr==motFrancais){
                str.add(en.moten)
            }
        }
        return str
    }

    fun motsFrancais(): Set<String> {
        var str = ArrayList<String>()
        for (en in dictionaire){
            str.add(en.motfr)
        }
//        return str.distinctBy {it}
        return str.toSet()
    }

    fun dictionnaireAngFr():Map<String,ArrayList<String>>{
        lateinit var diction:Map<String,ArrayList<String>>
        for (en in dictionaire){
            diction.plus(Pair(en.motfr,frAn(en.motfr)))
        }
        return diction
    }
    fun toSting():String{
        var str:String=""
        for (en in dictionaire){
           str = str + en.toString()+"\n"
        }
        return str
    }

}