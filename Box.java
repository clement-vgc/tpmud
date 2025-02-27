import java.util.ArrayList;
import java.util.List;

class Thing {
    String name;
    
    public Thing(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Thing thing = (Thing) obj;
        return name.equals(thing.name);
    }
    
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

class Box {
    private List<Thing> contents;
    private boolean isOpen;
    
    public Box() {
        this.contents = new ArrayList<>();
        this.isOpen = true;
    }
    
    public void add(Thing truc) {
        this.contents.add(truc);
    }
    
    public boolean contains(Thing truc) {
        return this.contents.contains(truc);
    }
    
    public void remove(Thing truc) throws Exception {
        if (!this.contents.contains(truc)) {
            throw new Exception("L'élément n'est pas dans la boîte.");
        }
        this.contents.remove(truc);
    }
    
    public boolean isOpen() {
        return this.isOpen;
    }
    
    public void open() {
        this.isOpen = true;
    }
    
    public void close() {
        this.isOpen = false;
    }
    
    public String actionLook() {
        if (!this.isOpen) {
            return "La boîte est fermée.";
        }
        if (this.contents.isEmpty()) {
            return "La boîte est vide.";
        }
        StringBuilder result = new StringBuilder("La boîte contient: ");
        for (Thing t : contents) {
            result.append(t.name).append(", ");
        }
        return result.substring(0, result.length() - 2);
    }
}
