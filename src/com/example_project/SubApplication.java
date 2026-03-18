package com.example_project;

public class SubApplication extends Application {

    public void showExtraFeature() {
        System.out.println("Signup Feature");
    }

    public static void main(String[] args) {
        SubApplication obj = new SubApplication();

        obj.showAppInfo();      
        obj.showExtraFeature(); // subclass method
    }
}