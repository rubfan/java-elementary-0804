package visitor;

abstract class VisitorReferee {
    protected String city;

    abstract String getCity();

    abstract void visit(Dinamo kiev);

    abstract void visit(Shahtar kharkov);

    abstract void visit(Dnepr dnepr);

    abstract void visit(Chernomorec odessa);
}

interface FootballClub {
    void accept(VisitorReferee referee);
}

class Client {
    public static void main(String[] args) {
        FootballClub dinamo = new Dinamo();
        FootballClub dnepr = new Dnepr();
        FootballClub shahtar = new Shahtar();
        FootballClub chernomorec = new Chernomorec();
        VisitorReferee abdula = new AnatoliyAbdula();

        dinamo.accept(abdula);
        dnepr.accept(abdula);
        shahtar.accept(abdula);
        chernomorec.accept(abdula);
    }
}

class Dinamo implements FootballClub {
    private String city = "Kiev";

    public void accept(VisitorReferee referee) {
        if (!city.equals(referee.getCity())) {
            referee.visit(this);
        } else {
            System.out.println("According to the rules of FFU. This referee cannot judge the matches of this team");
        }
    }
}

class Shahtar implements FootballClub {
    private String city = "Kharkov";

    public void accept(VisitorReferee referee) {
        if (!city.equals(referee.getCity())) {
            referee.visit(this);
        } else {
            System.out.println("According to the rules of FFU. This referee cannot judge the matches of this team");
        }
    }
}

class Dnepr implements FootballClub {
    private String city = "Dnepr";

    public void accept(VisitorReferee referee) {
        if (!city.equals(referee.getCity())) {
            referee.visit(this);
        } else {
            System.out.println("According to the rules of FFU. This referee cannot judge the matches of this team");
        }
    }
}

class Chernomorec implements FootballClub {
    private String city = "Odessa";

    public void accept(VisitorReferee referee) {
        if (!city.equals(referee.getCity())) {
            referee.visit(this);
        } else {
            System.out.println("According to the rules of FFU. This referee cannot judge the matches of this team");
        }
    }
}

class VitaliyRomanov extends VisitorReferee {
    public String getCity() {
        this.city = "Dnepr";
        return city;
    }

    public void visit(Dinamo kiev) {
        System.out.println("Gives many yellow cards");
    }

    public void visit(Shahtar kharkov) {
        System.out.println("In matches with this referee, an average of 3 goals are scored.");
    }

    public void visit(Dnepr dnepr) {
        System.out.println("Doesn't give a penalty in the last minutes");
    }

    public void visit(Chernomorec odessa) {
        System.out.println("One removal in a match");
    }
}

class AnatoliyAbdula extends VisitorReferee {
    public String getCity() {
        this.city = "Kharkov";
        return city;
    }

    public void visit(Dinamo kiev) {
        System.out.println("One removal in a match");
    }

    public void visit(Shahtar kharkov) {
        System.out.println("Gives many yellow cards");
    }

    public void visit(Dnepr dnepr) {
        System.out.println("In matches with this referee, an average of 3 goals are scored.");
    }

    public void visit(Chernomorec odessa) {
        System.out.println("Doesn't give a penalty in the last minutes");
    }
}

class EvgeniyAranovskiy extends VisitorReferee {
    public String getCity() {
        this.city = "Kiev";
        return city;
    }

    public void visit(Dinamo kiev) {
        System.out.println("Doesn't give a penalty in the last minutes");
    }

    public void visit(Shahtar kharkov) {
        System.out.println("One removal in a match");
    }

    public void visit(Dnepr dnepr) {
        System.out.println("Gives many yellow cards");
    }

    public void visit(Chernomorec odessa) {
        System.out.println("In matches with this referee, an average of 3 goals are scored.");
    }
}

class DmitriyBondarenko extends VisitorReferee {
    public String getCity() {
        this.city = "Odessa";
        return city;
    }

    public void visit(Dinamo kiev) {
        System.out.println("In matches with this referee, an average of 3 goals are scored.");
    }

    public void visit(Shahtar kharkov) {
        System.out.println("Doesn't give a penalty in the last minutes");
    }

    public void visit(Dnepr dnepr) {
        System.out.println("One removal in a match");
    }

    public void visit(Chernomorec odessa) {
        System.out.println("Gives many yellow cards");
    }
}
