package Pages;

import Util.Lib;

public class Sujets extends Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String pageHTML (){
		
		String fichier;
		fichier = "<div data-role=\"page\" id=\"sujets\" data-title=\"OPTIweb - V0.1\">\n"
				+ "<div data-role=\"header\" data-add-back-btn=\"true\">\n"
				+ "<h1>Sujets 2014-2015</h1>\n"
				+ "</div>\n"
				+ "<div data-role=\"content\">\n"
				+ "\n"
				+ "<form class=\"ui-filterable\">\n"
				+ "<input id=\"autocomplete-input-sujet\" name=\"sujet\" data-type=\"search\" placeholder=\"Vous cherchez ?\">\n"
				+ "</form>\n"
				+ "<ol id=\"listesujets\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-sujet\" data-divider-theme=\"b\" data-count-theme=\"a\">\n"
				+ "<li data-role=\"list-divider\">\n"
				+ "Sujet<span class=\"ui-li-count\" title=\"Groupe\" style=\"right: 40px !important;\">Groupe</span>\n"
				+ "</li>\n";
		fichier += Sujets.csv();
		
		fichier += "</ol>\n"
				+ "</div>\n"
				+ "<div data-role=\"footer\">\n"
				+ "<h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-copy fa-2x\"></i></h4>\n"
				+ "</div>\n"
				+ "</div>\n"
				+ "<!-- FIN page sujets -->";
		
		
		
		return fichier;
	}
	
	public static String csv(){
		String leRetour = "";
		
		String csvI = Lib.Lire("data/sujets2014_2015.csv");
		String csvP = Lib.Lire("data/projets2014_2015.csv");
		
		String[] leSplitS = csvI.split("\n");
		String[] leSplitP = csvP.split("\n");
		
		
		for(int i = 1; i < leSplitS.length; i++){
			String[] sujet = leSplitS[i].split(";");
			
			leRetour += "<li data-find=\"["+sujet[1]+"]\">";
			leRetour += "<a href=\"#projets\">["+sujet[1]+"] <br/>\n";
			leRetour += "<div style=\"white-space:normal;\">";
			leRetour += "<span><b>"+sujet[2]+"</b>";
			leRetour += "</span><span class=\"ui-li-count\">"+Sujets.groupe(sujet[0], leSplitP)+"</span>";
			leRetour += "</div>";
			leRetour += "</a>";
			leRetour += "</li>";
		}
		
		return leRetour;
	}
	
	public static String groupe(String grp, String[] projet){
		int i = 1;
		
		String [] caseProjet = projet[i].split(";");
		
		while ((!caseProjet[2].equals(grp))&&(i < projet.length)){
			caseProjet = projet[i].split(";");
			i++;
		}
		
		
		return caseProjet[1];
	}
}

