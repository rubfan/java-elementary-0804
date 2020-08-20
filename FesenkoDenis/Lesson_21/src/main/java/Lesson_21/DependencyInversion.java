package Lesson_21;


import java.security.SecureRandom;

interface Git {
    String nameOfProject = "java.elementary";

    void getLoggedIn();
}

interface JDK {
    String task = "Task is done!";

    void compile();
}

interface Help {
    String error = "Try to fix";

    void searchHelpInTheInternet();
}

public class DependencyInversion {
    public static void main(String[] args) {
        CreateHW newHW = new CreateHW();
        newHW.showWork("Den", 111, 21, "dependency inversion hint");
    }
}

class CreateHW {
    GitLog gitLog = new GitLog();
    FindHelp help = new FindHelp();
    WorkInJDK work = new WorkInJDK();

    public void showWork(String name, int pass, int numbWork, String hint) {
        gitLog.setLog(name);
        gitLog.setPass(pass);
        gitLog.getLoggedIn();

        help.setHint(hint);
        help.searchHelpInTheInternet();

        work.setNumberOfTask(numbWork);
        work.compile();
    }
}

class GitLog implements Git {
    String log;
    int pass;

    public GitLog() {
    }

    public void setLog(String log) {
        this.log = log;
    }


    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public void getLoggedIn() {
        if (log != null && pass != 0) {
            System.out.println("Logged in to " + nameOfProject);
        }
    }
}

class WorkInJDK implements JDK {
    int numberOfTask;

    public WorkInJDK() {
    }

    public int getNumberOfTask() {
        return numberOfTask;
    }

    public void setNumberOfTask(int numberOfTask) {
        this.numberOfTask = numberOfTask;
    }

    @Override
    public void compile() {
        System.out.println(task + " Number " + numberOfTask);
    }
}

class FindHelp implements Help {
    String hint;

    public FindHelp() {
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public void searchHelpInTheInternet() {
        System.out.println("I had " + error + " and later i discovered a " + hint + " in the internet");
    }
}