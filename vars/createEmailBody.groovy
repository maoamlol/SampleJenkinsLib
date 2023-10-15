def call(dslScript, param1, param2){
    def retText = """Sehr geehrte Damen und Herren,

            Der Build lief $param1, sie sind ein $param2
    """
    dslScript.echo retText
    return retText

}

def call(String parm) {
    return "blalbla $parm"
}
