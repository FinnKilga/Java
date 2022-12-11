package at.finn.oo.projects.Musicbox;

import java.util.ArrayList;

public class Record
{
    ArrayList<Title> titles = new ArrayList<>();
    private String RecordTitle;
    private String id;

    public Record(String recordTitle, String id)
    {
        this.RecordTitle = recordTitle;
        this.id = id;
    }
    public void addTitle(Title t)
    {
        this.titles.add(t);
    }

    public String getRecordTitle()
    {
        return RecordTitle;
    }

    public String getId()
    {
        return id;
    }
}
