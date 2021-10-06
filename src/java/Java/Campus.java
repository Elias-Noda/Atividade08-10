
package Java;

public class Campus {
  String html = "";
    

    public Campus(){
        html += "<select name=\"campus\"id=\"campus\">";
        html+="<option value= \"Santo Amaro\">Santo Amaro</option>";
        html+="<option value= \"Barra Funda\">Barra Funda</option>";
        html+="<option value= \"Vergueiro\">Vergueiro</option>";
        html+="<option value= \"Vila Maria\">Vila Maria</option>";
        html+="<option value= \"Vila Prudente\">Vila Prudente</option>";
        html +="</select>";        
        
    }

    public String getCampus() {
        return html;
    }
    
}
