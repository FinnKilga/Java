package at.finn.oo.projects.Musicbox;

import java.util.ArrayList;

public class MusicBox
{
    ArrayList<Record> records = new ArrayList<>();
    private int StorageSpace = 50;
    private Record currentRecord;
    public void addRecord(Record r)
    {
        if (this.StorageSpace - 1 < 0)
        {
            System.out.println("No more space left");
        }
        else
        {
            this.StorageSpace -= 1;
            this.records.add(r);
        }
    }
    public void removeRecord(Record record)
    {
        for (Record r:this.records)
        {
            if (r == record)
            {
                this.records.remove(record);
                System.out.println("Record '" + r.getRecordTitle() + "' removed");
                break;
            }
            else
            {
                System.out.println("Record not found");
            }
        }
    }
    public void getSumOfMusic()
    {
        double sumOfMusic = 0;
        for (Record record:this.records)
        {
            for (Title title:record.titles)
            {
                sumOfMusic += title.getLength();
            }
        }
        System.out.println("Total playtime: " + sumOfMusic + "min");
    }
    public void searchRecord(String title)
    {
        int index = 0;
        for (Record r:this.records)
        {
            if (r.getRecordTitle() == title)
            {
                System.out.println("Record found! Number: " + index);
            }
            index ++;
        }
    }
    public void loadRecord(Record record)
    {
        System.out.println("Record is loading");
        this.currentRecord = record;
    }
    public void play(int num)
    {
        num -=1;
        if (this.currentRecord == null)
        {
            System.out.println("No record loaded");
        }
        else
        {
            Title title = this.currentRecord.titles.get(num);
            System.out.println("Playing " + title.getName());
        }
    }
}
