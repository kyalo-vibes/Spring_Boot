import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static List<String>[] groupString(List<String> input) {
        int size = input.size();
        List<String> outputList[] = new List[3];
        for(String a : input) {
            if(a.indexOf('a') == 0) {
                List<String> lst;
                if(outputList[0] == null) {
                    lst = new ArrayList<>();
                }
                else {
                    lst = outputList[0];
                }
                lst.add(a);
                outputList[0] = lst;
            }
            else if(a.indexOf('b') == 0) {
                List<String> lst;
                if(outputList[1] == null) {
                    lst = new ArrayList<>();
                }
                else {
                    lst = outputList[1];
                }
                lst.add(a);
                outputList[1] = lst;
            } else {
                List<String> lst;
                if(outputList[2] == null) {
                    lst = new ArrayList<>();
                }
                else {
                    lst = outputList[2];
                }
                lst.add(a);
                outputList[2] = lst;
            }
        }
        return outputList;
    }
}
