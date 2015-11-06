package Pages;

import Util.Lib;

public class Intervenants extends Page {

	

	public String pageHTML() {
		
		
		
		String fichier = "<!-- DEBUT page intervenants -->\n"
				+ "<div data-role=\"page\" id=\"intervenants\" data-title=\"OPTIweb - V0.1\">\n"
				+ "<div data-role=\"header\" data-add-back-btn=\"true\">\n"
				+ "<h1>Intervenants 2014-2015</h1>\n"
				+ "\n"
				+ "</div>\n"
				+ "<div data-role=\"content\">\n"
				+ "\n"
				+ "<form class=\"ui-filterable\">\n"
				+ "<input id=\"autocomplete-input-intervenant\" name=\"intervenant\" data-type=\"search\" placeholder=\"Intervenant\">\n"
				+ "</form>\n"
				+ "<ul id=\"listeintervenants\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-intervenant\" data-divider-theme=\"b\">\n"
				+ "<li data-role=\"list-divider\"> \n"
				+ "Intervenant<span class=\"ui-li-count\" style=\"right: 110px !important;\" title=\"Client\">Client</span><span class=\"ui-li-count\" title=\"Superviseur\">Superviseur</span>\n"
				+ "</li>\n"
				+ Intervenants.csv()
				+ "</ul>\n"
				+ "</div>\n"
				+ "<div data-role=\"footer\">\n"
				+ " <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-group fa-2x\"></i></h4>\n"
				+ "</div>\n"
				+ "</div>\n"
				+ "<!-- FIN page intervenants -->";
				
				
				
		return fichier;
	}
	
	public static String csv(){
		String leRetour = "";
		
		String csvI = Lib.Lire("data/intervenants2014_2015.csv");
		String csvP = Lib.Lire("data/projets2014_2015.csv");
		
		String[] leSplitI = csvI.split("\n");
		String[] leSplitP = csvP.split("\n");
		
		
		for(int i = 1; i < leSplitI.length; i++){
			String[] intervenant = leSplitI[i].split(";");
			
			leRetour += "<li data-find=\""+intervenant[2]+" "+intervenant[1]+"\">";
			leRetour += "<a href=\"#projets\">"+intervenant[2]+" "+intervenant[1]+"<span class=\"ui-li-count\" style=\"right: 120px !important;\" title=\"Client\">"+Intervenants.compteClient(intervenant[0],leSplitP)+"</span>";
			leRetour += "<span class=\"ui-li-count\" title=\"Superviseur\">"+Intervenants.compteSup(intervenant[0],leSplitP)+"</span>";
			leRetour += "</a>";
			leRetour += "</li>";
		}
		
		return leRetour;
	}
	
	public static int compteClient(String id, String[] projet){
		int compteur = 0;
		
		for(int i = 1; i < projet.length; i++){
			String [] caseProjet = projet[i].split(";");
			if( caseProjet[3].equals(id))
				compteur ++;
			
		}
		
		return compteur;
	}
	
	public static int compteSup(String id, String[] projet){
		
		int compteur = 0;
		
		for(int i = 1; i < projet.length; i++){
			String [] caseProjet = projet[i].split(";");
			if( caseProjet[4].equals(id))
				compteur ++;
			
		}
		
		return compteur;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
