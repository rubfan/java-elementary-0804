package factory;

import java.util.List;

public interface AbstractFactory {

    List<Competition> getCompetition(League league);

    String function();

}
