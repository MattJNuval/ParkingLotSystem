public class Account {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS

    //region INSTANCES
    private String username;
    private String password;
    private AccountStatus status;
    //endregion

    //region CONSTRUCTORS
    public Account() {
    }

    public Account(String username, String password, AccountStatus status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }
    //endregion

    //region GETTERS AND SETTERS
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
    //endregion

    //endregion
}
