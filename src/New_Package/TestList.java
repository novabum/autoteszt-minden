package New_Package;

import java.util.List;

public class TestList {

    private final List<String> list;

    public TestList(List<String> list){
        this.list = list;
    }

    public void doStuff(){
        list.add("asdas");
        list.add("asdasa");
    }
}
