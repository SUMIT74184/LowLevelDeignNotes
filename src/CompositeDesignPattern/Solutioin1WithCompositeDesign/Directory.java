package CompositeDesignPattern.Solutioin1WithCompositeDesign;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem>fileSystemslist;

    public Directory(String name){
        this.directoryName=name;
        fileSystemslist=new ArrayList<>();
    }
    public void add(FileSystem fileSystemObj){
        fileSystemslist.add(fileSystemObj);
    }
    public void ls(){
        System.out.println("directoryName:-"+directoryName);

        for(FileSystem fso:fileSystemslist){
            fso.ls();
        }
    }
}
