/**
  Copyright 2023 David Kuhlen, IU University of Applied Sciences, 
  Waterloohain 9, 22769 Hamburg, Germany.
  
  The use of this project is only allowed in the context of 
  the lecture to facilitate the understanding of programming 
  techniques. Redistribution and use in source or binary forms, with 
  or without modification, are not allowed.
  
  Please check the file "Legal_Notice.txt", to find the license 
  information for this project and further information.
  
  DISCLAIMER [bsd-3]: 
   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 
   "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT 
   LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS 
   FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE 
   COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
   INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
   BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; 
   LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER 
   CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT 
   LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN 
   ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
   POSSIBILITY OF SUCH DAMAGE.

  No third-party-solutions will be delivered/distributed as a part 
  of this project. 

 */

package t.peters.vorlesung4.einkaufzettel;

import java.util.ArrayList;
import java.util.Scanner;

public class EinkaufszettelMgrApp {

	// 0) Leere Liste angelegen
	private static ArrayList<String> einkaufszettel = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		while(true) {
		// 1) Menü ausgebe (Befehle Hinzufügen, Löschen, Ausgaben)
		// 2) Benutzereingabe abfragen
		char input = menuSelection();
		
		// 3) Wahl d. Menüpunktes, nach Benutzereingabe:
		performMenueItem(input);
		}
			
	}
	
	// Gewählten Menue-Eintrag ausführen
	private static void performMenueItem(char input) {
		switch(input) {
		case 'H': addElement(); break;
		case 'L': deleteElement(); break;
		case 'A': anzeige(); break;
		default: System.out.println("Eingabe ungültig!");
		}
	}

	// 	3.3) Ausgaben gewählt --> 
	//    3.3.1) Schleife, durch Einträge iterieren und ausgeben
	private static void anzeige() {
		for (String eintrag : einkaufszettel) {
			System.out.println(eintrag);
		}
	}

	// 3.1) Löschen gewählt -->
		// 3.1.1) zu löschendes Element wählen
		// 3.1.2) dann das Element "löschen"
	private static void deleteElement() {
		System.out.println("Elemnent: ");
		Scanner s = new Scanner(System.in);
		String zuloeschendesElement = s.nextLine();
		for (int i = 0; i < einkaufszettel.size(); i++) {
			String eintrag = einkaufszettel.get(i);
			if(eintrag != null && eintrag.equals(zuloeschendesElement)) {
				einkaufszettel.remove(i);
			}
		}
	}

	// 3.2) Hinzufügen gewählt -->
		// 3.2.1) Anwender gibt einen Eintrag ein
		// 3.2.2) Eintrag ergänzen
	private static void addElement() {
		System.out.print("Element: ");
		Scanner s = new Scanner(System.in);
		String newItem = s.nextLine();
		einkaufszettel.add(newItem);
		}

	// 1) Menü ausgebe (Befehle Hinzufügen, Löschen, Ausgaben)
	// 2) Benutzereingabe abfragen
	private static char menuSelection() {
		System.out.println("Mögliche Befehle: 'H' Hinzufügen, 'L' Löschen, 'A' Ausgeben");
		Scanner s = new Scanner(System.in);
		return s.nextLine().charAt(0);
	}

}
