package factory;

import defaultpackage.Administration;
import defaultpackage.Media;
import defaultpackage.Referee;
import defaultpackage.Teams;

import java.util.ArrayList;
import java.util.List;

public class SpecificFactory implements AbstractFactory {
    private List <Competition> state = new ArrayList<>();
    
    public List <Competition> getCompetition(League league) {
        
        switch (league) {
            case HEIGHT:
                state.add(new Administration());
                state.add(new Media());
                state.add(new Referee());
                state.add(new Teams());
                break;

            case FIRST:
                state.add(new Media());
                state.add(new Referee());
                state.add(new Teams());
                break;

            case SECOND:
                state.add(new Referee());
                state.add(new Teams());
                break;

            case AMATORY:
                state.add(new Teams());
                break;
        }
        return state;
    }
    
    public String function () {
        String text = "These competitions will require :";
        for (Competition item : state) {
            text+= "\n" + item.getActivity();
        }
        System.out.println(text);
        return text;
    }
}
