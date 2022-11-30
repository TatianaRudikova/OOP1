package ru.netology;

public class Radio {
    private int currentRadioStationNumber; //текущая радиостанция
    private int currentSoundVolume; //текущий звук
    private int numberRadioStations = 10; //кол-во радиостанций
    int minNumber = 0;
    int maxNumber = numberRadioStations - 1;
    int minVolume = 0;
    int maxVolume = 10;


    public Radio () {
    }

    public Radio(int currentRadioStationNumber, int numberRadioStations){
        this.currentRadioStationNumber = currentRadioStationNumber;
        if (numberRadioStations > 0) {
            this.numberRadioStations = numberRadioStations;
            this.maxNumber = numberRadioStations - 1;
        }
    }

    public Radio (int numberRadioStations){
        if (numberRadioStations > 0) {
           this.numberRadioStations = numberRadioStations;
            this.maxNumber = numberRadioStations - 1;
        } return;
    }


    public int getNumberRadioStations() {
        return numberRadioStations;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    //Выставляем номер радиостанции
    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minNumber) {
            return;
        }
        if (newRadioStationNumber > maxNumber) {
            return;
        } else {
            currentRadioStationNumber = newRadioStationNumber;
        }
    }

    //Увеличение на 1 станцию
    public void nextRadioStationNumber() {
        if (currentRadioStationNumber < maxNumber) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        if (currentRadioStationNumber == maxNumber) {
            currentRadioStationNumber = minNumber;
        }
    }

    //Уменьшение на 1 станцию
    public void prevRadioStationNumber() {

        if (currentRadioStationNumber > minNumber) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        if (currentRadioStationNumber == minNumber) {
            currentRadioStationNumber = maxNumber;
        }
    }

    //Выставляем уровень громкости
    public void setCurrentSoundVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        } else {
            currentSoundVolume = newVolume;
        }
    }

    //Увеличение громкости на 1
    public void increaseVolume() {
        if (currentSoundVolume < maxVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        }
        if (currentSoundVolume == maxVolume) {
            return;
        }
    }

    //Уменьшение громкости на 1
    public void decreaseVolume() {

        if (currentSoundVolume > minVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        }
        if (currentSoundVolume == minVolume) {
            return;
        }
    }

}