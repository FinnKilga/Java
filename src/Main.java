import at.finn.oo.projects.Musicbox.MusicBox;
import at.finn.oo.projects.Musicbox.Record;
import at.finn.oo.projects.Musicbox.Title;

public class Main
{
    public static void main(String[] args)
    {
        Title t1 = new Title(4.20,"420");
        Title t2 = new Title(2.50,"250");
        Title t3 = new Title(3.30,"330");
        Title t4 = new Title(3.10,"310");
        Record r1 = new Record("first Record","0815");
        r1.addTitle(t1);
        r1.addTitle(t2);
        r1.addTitle(t3);
        r1.addTitle(t4);
        MusicBox m1 = new MusicBox();
        m1.addRecord(r1);
        m1.getSumOfMusic();
        m1.play(2);
        m1.loadRecord(r1);
        m1.play(3);
        m1.searchRecord("first Record");
        m1.removeRecord(r1);
    }
}
