package chap4.section6.dependency

class Patient(val name : String, val id : Int){
    fun doctorList(d : Doctor){
        println("Patient : $name Doctor : ${d.name}")
    }
}

class Doctor(val name: String, val p : Patient){
    val customerId = p.id

    fun patientList(){
        println("Doctor : $name  Patient : ${p.name}")
        println("Patient Id : $customerId")
    }
}

fun main(){
    val patient1 = Patient("Zin", 152313)
    val doc1 = Doctor("hyeon", patient1)
    doc1.patientList()
}
