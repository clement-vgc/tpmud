import java.util.ArrayList;
import java.util.List;
class Thing{
String name;
public Thing(String name){
this.name = name;
}
}
class Box{
List<Thing> contents;
public Box(){
    this.contents = new ArrayList<Thing>();
}
public void add(Thing truc){
    this.contents.add(truc);
}
}