import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        return stream1.getGruppaList().size() - stream2.getGruppaList().size();
    }
}

