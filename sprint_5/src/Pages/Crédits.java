package Pages;

public class Crédits extends Page {

	public static void main(String[] args) {
		
	}

	public String pageHTML() {
		String page ="<!-- DEBUT page credits -->";
		page += "<div data-role=\"page\" id=\"credits\" data-title=\"OPTIweb - V0.1 - Crédits\">\n";
		page += "<div data-role=\"header\" data-add-back-btn=\"true\">    <!-- 1 -->\n";
		page += "<h1>Crédits</h1>\n";
		page += "</div>\n";
		page += "<div data-role=\"content\">\n";
		page += "<p>Cette application a été réalisée dans le cadre du module M3301/MPA du DUT Informatique à l'IUT de Blagnac.</p>\n";
		page += "<ul data-role=\"listview\" data-inset=\"true\" id=\"contacts\" data-theme=\"a\" data-divider-theme=\"b\">\n";
		page += "    <li data-role=\"list-divider\">Product Owner</li>\n";
		page += "    <li>André PÉNINOU</li>\n";
		page += "    <li>Université Toulouse 2 - IUT de Blagnac\n";
		page += "    <br/>Département INFORMATIQUE</li>\n";
		page += "</ul>\n";
		page += "<ul data-role=\"listview\" data-inset=\"true\" id=\"listecredits\" data-theme=\"a\" data-divider-theme=\"b\">\n";
		page += "<li data-role=\"list-divider\">Membres de l'équipe enseignante</li>\n";
		page += "<li>Jean-Michel BRUEL</li><li>Jean-Michel INGLEBERT</li><li>André PÉNINOU</li><li>Olivier ROQUES</li>\n";
		page += "</ul>\n";
		page += "<ul data-role=\"listview\" data-inset=\"true\" id=\"listepowered\" data-theme=\"a\" data-divider-theme=\"b\">\n";
		page += "<li data-role=\"list-divider\">Propulsé par</li>\n";
		page += "<li><a href=\"http://jquerymobile.com/\" target=\"autrePage\">http://jquerymobile.com/</a></li>\n";
		page += "<li><a href=\"http://fortawesome.github.io/Font-Awesome/\" target=\"autrePage\">http://fortawesome.github.io/Font-Awesome/</a></li>\n";
		page += "</ul>\n";
		page += "</div>\n";
		page += "<div data-role=\"footer\">\n";
		page += "<h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa- fa-2x\"></i></h4>\n";
		page += "</div>\n";
		page += "</div>\n";
		page += "<!-- FIN page credits -->\n";
		return page;
	}
}
