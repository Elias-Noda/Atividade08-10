
package Java;

public class Semestre {
    String html = "";
    

    public Semestre(){
        html += "<select name=\"semestre\"id=\"semestre\">";
        html+="<option value= \"Primeiro\">1° Semestre</option>";
        html+="<option value= \"Segundo\">2° Semestre</option>";
        html+="<option value= \"Terceiro\">3° Semestre</option>";
        html+="<option value= \"Quarto\">4 Semestre</option>";
        html+="<option value= \"Quinto\">5° Semestre</option>";
        html+="<option value= \"Sexto\">6° Semestre</option>";
        html+="<option value= \"Sétimo\">7° Semestre</option>";
        html+="<option value= \"Oitavo\">8° Semestre</option>";
        html+="<option value= \"Nono ou mais\">9° Semestre ou mais</option>";
        html +="</select>";        
        
    }

    public String getSemestre() {
        return html;
    }
      
}
