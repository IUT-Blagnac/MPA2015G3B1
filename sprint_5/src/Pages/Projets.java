package Pages;

import Util.Lib;

public class Projets extends Page {

	public String pageHTML() {
		String fichier = "<!-- DEBUT page projets -->\n"
				+ "<div data-role=\"page\" id=\"projets\" data-title=\"OPTIweb - V0.1\">\n"
				+ "<div data-role=\"header\" data-add-back-btn=\"true\">\n"
				+ "<h1>Projets 2014-2015</h1>\n"
				+ "\n"
				+ "</div>\n"
				+ "<div data-role=\"content\">\n"
				+ "<form class=\"ui-filterable\">\n"
				+ "<input id=\"autocomplete-input-projet\" name=\"projet\" data-type=\"search\" placeholder=\"Vous cherchez ?...\">\n"
				+ "</form>\n"
				+ "<ol id=\"listeprojets\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" "
				+ "data-filter-reveal=\"false\" data-input=\"#autocomplete-input-projet\">\n";

		fichier += ProjetsCSV();
		fichier += "</ol>\n	</div>\n <div data-role=\"footer\">\n <h4>OPTIweb V<span class=\"landscape\">ersion"
				+ " </span>0.1 <i class=\"fa fa-tasks fa-2x\"></i></h4>\n	</div>\n	</div>\n"
				+ "	<!-- FIN page projets -->";

		return fichier;
	}
//	</p>
//	<p>
//	<b>Client :</b> TISSIER Evelyne
//	</p>
//	<p>
//	<b>Superviseur :</b> CANUT Marie-Françoise
//	</p>
//	<p>
//	
//	</p>
//	</li>
	public String ProjetsCSV() {
		String html = "";
		String CSVprojets = Lib.Lire("data/projets2014_2015.csv");
		String[] Projets = CSVprojets.split("\n");
		
		for (int i = 1; i < Projets.length; i++) {
			String[] Projet = Projets[i].split(";");
			html += "<li> <!-- 2 --> \n<p> \n";
			html += SujetDuProjet(Integer.parseInt(Projet[2]));
			html += "</p>\n<p>\n";
			html += Intervenant("Client", Integer.parseInt(Projet[3]));
			html += "</p>\n<p>\n";
			html += Intervenant("Superviseur", Integer.parseInt(Projet[4]));
			html += "</p>\n<p>\n";
			html += "<b>Groupe "+Projet[1]+" :</b> ";
			html += EtudiantsGroupe(Projet[1]);
			html += "\n</p>\n </li>\n";
		}
		return html;
	}
	public String SujetDuProjet(int idSujet){
		String CSVsujets = Lib.Lire("data/sujets2014_2015.csv");
		String[] Sujets = CSVsujets.split("\n");	
		for (int i = 1; i < Sujets.length; i++) {
			String[] Sujet = Sujets[i].split(";");
			if (idSujet == Integer.parseInt(Sujet[0])){
				return "<b>["+Sujet[1]+"] </b>"+Sujet[2]+"\n";
			}
		}
		return null;
	}
	public String Intervenant(String role, int idIntervenant){
		String CSVintervenants = Lib.Lire("data/intervenants2014_2015.csv");
		String[] Intervenants = CSVintervenants.split("\n");	
		for (int i = 1; i < Intervenants.length; i++) {
			String[] Intervenant = Intervenants[i].split(";");
			if (idIntervenant == Integer.parseInt(Intervenant[0])){
				return "<b>"+role+" :</b> "+Intervenant[2]+" "+Intervenant[1]+"\n";
			}
		}
		return null;
	}
	public String EtudiantsGroupe(String idGroupe){
		String groupe = "";
		String CSVetudiants = Lib.Lire("data/etudiants2014_2015.csv");
		String[] Etudiants = CSVetudiants.split("\n");	
		for (int i = 1; i < Etudiants.length; i++) {
			String[] Etudiant = Etudiants[i].split(";");
			if (idGroupe.equals(Etudiant[0])){
				groupe += Etudiant[3]+" "+Etudiant[2]+" - ";
			}
		}
		return groupe;
	}
	
}
