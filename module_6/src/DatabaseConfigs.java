public class DatabaseConfigs extends  ParentDatabaseConfigs{

    public static String DATABASE_NAME;

    {
        System.out.println("Something");
    }

    static {
        DATABASE_NAME = System.getProperty("DATABASE_NAME");
    }
}
