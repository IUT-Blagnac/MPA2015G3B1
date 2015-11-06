import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import Pages.Accueil;
import Pages.Crédits;
import Pages.Etudiants;
import Pages.Intervenants;

import Pages.Projets;
import Pages.Sujets;

public class MakeOPTIweb {

	public static void main(String[] args) throws IOException {
		PrintWriter ecrivain = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("OPTIweb.html"),
						"UTF-8")));
		System.out.println("Création du fichier \"OPTIweb.html\"");
		System.out
				.println("Commencement de l'écriture dans le fichier \"OPTIweb.html\"");
		System.out.println("");
		ecrivain.write(new MakeOPTIweb().makeHTML());
		ecrivain.close();
		System.out
				.println("Fin de l'écriture de la page HTML \"OPTIweb.html\"");
	}

	public String makeHTML() {

		System.out.println("Ajout du début de la page OPTIWeb");
		String HTML = this.debutPage();
		System.out.println("______________________________________");
		System.out.println("Contenu :");
		// Ajout de pageHTML() de chaque page
		System.out.println("Ajout de la page Accueil");
		HTML += new Accueil().pageHTML();
		System.out.println("Ajout de la page Crédits");
		HTML += new Crédits().pageHTML();
		System.out.println("Ajout de la page Etudiants");
		HTML += new Etudiants().pageHTML();
		System.out.println("Ajout de la page Intervenants");
		HTML += new Intervenants().pageHTML();
		System.out.println("Ajout de la page Sujet");
		HTML += new Sujets().pageHTML();
		System.out.println("Ajout de la page Projets");
		HTML += new Projets().pageHTML();
		// ----------------------------------
		System.out.println("______________________________________");
		HTML += this.finPage();
		System.out.println("");
		System.out.println("Ajout de la fin de la page OPTIWeb");
		return HTML;
	}

	public String debutPage() {
		String page = "<!DOCTYPE html>\n";
		page += "<html>\n";
		page += "<head>\n";
		page += "<meta charset=\"utf-8\" />";
		page += "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n";
		page += "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
		page += "<meta name=\"generator\" content=\"OPTIweb VOPTIweb\" />\n";
		page += "<title>0.1 - V0.1</title>\n";
		page += "<link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" />    <!-- 1 -->\n";
		page += "<link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css\" />    <!-- 2 -->\n";
		page += "<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>    <!-- 3 -->\n";
		page += "<script>\n		$(document).bind('mobileinit',function(){\n		"
				+ "	$.mobile.changePage.defaults.changeHash = false;\n			$.mobile.hashListeningEnabled = false;\n			$.mobile.pushStateEnabled = false;\n		});\n	</script>";
		page += "<script src=\"http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js\"></script>    <!-- 4 -->\n";
		page += "<style type='text/css'>    /* 5 */\n";
		page += "@media all and (orientation:portrait) { .landscape {display: none;} }\n";
		page += "@media all and (orientation:landscape) { .landscape {display: inline;} }\n";
		page += "</style>\n";
		page += "</head><body>\n";
		return page;
	}

	public String finPage() {
		String page = "<script>    // 7\n";
		page += "$( 'li[data-find]' ).on( 'click',function(event){\n";
		page += "  $(\"#autocomplete-input-projet\").val($(this).attr('data-find')).trigger('change');\n";
		page += " });\n";
		page += "</script>\n";
		page += "</body>\n";
		page += "</html>\n";
		return page;
	}
}
