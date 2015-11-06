package Pages;

import Util.Lib;

public class Etudiants extends Page {
	public String pageHTML() {
		String fichier = "<!-- DEBUT page etudiants -->\n"
				+ "<div data-role=\"page\" id=\"etudiants\" data-title=\"OPTIweb - V0.1\">\n"
				+ "<div data-role=\"header\" data-add-back-btn=\"true\">\n"
				+ "<h1>Etudiants 2014-2015</h1>\n"
				+ "</div>\n"
				+ "<div data-role=\"content\">\n"
				+ "	<form class=\"ui-filterable\">\n <input id=\"autocomplete-input-etudiant\" "
				+ "name=\"etudiant\" data-type=\"search\" placeholder=\"Etudiant ou Groupe X\">\n	</form>\n	"
				+ "<ol id=\"listeetudiants\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\""
				+ " data-filter-reveal=\"false\" data-input=\"#autocomplete-input-etudiant\" data-divider-theme=\"b\">\n"
				+ "		<li data-role=\"list-divider\">\n	Etudiant<span class=\"ui-li-count\" title=\"Groupe\" "
				+ "style=\"right: 40px !important;\">Groupe</span>\n	</li>";

		fichier += EtudiantsCSV();

		fichier += "</ol>\n	</div>\n	<div data-role=\"footer\">\n	"
				+ " <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-group fa-2x\"></i></h4>\n"
				+ "	</div>\n	</div>\n	<!-- FIN page etudiants -->";

		return fichier;
	}

	public String EtudiantsCSV() {
		String html = "";
		String csv = Lib.Lire("data/etudiants2014_2015.csv");
		String[] Etudiants = csv.split("\n");
		for (int i = 1; i < Etudiants.length; i++) {
			String[] Etudiant = Etudiants[i].split(";");
			html += "<li data-find=\""+Etudiant[3]+" "+Etudiant[2]+"\">";
			html += "<a href=\"#projets\">"+Etudiant[3]+" "+Etudiant[2]+"<span class=\"ui-li-count\"";
			html += "title=\"Groupe\">Groupe "+Etudiant[0]+"</span>";
			html += "</a>";
		}
		return html;
	}
}