public class Restaurant2 {
    private String tablesAvailable;
    private String serverName;
    private String tableType;

    // constructor initialize fields
    public Restaurant2(String tablesAvailable, String serverName, String tableType) {
        this.tablesAvailable = tablesAvailable;
        this.serverName = serverName;
        this.tableType = tableType;
    }

    // constructor overload null values
    public Restaurant2() {
        this.tablesAvailable = null;
        this.serverName = null;
        this.tableType = null;
    }

     //getter and setter tablesAvailable
    public String getTablesAvailable() {
        return tablesAvailable;
    }

    public void setTablesAvailable(String tablesAvailable) {
        this.tablesAvailable = tablesAvailable;
    }

    //getter and setter serverName
    public String getServerName() {
        return serverName;
    }
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    //getter and setter tableType
    public String getTableType() {
        return tableType;
    }
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    // custom method informing tables available for reservation
    public String printTablesAvailable() {
        return "We have " + tablesAvailable + " available for reservation";
    }

    //print method
    public void printRest() {
        System.out.println("Welcome to Olive Garden, My name is " + serverName +
                " I will be serving you today. You will seat at " + tableType + " today.");
    }

}
