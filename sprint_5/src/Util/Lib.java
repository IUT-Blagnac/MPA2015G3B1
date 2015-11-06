package Util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lib {
	public static String coucou() {
		return "Coucou Monde";
	}
	
	public static void main (String args[]){
		String expected = "Testligne1;Testligne2;TestLigne3;\nTestligne1;Testligne2;";
		Lib.Sauvegarder("../Test.csv",expected);
		Lib.Lire("../Test.csv");
	}
	
	public static String Lire(String chemin) {
		BufferedReader tampon = null;
		String ligne, fichier;
		fichier = "";
		try {
			File file = new File(chemin);

			tampon = new BufferedReader(
			new InputStreamReader(new FileInputStream(file), "UTF-8"));
			ligne = tampon.readLine();
			

			while (ligne != null) {
				
				// Lit une ligne de test.csv
				
				fichier = fichier + ligne +"\n";
				//System.out.println(ligne);
				ligne = tampon.readLine();
				
			} // Fin du while
			
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				tampon.close();
			} catch(IOException exception1) {
				exception1.printStackTrace();
			}
		}
		
		return fichier;
	}
	
	public static boolean Sauvegarder(String chemin, String chaine){
		
		boolean reussite = true;
		
		
			 
	    // Create file
		try {
			
			File fichier = new File(chemin);
			FileWriter fstream = new FileWriter(fichier);
			BufferedWriter out = new BufferedWriter(fstream);
	    

				    
		    try {
		    	out.write(chaine);
		    }catch(IndexOutOfBoundsException e){
		    	System.err.println(e);
		    }
		    
		    out.close();
		    
		}catch(Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		    //Close the output stream
		
    	
		return reussite;
	}
}
