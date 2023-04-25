package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //Устанавливаем кол-во радиостанций
    @Test
    public void shouldNumberRadioStations() {
        Radio radioStation = new Radio(12);
        assertEquals(12, radioStation.getNumberRadioStations());
    }

    //Устанавливаем кол-во радиостанций меньше мин
    @Test
    public void shouldNumberMinRadioStations() {
        Radio radioStation = new Radio(-1);
        assertEquals(10, radioStation.getNumberRadioStations());
    }


    //Выставили номер радиостанции в пределах max min
    @Test
    public void shouldNewRadioStationNumber() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Выставили номер радиостанции > max
    @Test
    public void shouldNewRadioStationNumberMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Выставили номер радиостанции < min
    @Test
    public void shouldNewRadioStationNumberMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Устанавливаем кол-во станций меньше мининума для второго конструктора
    @Test
    public void shouldNumberOfRadioStationsMin2() {
        Radio radioStation = new Radio(5, -1);
        assertEquals(5, radioStation.getCurrentRadioStationNumber());
    }

    //Номер Max радиостанции изменяется в зависимости от кол-ва радиостанций
    @Test
    public void shouldNumberOfRadioStationsAndMaxRadioNumber() {
        Radio radioStation = new Radio(8, 15);
        assertEquals(14, radioStation.getMaxNumber());
    }

    //Добавление номера радиостанции в пределах max min (нажатие next)
    @Test
    public void shouldNextRadioStationNumber() {
        Radio radioStation = new Radio();
        radioStation.nextRadioStationNumber();
        int expected = 1;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Добавление номера с переходом за пределы max (нажатие next)
    @Test
    public void shouldNextRadioStationNumberMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(9);
        radioStation.nextRadioStationNumber();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Уменьшение номера радиостанции в пределах Max Min (нажатие prev)
    @Test
    public void shouldPrevRadioStationNumber() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(8);
        radioStation.prevRadioStationNumber();

        int expected = 7;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //Уменьшение номера с переходом за пределы min
    @Test
    public void shouldPrevRadioStationNumberMin() {
        Radio radioStation = new Radio();
        radioStation.prevRadioStationNumber();

        int expected = 9;
        int actual = radioStation.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    //    Выставляем уровень громкости > max
    @Test
    public void shouldSetCurrentSoundVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(12);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

    //    Выставляем уровень громкости < min
    @Test
    public void shouldSetCurrentSoundVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(-5);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

    //Увеличение громкости в пределах max min
    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

    //Увеличение громкости с переходом за пределы max
    @Test
    public void shouldIncreaseVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(10);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

    //Уменьшение громкости в пределах max min
    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(5);
        volume.decreaseVolume();

        int expected = 4;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

    //Уменьшение громкости с переходом за пределы min
    @Test
    public void shouldDecreaseVolumeMin() {
        Radio volume = new Radio();
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        assertEquals(expected, actual);
    }

}