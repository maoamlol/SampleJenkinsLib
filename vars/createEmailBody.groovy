def call(dslScript, param1, param2){
    def retText = """Sehr geehrte Damen und Herren,

            Der Build lief $param1, sie sind ein $param2
    """
    dslScript.echo retText
    dslScript.echo dslScript
    return retText

}

def call(String parm) {
    echo currentBuild.result
    echo this
    return "blalbla $parm"
}
