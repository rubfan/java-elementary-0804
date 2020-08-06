package Proxy;

public interface Referee {
    public void breakingTheRules();
}

class FieldReferee implements Referee {
String fullName;
public FieldReferee (String fullName){
    this.fullName = fullName;
    getFullName();
    penalty();
    goalScoring();
    offside();
    breakingTheRules();
    out();
}

    public String getFullName() {
        System.out.println(fullName);
        return fullName;
    }

    public void goalScoring() {
        System.out.println("Fixation goalScoring");
    }

    public void offside() {
        System.out.println("Fixation offside");
    }

    @Override
    public void breakingTheRules() {
        System.out.println("Fixation breakingTheRules");
    }

    public void penalty() {
        System.out.println("Fixation penalty");
    }

    public void out() {
        System.out.println("Fixation out");
    }
}

class LateralReferee implements Referee {
    String fullName;
    FieldReferee referee;

    public LateralReferee(String fullName) {
        this.fullName = fullName;
        getFullName();
        offside();
    }

    public void offside() {
        System.out.println("Fixation offside");
    }

    public String getFullName() {
        System.out.println(fullName);
        return fullName;
    }

    @Override
    public void breakingTheRules() {
        if (referee == null) {
            referee = new FieldReferee(fullName);
        }
        referee.breakingTheRules();
    }
}

class Main {
    public static void main(String[] args) {
        Referee referee = new LateralReferee("Alexsandr Baz");
    }
}
