package Assignment6;

import java.util.ArrayList;

public class News implements INews {
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println(this.Title);
        System.out.println(this.PublishDate);
        System.out.println(this.Author);
        System.out.println(this.Content);
        System.out.println(this.AverageRate);
    }

    void Calculate() {
        ArrayList<Integer> RateList = new ArrayList();
        RateList.add(1);
        RateList.add(2);
        RateList.add(3);
        for(Integer rL: RateList) {
            this.AverageRate += rL;
        };
        this.AverageRate =  this.AverageRate/3;
    }

    public static void main(String[] args){
        News new1 = new News();
        new1.Calculate();
        new1.Display();
    }

}

