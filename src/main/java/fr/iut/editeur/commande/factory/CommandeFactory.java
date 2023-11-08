package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "effacer" : return new CommandeEffacer(document,parameters);
            case "masjuscule" : return new CommandeMajuscule(document,parameters);
            case "remplacer" : return new CommandeRemplacer(document, parameters);
            case "ajouter" : return new CommandeAjouter(document, parameters);
            default: return null;
        }
    }

}
