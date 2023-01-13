package org.example;
import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
public class Main {
    public static void main(String[] args) {
//        Request newRequest = Request.getInstance("https://foodnetwork.co.uk/collections/italian-family-dinners");
        WebClient webClient = new WebClient();
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        try {
            HtmlPage page = webClient.getPage("https://www.reddit.com/r/AskReddit/");
            System.out.println("Page Title: " + page.getTitleText());
            webClient.getCurrentWindow().getJobManager().removeAllJobs();
            webClient.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world!");
    }
}