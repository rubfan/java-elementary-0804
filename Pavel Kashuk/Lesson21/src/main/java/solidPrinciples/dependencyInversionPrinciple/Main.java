package solidPrinciples.dependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        DatabaseHandler databaseHandlerSQL = new DatabaseHandler(new MySQLDatabase());
        databaseHandlerSQL.connect();
        databaseHandlerSQL.disconnect();

        DatabaseHandler databaseHandlerOracle = new DatabaseHandler(new OracleDatabase());
        databaseHandlerOracle.connect();
        databaseHandlerOracle.disconnect();
    }
}
