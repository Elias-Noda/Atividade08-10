
package Java;

public class Turno {
    String html = "";
    

    public Turno(){
        html += "<select name=\"turno\"id=\"turno\">";
        html+="<option value= \"Manha\">Manhã</option>";
        html+="<option value= \"Tarde\">Tarde</option>";
        html+="<option value= \"Noite\">Noite</option>";
        html+="<option value= \"EAD\">EAD</option>";
        html +="</select>";        
        
    }

    public String getTurno() {
        return html;
    }  
}
