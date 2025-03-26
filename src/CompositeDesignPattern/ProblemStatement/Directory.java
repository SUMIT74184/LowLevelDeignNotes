package CompositeDesignPattern.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList;

    public Directory(String name){
        this.directoryName=name;
        this.objectList=new ArrayList<>();
    }
    public void add(Object obj){
        objectList.add(obj);
    }
    public void ls(){
        System.out.println("Directory Name"+directoryName);
        for(Object obj1:objectList){
            if(obj1 instanceof File ){
                ((File)obj1).ls();
            }else if(obj1 instanceof Directory){
                ((Directory)obj1).ls();
            }

        }
    }
}
