import java.util.List;

public class Archive {
    List<ArchiveData> archiveDataList;

    public void addRegisterToArchiveData(ArchiveData archiveData) throws IllegalArgumentException{
        try{
            archiveDataList.add(archiveData);
        }
        catch (IllegalArgumentException ex)
        {
            throw new IllegalArgumentException("Nie udalo sie dodac rejestru do listy w archiwum");
        }
    }
}
