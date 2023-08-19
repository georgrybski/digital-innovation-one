package en.interfaces;

public interface WebBrowser {
    void displayPage(String url);
    void addNewTab(String url);
    void refreshPage();
}