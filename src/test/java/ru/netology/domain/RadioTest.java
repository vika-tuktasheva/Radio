package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
//выставление значения радиостанции

    //проверка значения в диапазоне
    @Test
    void setCurrentStationInTheRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    //проверка граничных значений > max
    @Test
    void setCurrentStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    //проверка граничных значений < min
    @Test
    void setCurrentStationLowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    //следующая станция, значение в диапазоне
    @Test
    void increaseStationInTheRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.increaseStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    //следующая станция, значение > max
    @Test
    void increaseStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    //предыдущая станция, значение в диапазоне
    @Test
    void decreaseStationInTheRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.decreaseStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    //предыдущая станция, значение < min
    @Test
    void decreaseStationLowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    //выставление уровня громкости
//проверка значения в диапазоне
    @Test
    void setCurrentVolumeInTheRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //проверка граничных значений > max
    @Test
    void setCurrentVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //проверка граничных значений < min
    @Test
    void setCurrentVolumeLowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //увеличение громкости, значение в диапазоне
    @Test
    void increaseVolumeInTheRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //увеличение громкости, значение > max
    @Test
    void increaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //уменьшение громкости, значение в диапазоне
    @Test
    void decreaseVolumeInTheRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //уменьшение громкости, значение < min
    @Test
    void decreaseVolumeLowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}