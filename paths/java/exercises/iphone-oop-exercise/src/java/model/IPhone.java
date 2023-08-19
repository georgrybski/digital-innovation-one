package en.model;

import en.interfaces.*;

public class IPhone implements MusicPlayer, PhoneDevice, WebBrowser {

    // Implementations for MusicPlayer interface
    public void play() {
        // Code to play music
    }

    public void pause() {
        // Code to pause music
    }

    public void selectSong(String song) {
        // Code to select song
    }

    // Implementations for PhoneDevice interface
    public void call(String number) {
        // Code to make a call
    }

    public void answer() {
        // Code to answer a call
    }

    public void startVoiceMail() {
        // Code to start voice mail
    }

    // Implementations for WebBrowser interface
    public void displayPage(String url) {
        // Code to display a page
    }

    public void addNewTab(String url) {
        // Code to add a new tab
    }

    public void refreshPage() {
        // Code to refresh page
    }
}