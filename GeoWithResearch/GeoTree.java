import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
    * выделяем сущность "Генеалогическое древо": говорим класс GeoTree,
     для этой сущности определено  поле - tree, которое явл ArrayList с
     узлами Node, те древо - это список отношений между людьми
*/
public class GeoTree implements Write{
    private ArrayList<Node> tree = new ArrayList<>();
    public GeoTree(){

    }
    /**
     * Метод получения древа (поле private)
     * @return
     */
    public ArrayList<Node> getTree() {
        return tree;
    }
    /**
     * Метод добавления узлов принимает  
     * родителя и ребенка и добавляет два узла отношений 
     * м-ду ними: родитель- ребенок и ребенок- родитель
     * @param parent
     * @param children
     */
    public void appendParentChildShip(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children)); 
        //в список узлов tree добавляется новый Node родитель - отношение родитель- ребенок
        tree.add(new Node(children, Relationship.children, parent));
        //в список узлов tree добавляется новый Node ребенок - отношение ребенок- родитель
    }
    public void appendWifeHusbandShip(Person wife, Person husband) {
        tree.add(new Node(wife, Relationship.wife, husband)); 
        //в список узлов tree добавляется новый Node жена - отношение жена- муж
        tree.add(new Node(husband, Relationship.husband, wife));
        //в список узлов tree добавляется новый Node муж - отношение муж- жена
    }
    /**
     * Метод вывода генеалогического древа
     * в файл через интерфейс Write
     * @throws IOException
     */
    @Override
    public void write() throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("GeoTree.txt", true), "UTF-8");
        String convertedToString = String.valueOf(getTree());
        writer.append(convertedToString);
        writer.append("\n");
        writer.close();
    }
}