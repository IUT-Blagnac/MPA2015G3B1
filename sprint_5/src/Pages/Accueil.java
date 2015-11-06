package Pages;

public class Accueil extends Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String pageHTML() {
		String page = "<!-- DEBUT page accueil -->\n";
		page += "<div data-role=\"page\" id=\"accueil\" data-title=\"OPTIweb - V0.1\">\n";
		page += "<div data-role=\"header\" data-add-back-btn=\"true\">\n";
		page += "<h1>P<span class=\"landscape\">rojets </span>tut<span class=\"landscape\">orés</span> 2014-2015<br/>Département INFO<span class=\"landscape\">RMATIQUE</span><br/>IUT de Blagnac</h1>\n";
		page += "<a href=\"#credits\" data-theme=\"b\" class=\"ui-btn-right\">Crédits</a>   <!-- 1 -->\n";
		page += "</div>\n";
		page += "<div data-role=\"content\">\n";
		page += "<ul data-role=\"listview\" data-inset=\"true\" id=\"listeSources\">\n";
		page += "  <li><a href=\"#projets\"><i class=\"fa fa-tasks\"></i> Projets</a></li>   <!-- 1 -->\n";
		page += "  <li><a href=\"#sujets\"><i class=\"fa fa-copy\"></i> Sujets</a></li>   <!-- 1 -->\n";
		page += "  <li><a href=\"#etudiants\"><i class=\"fa fa-group\"></i> Etudiants</a></li>   <!-- 1 -->\n";
		page += "  <li><a href= \"#intervenants\"><i class=\"fa fa-group\"></i> Intervenants</a></li>   <!-- 1 -->\n";
		page += "</ul>\n";
		page += "</div>\n";
		page += "<div data-role=\"footer\">\n";
		page += " <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa- fa-2x\"></i></h4>\n";
		page += "</div>\n";
		page += "</div>\n";
		page += "<!-- FIN page accueil -->// TODO Auto-generated method stub\n";
		return page;
	}

}
