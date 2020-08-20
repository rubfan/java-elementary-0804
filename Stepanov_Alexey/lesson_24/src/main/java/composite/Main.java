package composite;

public class Main {
    public static void main(String[] args) {
        Directory mycomp = new Directory("MyComputer");
        Directory work = new Directory("Work");
        Directory fun = new Directory("Fun");
        Directory games = new Directory("Games");
        File file1 = new File("tetris.exe", 500);
        File file2 = new File("movie.avi", 1800);
        File file3 = new File("song.mp3", 30);
        File file4 = new File("report.doc", 15);
        File file5 = new File("presentation.ppt", 80);
        File file6 = new File("table.xls", 19);
        File file7 = new File("coolgame.exe", 2000);

        mycomp.add(work);
        mycomp.add(fun);
        work.add(file4);
        work.add(file5);
        work.add(file6);
        fun.add(file2);
        fun.add(file3);
        fun.add(games);
        games.add(file1);
        games.add(file7);
        work.remove(file6);

        mycomp.showContent();
    }
}

/* output
MyComputer : Work : report.doc
Work : presentation.ppt
MyComputer : Fun : movie.avi
Fun : song.mp3
Fun : Games : tetris.exe
Games : coolgame.exe
 */
