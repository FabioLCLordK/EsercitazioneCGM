/*
Modellizzare una classe Vocabolo.
La classe Vocabolo presenta:
- name: String
- description: String
+ getters and setters


*/

package esercizioVocabolo;
public class Vocabolo {
    private String name;
    private String description;

    public Vocabolo(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Vocabolo{" + "name=" + name + ", description=" + description + '}';
    }
    
    
    
}
