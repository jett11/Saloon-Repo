package SaloonBE.example.SaloonBE.Model;


public class Header {
    private int id;
    private String logo;
    private String appName;
    private String welcomeText;
    private String mainText;
    private String menu;

    public Header(int id, String logo, String appName, String welcomeText, String mainText, String menu) {
        this.id = id;
        this.logo = logo;
        this.appName = appName;
        this.welcomeText = welcomeText;
        this.mainText = mainText;
        this.menu = menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
