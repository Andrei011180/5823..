import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<UchebnayaGruppa> {
    private List<UchebnayaGruppa> gruppaList;

    
    @Override
    public Iterator<UchebnayaGruppa> iterator() {
        return gruppaList.iterator();
    }
}
