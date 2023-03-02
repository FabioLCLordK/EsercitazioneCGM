/*
Generalizzare l'esercizio dichiarando la classe Vocabolario per mezzo dei generics come:
class Vocabolo<K, V>

Inserire gli stessi oggetti dell'esercizio precedente
Stampare tramite iterator e foreach il contenuto di Set.
*/

package esercizioVocaboloGenerics;

import esercizioVocabolo.*;

public class Vocabolo <K,V> {
    private K name;
    private V description;

    public Vocabolo(K name, V description) {
        this.name = name;
        this.description = description;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getDescription() {
        return description;
    }

    public void setDescription(V description) {
        this.description = description;
    }

    

    @Override
    public String toString() {
        return "Vocabolo esaminato " + name + " := " + description;
    }
    
    
    
}
