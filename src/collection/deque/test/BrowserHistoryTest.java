package collection.deque.test;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        browser.visitPage("youtube");
        browser.visitPage("google");
        browser.visitPage("facebook");

        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);

        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
        String currentPage3 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage3);
        String currentPage4 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage4);
    }
}
