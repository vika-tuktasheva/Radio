package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
//выставление значения радиостанции

    //проверка значения в диапазоне
    @Test
    void setCurrentStationInTheRange() {
        Radio radio = new Radio();
        radio.currentStation = 2;
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    //проверка граничных значений > max
    @Test
    void setCurrentStationOverMax() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.setCurrentStation(10);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    //проверка граничных значений < min
    @Test
    void setCurrentStationLowMin() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.setCurrentStation(-1);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


    //следующая станция, значение в диапазоне
    @Test
    void increaseStationInTheRange() {
        Radio radio = new Radio();
        radio.increaseStation(5);

        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    //следующая станция, значение > max
    @Test
    void increaseStationOverMax() {
        Radio radio = new Radio();
        radio.increaseStation(9);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    //предыдущая станция, значение в диапазоне
    @Test
    void decreaseStationInTheRange() {
        Radio radio = new Radio();
        radio.decreaseStation(5);

        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    //предыдущая станция, значение < min
    @Test
    void decreaseStationLowMin() {
        Radio radio = new Radio();
        radio.decreaseStation(0);

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    //выставление уровня громкости
//проверка значения в диапазоне
    @Test
    void setCurrentVolumeInTheRange() {
        Radio radio = new Radio();
        radio.currentVolume = 2;
        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //проверка граничных значений > max
    @Test
    void setCurrentVolumeOverMax() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        radio.setCurrentVolume(12);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //проверка граничных значений < min
    @Test
    void setCurrentVolumeLowMin() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        radio.setCurrentVolume(-1);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //увеличение громкости, значение в диапазоне
    @Test
    void increaseVolumeInTheRange() {
        Radio radio = new Radio();
        radio.increaseVolume(5);

        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    //увеличение громкости, значение > max
    @Test
    void increaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.increaseVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //уменьшение громкости, значение в диапазоне
    @Test
    void decreaseVolumeInTheRange() {
        Radio radio = new Radio();
        radio.decreaseVolume(5);

        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //уменьшение громкости, значение < min
    @Test
    void decreaseVolumeLowMin() {
        Radio radio = new Radio();
        radio.decreaseVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}